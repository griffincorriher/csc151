//Chapter 7, Programming exercise
//Filename: StudentEmail.java
//Author: Griffin Corriher
//Date: 11/23/2020

import java.util.*;
public class StudentEmail
{
   public static void main(String[] args)
   {
      //Variables
      String firstName;
      String middleName;
      String lastName;   
      String finalLastName;
      String finalStudentId;
      
      Scanner input = new Scanner(System.in);
      
      //Welcome & collect information
      System.out.println("Welcome to the student email username generator.\n");
      System.out.println("Please enter students first, middle and last name");
      String fullName = input.nextLine();
      System.out.println("Please enter student ID");
      String studentId = input.nextLine();  
      
      //Index spaces
      int firstSpace = fullName.indexOf(" ");
      int secondSpace = fullName.indexOf(" ", firstSpace + 1);
      
      //Build full name and account for no middle name
      firstName = fullName.substring(0, firstSpace);
      if (secondSpace < 0)
      { 
         lastName = fullName.substring(firstSpace+1);
         fullName = firstName + " " + lastName;
      }
         else
         {
          middleName = fullName.substring(firstSpace+1,secondSpace);  
          lastName = fullName.substring(secondSpace+1);
          fullName = firstName + " " + middleName + " " + lastName;
         }
         
      //Build last name for email  
      if (lastName.length() > 10)
         {
         finalLastName = lastName.substring(0,10);
         }
         else
         {
         finalLastName = lastName;
         }
         
      //Build student ID for email
      if (studentId.length() <= 5)
         {
         finalStudentId = studentId;
         }
         else
         {
         finalStudentId = studentId.substring(studentId.length()-5, studentId.length());
         }   
         
      //Determine student email      
      String studentEmail = finalLastName + "." + firstName.charAt(0) + "." + finalStudentId + "@student.rccc.edu";
      
      //Output information 
      output(fullName, studentId, studentEmail);         
   }   
    
   public static void output(String fullName, String studentId, String studentEmail)
   {
      System.out.println("Student Name: " + fullName.toUpperCase());
      System.out.println("Student ID: " + studentId);
      System.out.println("Email address: " + studentEmail.toLowerCase());
   }     
}
