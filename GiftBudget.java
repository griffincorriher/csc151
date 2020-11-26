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
      //Variables
      int year = YearMonth.now().getYear();
      String[] gifts = new String[3];
      double[] giftPrices = new double[3];
      double totalCost = 0;
      int i = 0;
      
      //Input user name      
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your name");
      String name = input.nextLine();
      
      //Enter the names of the gifts
      System.out.println("Please enter the name of your three gifts");  

      for (i = 0; i < 3; i++)
      {
      System.out.println("What is gift number " + (i + 1) + " ?");    
      gifts[i] = input.nextLine();
      }
         
      //Enter the prices of the gift   
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
      
      //Display information
      System.out.println(name + "'s gift budget\n");
      System.out.printf("%-15s%s\n", "Gift", "Price $");
      System.out.println("----------------------");       

      for (i = 0; i < gifts.length; i++)
      {
         System.out.printf("%-15s%.2f\n",gifts[i], giftPrices[i]);
      }
      
      //Display total cost
      System.out.println("\nThe total budget for " + year + " is: $" + totalCost);     
   }
}

