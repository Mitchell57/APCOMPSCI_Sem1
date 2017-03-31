public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.toLowerCase();
		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */
		 
		if(statement.length()<=1){
			response = "Say something, please.";
			return response;
		}


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		else if (findKeyword(statement, "no", 0) >= 0)
		{
			response = "Why so negative?";
			return response;
		}

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("turtle") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (statement.indexOf("robinette") >= 0) response = "He sounds like a pretty dank teacher";
		
		// Responses which require transformations
		else if (findKeyword(statement, "i want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}


		else	
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

		
			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{ 
				response = getRandomResponse();
			}
		}
		return response;
		
	}
	
	/**
	* Take a statement with "I want to <something>." and transform it into
	* "What would it mean to <something>?"
	* @param statement the user statement, assumed to contain "I want to"
	* @return the transformed statement
	*/
	private String transformIWantToStatement(String statement)
	{
	  /**
	   * trim the statement
	   * variable lastChar = last character in statement
	   * if lastChar is a period...
	   *        remove the last character from statement
	   *
	   * Set new int psn to the result from...
	   *        findKeyword() method @param statement, goal is "I want to "
	   * Set new String restOfStatement to the rest of statement after the
	   * "I want to ".
	   * /
	   * return "What would it mean to" + restOfStatement; **/
	   statement = statement.trim();
	   char lastChar = statement.charAt(statement.length()-1);
	   if(lastChar == '.') statement = statement.substring(0, statement.length()-1);
	   int psn = findKeyword(statement, "i want to", 0);
	   int psnRest = psn+10;
	   String restOfStatement = statement.substring(psnRest)+"?";
	   
	   return "What would it mean to " + restOfStatement;
	}


	/**
	* Take a statement with "you <something> me" and transform it into
	* "What makes you think that I <something> you?"
	* @param statement the user statement, assumed to contain "you" followed by "me"
	* @return the transformed statement
	*/
	private String transformYouMeStatement(String statement)
	{
	  /**
	   * trim the statement
	   * Set new String lastChar to the last character in statement
	   * if lastChar is a period...
	   *        remove the period
	   *
	   * Set new int psnOfYou to the result of findKeyword
	   *        @param statement and "you"
	   * Set new int psnOfMe to the result of findKeyword
	   *      @param statement, "me", and psnOfYou + 3
	   * Set new String restOfStatement to the rest of statement after "You" + 3,
	   * and before "me".
	   *
	   * return "What makes you think that I " + restOfStatement + "you?"
	   * */
	   statement = statement.trim();
	   char lastChar = statement.charAt(statement.length()-1);
	   if(lastChar == '.') statement = statement.substring(0, statement.length()-1);
	   
	   int psnOfYou = findKeyword(statement, "you") + 3;
	   int psnOfMe = findKeyword(statement, "me");
	   
	   String restOfStatement = statement.substring(psnOfYou, psnOfMe);
	   
	   return "What makes you think that I" + restOfStatement + "you?";
	   
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		int psn = phrase.indexOf(goal, startPos);
		String before = " ";
		String after = " ";
		
		while(psn+goal.length()<=phrase.length() && psn>=0){
			if(psn > 0){
				before = phrase.substring(psn-1, psn);
			}
			if(psn+goal.length() < phrase.length()-1){
				after = phrase.substring(psn+goal.length(), psn+goal.length()+1);
			}
			if(before.compareTo("a") < 1 && after.compareTo("z") < 1) return psn;
			
			psn = phrase.indexOf(goal, psn+1);
		}
			
		
		return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
