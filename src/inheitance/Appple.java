package inheitance;

public class Appple extends fruit {
	String color;
	String taste;
	String shape;
	
	Appple(){}

	public Appple(String color, String taste, String shape,String name,String type,double price,double weight,String origine
			) {
	
		this.color = color;
		this.taste = taste;
		this.shape = shape;
		
		this.name = name;
		this.origine = origine;
		this.type = type;
		this.price = price;
		this.weight = weight;
	}
	public void displayApple() {
	

		System.out.println("color: "+color);
		System.out.println("taste: "+taste);
		System.out.println("shape: "+shape);
		displayFruit();
		
		
		
	}
	
	
	
	
	

}
