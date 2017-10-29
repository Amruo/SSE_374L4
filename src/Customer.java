package OrderDiagram;

public class Customer {
	
	private String name;
	private String address;
	private float creditRating;
	private float discountRating;
	
	
	public Customer(String name, String address, float creditRating,float discountRating) {
		this.name = name;
		this.address = address;
		this.creditRating = creditRating;
		this.discountRating = discountRating;
	}
	
	// gcr is short for get Credit Rating
	public float getCreditRating() {
		return creditRating;
	}
	
	// method to get the name 
	public String getName() {
		return name;
	}
	
	// addr is short for address
	public String getAddress() {
		return address;
	}
	
	// gdr is short for getDiscountRating
	public float getDiscountRating() {
		return discountRating;
	}
}
