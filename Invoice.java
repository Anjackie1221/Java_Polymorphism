/**
 * @author Junjie Xu
 * @version 1.0
 * @see java.lang.Object
 * @since 11.0.15
 */

//This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass

public class Invoice implements Payme {

private String partNumber; 
private String partDescription;
private int quantity;
private double pricePerItem;

//four-argument constructor
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}

//set part number
public void setPartNumber(String part) {
 partNumber = part; 
}

//get part number
public String getPartNumber() {
 return partNumber;
}

//set description
public void setPartDescription(String description) {
 partDescription = description; 
}

//get description
public String getPartDescription() {
 return partDescription;
}

//set quantity
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

//get quantity
public int getQuantity() {
 return quantity;
}

//set price per item
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; 
}

//get price per item
public double getPricePerItem() {
 return pricePerItem;
}

//return String representation of Invoice object
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}
}


