//Chapter 3, pg 168, Case 1b
//Filename: Event.java
//Programmer: Griffin Corriher
//Date modified: 10/05/20

import java.util.Scanner;
public class Event
{  
   //public fields
   public final static int price = 35;
   public final static int largeEvent = 50;
   
   //private fields
   private String eventNumber;
   private int guests;
   private double eventPrice;

   
   //Set
   public void setEventNumber(String eventNumber)
   {
   this.eventNumber = eventNumber;
   }

   public void setGuests(int guests)
   {
   this.guests = guests;
   }


   //Get      
   public int getGuests()
   {
   return guests;
   }
   
   public String getEventNumber()
   {
   return eventNumber;
   }
      
   public double getEventPrice()
   {
   return eventPrice;
   }
      
}
