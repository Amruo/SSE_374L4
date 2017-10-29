package OrderDiagram;

// new class called OrderLine that has 3 private varibles and four public methods
public class OrderLine {
	
	private int quantity;
	private double price;
	private Product product;
	
	// constructor for the object 
	public OrderLine(Product product[], int quantity, double price) {
		this.product = product[10];
		this.quantity = quantity;
		this.price = price;
	}
	
	// method for the product 
	public Product getProduct(Product a) {
		return a;
	}
	
	// method to get the quantity
	public int getQuantiy() {
		return quantity;
	}
	
	// method to get the price 
	public double getPrice() {
		return price * quantity;
	}
}
