//Chapter 4, Order Entry Problem
//Filename: OrderCart.java
//Programmer: Griffin Corriher
//Date modified: 10/16/20


import java.util.Scanner;
public class OrderCart
{   
   public static void main(String[] args)
   {
      //variables
      String customerName;
      String customerAddress;
      String item;
      int itemQty;
      double itemPrice;
      double deliveryCharge = 10;
      
      //Display Greeting
      System.out.println("Greetings!");
      
      //scanner object for input
      Scanner input = new Scanner(System.in); 
      
      //Instantiate order class objects      
      Order pickup = new Order();
      Order delivery = new Order("1333 Jake Alexander Blvd S, Salisbury, NC 28146");
            
      //Prompt delivery user for input
      System.out.println("Enter customer Name");
      customerName = input.nextLine();
      System.out.println("Enter item Description");
      item = input.nextLine();
      System.out.println("Enter quantity purchased");
      itemQty = input.nextInt();
      System.out.println("Enter price of the item");
      itemPrice = input.nextInt();
      
      //set delivery user data
      delivery.setCustomerName(customerName);
      delivery.setItem(item);
      delivery.setItemQty(itemQty);
      delivery.setItemPrice(itemPrice);      
      
      //fixes skipping input issue
      input.nextLine();
      
      //Prompt pickup user for input
      System.out.println("Enter customer Name");
      customerName = input.nextLine();
      System.out.println("Enter item Description");
      item = input.nextLine();
      System.out.println("Enter quantity purchased");
      itemQty = input.nextInt();
      System.out.println("Enter price of the item");
      itemPrice = input.nextInt();
      
      //set pickup user data
      pickup.setCustomerName(customerName);
      pickup.setItem(item);
      pickup.setItemQty(itemQty);
      pickup.setItemPrice(itemPrice);             
                        
      //Call calculate method
      delivery.calculateOrderTotal(delivery.getItemQty(), delivery.getItemPrice(), deliveryCharge);
      pickup.calculateOrderTotal(pickup.getItemQty(), pickup.getItemPrice());
            
      //Call display method
      delivery.displayOrderData(delivery.getCustomerName(), delivery.getItem(), delivery.getItemQty(), delivery.getItemPrice(), deliveryCharge);
      pickup.displayOrderData(pickup.getCustomerName(), pickup.getItem(), pickup.getItemQty(), pickup.getItemPrice());         
   }
   
}   