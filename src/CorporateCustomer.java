package OrderDiagram;

// this class is inherited from Customer class
public class CorporateCustomer extends Customer  {

	private String contactName;
	
	// initialize the contactName to null 
	public CorporateCustomer() {
		contactName = null;
	}
	
	// setting the contact name
	public void setContactName(String newContactName) {
		contactName = newContactName;
	}

	// getting the contact name
	public String getContactName() {
		return contactName;
	}
}
