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
		if(statement.length()<=1){
			response = "Say something, please.";
			return response;
		}
		if (findKeyword(statement, "no", 0) >= 0)
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

		else
		{
			response = getRandomResponse();
		}
		return response;
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
