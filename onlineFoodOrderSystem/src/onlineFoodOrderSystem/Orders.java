package onlineFoodOrderSystem;

public class Orders {
 double amount;
 String paymentStatus;
 int distance;
  public void checkOrderType() {
	  
	  if(amount >=1000) {
		  System.out.println("Premium order");
		  
	  }
	  else if(amount >=500 && amount < 1000) {
		  System.out.println("Standard order");
	  }
	  else {
		  System.out.println("Basic order");
	  }
	  }
	  
		  
  
  public void checkDeliveryCharge() {
	  if(amount >=800) {
		  System.out.println("Free delivery");
	  }
	  else if(amount >= 300 && amount < 800) {
		  System.out.println("Delivery charge 50 rs");
	  } else {
		  System.out.println("Delivery charge 100 rs");
	  }
  }
   
  public void checkPaymentStatus() {
	  
	  if(paymentStatus == "Paid") {
		  System.out.println("Order Confirmed");
	  }
	  else {
		  System.out.println("Payment pending");
	  }
  }
  public void DeliveryTime() {
	  if(distance <= 3) {
		  System.out.println("Delivery in 20 min");
	  }
	  else if(distance <= 7 && distance >3) {
		  System.out.println("delivery in 40 mins");
	  }
	  else {
		  System.out.println("delivery in 60 mins");
	  }
	  
	  
  }
  public void checkDiscount() {
	  if(amount >= 1200) {
		  System.out.println("discount 20%");
		  
	  }
	  
  }
  public void runOrderSystem() {
	  
  }
 
}
