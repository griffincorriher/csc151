//Chapter 4, Order Entry Problem
//Filename: Order.java
//Programmer: Griffin Corriher
//Date modified: 10/16/20

import java.time.*;

public class Order
{   
   LocalDate today = LocalDate.now();
   
   //input variables
   
   private String customerName;
   private String item;
   private int itemQty;
   private double itemPrice;
   
   //calculated variables
   private double orderTotal;
   private String orderType;
   
   //constants
   private String customerAddress;
   public double deliveryCharge;
   
   //setters
   public void setCustomerName(String customerName)
   {
      this.customerName = customerName;
   }
      public void setItem(String item)
   {
      this.item = item;
   }
      public void setItemQty(int itemQty)
   {
      this.itemQty = itemQty;
   }
      public void setItemPrice(double itemPrice)
   {
      this.itemPrice = itemPrice;
   }
   
   //getters
      public String getCustomerName()
   {
      return customerName;
   }
      public String getItem()
   {
      return item;
   }
      public int getItemQty()
   {
      return itemQty;
   }
      public double getItemPrice()
   {
      return itemPrice;
   }
    
   //Order type Constructors   
   public Order()
   {
      orderType = "Pickup";
      this.customerName = customerName;
      this.item = item;      
      this.itemQty = itemQty;
      this.itemPrice = itemPrice;      
   }
    
   public Order(String customerAddress)
   {
      orderType = "Delivery";
      this.customerName = customerName;
      this.customerAddress = customerAddress;
      this.item = item;      
      this.itemQty = itemQty;
      this.itemPrice = itemPrice;
      this.deliveryCharge = deliveryCharge;
      
   }
      
   public void calculateOrderTotal(int itemQty, double itemPrice, double deliveryCharge)
   {
   double orderTotal;
   orderTotal = itemQty*itemPrice + deliveryCharge;
   this.orderTotal = orderTotal;
   }
   
   public void calculateOrderTotal(int itemQty, double itemPrice)
   {
   double orderTotal;
   orderTotal = itemQty*itemPrice;
   this.orderTotal = orderTotal;
   }
   
   public void displayOrderData(String customerName, String item, int itemQty, double itemPrice, double deliveryCharge)
   {
      System.out.println("Order date: " + today);
      System.out.println("Name: " + customerName);
      System.out.println("Order type: " + orderType);
      System.out.println("Delivery location: " + customerAddress);
      System.out.println("Item: " + item);
      System.out.println("Price: $" + itemPrice);
      System.out.println("Quantity: " + itemQty);
      System.out.println("Delivery charge: $" + deliveryCharge); 
      System.out.println("Order total: $" + orderTotal);
      System.out.println("");
   }   
   
   public void displayOrderData(String customerName, String item, int itemQty, double itemPrice)
   {
      System.out.println("Order date: " + today);
      System.out.println("Name: " + customerName);
      System.out.println("Order type: " + orderType);
      System.out.println("Item: " + item);
      System.out.println("Price: $" + itemPrice);
      System.out.println("Quantity: " + itemQty); 
      System.out.println("Order total: $" + orderTotal);
      System.out.println("");
   
   }   

}   
