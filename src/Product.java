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
	
	
	public String getName(String s) {
		return s;
	}
	
	public double getPrice(double d) {
		return d;
	}
	
	public int getProductID(int i) {
		return i;
	}
}
