//Chapter 3, pg 167, Case 1a
//Filename: CarlysEventPriceWithMethods.java
//Programmer: Griffin Corriher
//Date modified: 10/05/20

import java.util.Scanner;
public class CarlysEventPriceWithMethods
{   
   public static void main(String[] args)
   {

      //Calls Methods
      int guestAmount = guestAmount();
      companyMotto();
      eventPrice(guestAmount);


   }
   //guestAmount Method
   public static int guestAmount()
   {
   
      int guests;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("How many guests are attending the party?");
      guests = keyboard.nextInt();
      
      return guests;
      
   }
   //companyMotto Method
   public static void companyMotto()
   {
      System.out.println("*************************************************");
      System.out.println("* Carly's makes the food that makes it a party. *");
      System.out.println("*************************************************");

   }
   
   
   //eventPrice Method
   public static void eventPrice(int guestAmount)
   {

      double price = 35;
      double eventPrice;
      boolean largeEvent = (guestAmount >= 50);
      //compute price of event
      eventPrice = guestAmount*price;
      
      //display price
      System.out.println(guestAmount + " people are attending the event, and the price per guest is $" + price + "." + " Total event price is: $" + eventPrice + "." + " Is this a large event? " + largeEvent);
      
   }
   
}   