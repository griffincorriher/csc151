//Chapter 3, pg 168, Case 1c
//Filename: EventDemo.java
//Programmer: Griffin Corriher
//Date modified: 10/05/20

import java.util.Scanner;
public class EventDemo
{   
   public static void main(String[] args)
   {
      //Calls Methods
      int guestAmount = guestAmount();
      String eventNumber = eventNumber();
      CarlysEventPriceWithMethods.companyMotto();
      
      //Declare event1 object and return values
      Event event1 = new Event();
      event1.setEventNumber(eventNumber);
      event1.setGuests(guestAmount);     
       
      //pass guestAmount and event1 values and call eventPrice method
      eventPrice(guestAmount, event1);
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
   
   //eventNumber Method
   public static String eventNumber()
   {
      String eventNumber;
      Scanner inputDevice = new Scanner(System.in);
      
      System.out.println("Enter event number");
      eventNumber = inputDevice.nextLine();    
       
      return eventNumber;
   }
      
   //eventPrice Method
   public static void eventPrice(int guestAmount, Event event1)
   {

      double price = 35;
      double eventPrice;
      boolean largeEvent = (guestAmount >= 50);
      //compute price of event
      eventPrice = guestAmount*price;
      
      //display price
      System.out.println("Event number: " + event1.getEventNumber());
      System.out.println("Number of guests: " + event1.getGuests());
      System.out.println("Price per guets is: $" + price);
      System.out.println("Total event price is: $" + eventPrice);
      System.out.println("Is this a large event?: " + largeEvent);
      
   }
   
}   