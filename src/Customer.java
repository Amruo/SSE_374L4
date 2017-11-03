package OrderDiagram;

public class Customer {
	
	private String name;
	private String address;
	private float creditRating;
	private float discountRating;
	
	
	/*
	public Customer(String name, String address, float creditRating,float discountRating) {
		this.name = name;
		this.address = address;
		this.creditRating = creditRating;
		this.discountRating = discountRating;
	}
	*/
	
	// setting Credit Rating
	public void setCreditRating(float newCreditRating) {
		creditRating = newCreditRating;
	}
	// gcr is short for get Credit Rating
	public float getCreditRating() {
		return creditRating;
	}
	
	// setting the name
	public void setName(String newName) {
		name = newName;
	}
	
	// method to get the name 
	public String getName() {
		return name;
	}
	
	// setting the address
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	// addr is short for address
	public String getAddress() {
		return address;
	}
	
	// setting the discount Rating
	public void setDiscountRating(float newDiscountRating){
		discountRating = newDiscountRating;
	}
	
	// gdr is short for getDiscountRating
	public float getDiscountRating() {
		return discountRating;
	}
	
	
}
