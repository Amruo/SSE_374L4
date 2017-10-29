package OrderDiagram;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;


public class OrderApplication {
	
	private boolean createOrder(Date Date) {
		Order newOrder = new Order(Date, 29.9, 201000);
		return true;
	}
	
	// importing catalogue
	// reading the text file 
	private boolean importCatalogue(Product[] product) throws FileNotFoundException {
		 try {
		Scanner fileIn = new Scanner(new File("Product.csv")); //read file
		String firstLine = fileIn.nextLine();
		Pattern p = Pattern.compile(",");

        for(int i =0;i<10;i++){
            String newName = fileIn.next();
            int newID = fileIn.nextInt();
            Double newPrice = fileIn.nextDouble();
            product[i]=new Product(newName,newPrice,newID);                
            fileIn.nextLine();  
	}
		 }
		 catch(FileNotFoundException ex) {
	            System.out.println("File does not exist");                
	        }
		return false;
	 }
	 

public static void main(String [] args) throws FileNotFoundException {
	
	// creating an object and new product with size of 10
	OrderApplication newObject = new OrderApplication();
	Product[] newProduct = new Product[10];
	
	// import to catalogue 
	 newObject.importCatalogue(newProduct);
	 
	 // create a new order 
	 boolean newOrder = newObject.createOrder(null);
	 OrderLine o = new OrderLine(newProduct, 2, 10.5);

     }
}

