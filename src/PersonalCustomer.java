package OrderDiagram;

//this class is inherited from Customer class
public class PersonalCustomer extends Customer {

	private String nameOfCustomer;
	private int  creditCardNumber;
	
	// initial value for the new card
	public PersonalCustomer() {
		creditCardNumber = 0;
	}
	
	// set the name of customer
	public void setNameOfCustomer (String newCustomerName) {
		nameOfCustomer = newCustomerName;
	}
	// setting the number of card 
	public void setCreditCardNumber(int newCardNumber) {
		creditCardNumber = newCardNumber;
	}
	
	// getting the number of card 
	public int getCreditCardNumber{
		return creditCardNumber;
	}
	
	// getting the name of the customer
	public String getNameOfCustomer() {
		return nameOfCustomer;
	}
}
