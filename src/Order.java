package OrderDiagram;
import java.util.Date;
import java.util.Date;

// new class called Order with five private data feilds and three public methods
public class Order {
	
	private Date dateReceived;
	private double price;
	private int orderID;
	private Customer new_customer;
	private OrderLine[] line;
	
	public Order(OrderLine newOrderLine,Date date, double price,int orderID) {
		this.dateReceived= date;
		this.price = price;
		this.orderID = orderID;
	}
	
	public Date getDateReceived(Date d) {
		return d;
	}
	
	// method to calculate the price (i wanted to include the discount but got some problem so i change it )
	public double calculatePrice( double result) {
		
		Double totalPrice = 0.0;
	   	for (OrderLine ol: line)
	   	{
	   		totalPrice = totalPrice + ol.getPrice();
	   	}

	   	//Adding the discount to the total price
	   	double Price = totalPrice * (1 - new_customer.getDiscountRating());
	   	result = totalPrice * Price; 
	   	
	   	return result;
	}
}
