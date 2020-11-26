//Chapter 8, Hands on Programming Exercise
//Filename: GiftBudget.java
//Author: Griffin Corriher
//Date: 11/26/2020

import java.util.*;
import java.time.*;
public class GiftBudget
{
   public static void main(String[] args)
   {
      int year = YearMonth.now().getYear();
      String[] gifts = new String[3];
      double[] giftPrices = new double[3];
      double giftPrice = 0;
      double totalCost = 0;
      int i = 0;
      String QUIT = "999";
            
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your name");
      String name = input.nextLine();
      
      System.out.println("Please enter the name of your three gifts or enter 999 when you are done");  

         for (i = 0; i < 3; i++)
         {
         System.out.println("What is gift number " + (i + 1) + " ?");    
         gifts[i] = input.nextLine();
            if (gifts[i] == "999")
            {
               break;
            }
         }
         
      System.out.println("Please enter the price your "+ gifts.length + " gifts");
      
      for (i = 0; i < gifts.length; i++)
      {   
         System.out.println("What is the price of the " + gifts[i]);
         giftPrices[i] = input.nextDouble();      
      }
      
      for (i = 0; i < gifts.length; i++)
      {
         totalCost += giftPrices[i];
      }
      
      //Display
      System.out.println(name + "'s gift budget\n");
      System.out.printf("%-15s%s\n", "Gift", "Price $");
      System.out.println("----------------------");       

      for (i = 0; i < gifts.length; i++)
      {
         System.out.printf("%-15s%.2f\n",gifts[i], giftPrices[i]);
      }
      
      System.out.println("\nThe total budget for " + year + " is: $" + totalCost);
      
      

      
   }
}
