package OrderDiagram;

public class Product {
	
	private String name;
	private double price;
	private int productID;
	
	public Product(String name, double price, int productID) {
		this.name = name;
		this.price = price;
		this.productID = productID;
	}
	
	// s varible for the name 
	public String getName(String s) {
		return s;
	}
	
	// d varible for the price 
	public double getPrice(double d) {
		return d;
	}
	
	// i varible for the product ID
	public int getProductID(int i) {
		return i;
	}
}
