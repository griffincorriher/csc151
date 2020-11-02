//Chapter 5, PatientEntry program
//Filename: PatientEntry.java
//Author: Griffin Corriher
//Date: 10/31/2020

import java.util.*;
public class PatientPortal
{
   public static void main(String[] args)
   {

      final double highTemp = 100.4;
      
      System.out.println("Welcome to the Medical Center Patient Portal");
      System.out.println("");
      Scanner input = new Scanner(System.in);
      System.out.println("Do you have a temperature?");
      System.out.println("Enter: 1 for yes, 2 for no");
      String answer = input.nextLine();
      
      switch(answer)
      {
         //User responds yes
         case "1":
         {
            System.out.println("Please enter your temperatures for the last three days.");
            System.out.println("");
            
            //User inputs temperatures
            System.out.println("Enter first temperature"); 
            Double temperature1 = input.nextDouble();
            System.out.println("Enter second temperature"); 
            Double temperature2 = input.nextDouble();
            System.out.println("Enter third temperature"); 
            Double temperature3 = input.nextDouble();
            
            //Compare temperatures against each other
            if(temperature1 >= temperature2 && temperature1 >= temperature3)
               System.out.println("Your highest temperature was " + temperature1 + "F");
            else if (temperature2 >= temperature1 && temperature2 >= temperature3)
               System.out.println("Your highest temperature was " + temperature2 + "F");
            else
               System.out.println("Your highest temperature was " + temperature3 + "F");               
            
            //Compare highest temperature against highTemp
            if(temperature1 >= highTemp || temperature2 >= highTemp || temperature3 >= highTemp)
               System.out.println("You have a fever. Please get a virus test immediately");
            else
               System.out.println("You do not have a temperature");
            break;
         }
         
         //User responds no
         case "2":
         {
            System.out.println("Enter your symptoms separated by commas."); 
            String symptoms = input.nextLine();
            System.out.println("Your symptom(s), " + symptoms + ", have been reported to your doctor and you will be contacted within 24 hours.");
            break;
         }
         
         //User response is invalid
         default:
         {
             System.out.println("Invalid response. Please restart the program.");
         }   
      }
   }
}
   




   
