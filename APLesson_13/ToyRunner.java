public class ToyRunner{
	
	public static void main(String [] args){
		AFigure figure = new AFigure("GI Joe");
		Car toyCar = new Car("Mustang");
		
		System.out.println(figure.toString()+"\n"+toyCar.toString());
		
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store.toString()+"\n"+store.getMostFrequentType()+" - - "+store.getMostFrequentToy());	}
}