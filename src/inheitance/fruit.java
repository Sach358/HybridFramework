package inheitance;

public class fruit {
	String name;
	String origine;
	String type;
	double price;
	double weight;
	
	fruit( ){}

        fruit(String name, String origine, String type, double price, double weight) {
		
		this.name = name;
		this.origine = origine;
		this.type = type;
		this.price = price;
		this.weight = weight;
	}
	public void displayFruit() {

		System.out.println( "name: " + name);
		System.out.println( "origine: " + origine);
		System.out.println( "type: " + type);
		System.out.println( "price: " + price);
		System.out.println( "weight: " + weight);
		
	}
	

}
