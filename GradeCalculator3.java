//Project 3, Grade calculating program 3
//GradeCalculator3.java
//Written by: Griffin Corriher
//Date modified: 11/15/20

import java.util.Scanner;
import java.time.*;

public class GradeCalculator3
{
   public static void main(String[] args)
   {
      //variables
      String studentFirst;
      String studentLast;
      String studentId;
      double labAvg = 0;
      double projectAvg = 0;
      double testAvg = 0;
      double finalExam = 0;
      LocalDateTime today;
      char choice = 'c';
      char lab = 'l';
      char project = 'p';
      char test = 't';
      char finalEx = 'f';
      char quit = 'q';
      
      // Instantiate new objects
      Scanner input = new Scanner(System.in);
      Grades3 student1 = new Grades3();
      Grades3 student2 = new Grades3();
      
      //Display Greeting
      displayGreeting();  
   
      //Request personal input for Student 1
      studentFirst = inputStudentFirst();
      studentLast = inputStudentLast();      
      studentId = inputStudentId();

      //Set information for Student 1
      today = grabToday();
      student1.setStudentFirst(studentFirst);
      student1.setStudentLast(studentLast);
      student1.setStudentId(studentId);
      student1.setToday(today);      
                  
      //Student 1 loop                             
      while(student1.getTestAvg()<=0 || student1.getLabAvg()<=0 || student1.getProjectAvg()<=0 || student1.getFinalExam()<=0)
      {
         //Display Menu for Student 1 
         choice = displayMenu();

         //Switch statement Student 1
         switch(choice)
            {
            case 'l':
            {
               labAvg = 0;
               if (student1.getLabAvg()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(labAvg<=0)
               {
                  if (labAvg==0){
                  labAvg = inputLabAvg();}
                     else {System.out.println("Enter the correct grade");
                     labAvg = inputLabAvg(); 
                     break;}
               }
               student1.setLabAvg(labAvg);
               System.out.println("Value saved!");                              
               break;
            }  
            
            case 'p':
            {
               projectAvg = 0;
               if (student1.getProjectAvg()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(projectAvg<=0)
               {
                  if (projectAvg==0){
                  projectAvg = inputProjectAvg();}
                     else {System.out.println("Enter the correct grade");
                     projectAvg = inputProjectAvg(); 
                     break;}
               }
               student1.setProjectAvg(projectAvg);
               System.out.println("Value saved!");                              
               break;
            }  
            
            case 't':
            {
               testAvg = 0;
               if (student1.getTestAvg()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(testAvg<=0)
               {
                  if (testAvg==0){
                  testAvg = inputTestAvg();}
                     else {System.out.println("Enter the correct grade");
                     testAvg = inputTestAvg(); 
                     break;}
               }
               student1.setTestAvg(testAvg);
               System.out.println("Value saved!");                              
               break;
            }  
            
            case 'f':
            {
               finalExam = 0;
               if (student1.getFinalExam()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(finalExam<=0)
               {
                  if (finalExam==0){
                  finalExam = inputFinalExam();}
                     else {System.out.println("Enter the correct grade");
                     finalExam = inputFinalExam(); 
                     break;}
               }
               student1.setFinalExam(finalExam);
               System.out.println("Value saved!");                              
               break;
            }  
            
            case 'q':
            {
                break;         
            }
            
            default:
            {
               System.out.println("Invalid response");
            }
         }//end student 1 switch      
      }//end student 1 loop

      //Request personal input for Student 2
      studentFirst = inputStudentFirst();
      studentLast = inputStudentLast();      
      studentId = inputStudentId();

      //Set information for Student 2
      today = grabToday();
      student2.setStudentFirst(studentFirst);
      student2.setStudentLast(studentLast);
      student2.setStudentId(studentId);
      student2.setToday(today); 
      
      //Student 2 loop                             
      while(student2.getTestAvg()<=0 || student2.getLabAvg()<=0 || student2.getProjectAvg()<=0 || student2.getFinalExam()<=0)
      {         
         //Display Menu for Student 2 
         choice = displayMenu();

         //Switch statement Student 2
         switch(choice)
            {
            case 'l':
            {
               labAvg = 0;
               if (student2.getLabAvg()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(labAvg<=0)
               {
                  if (labAvg==0){
                  labAvg = inputLabAvg();}
                     else {System.out.println("Enter the correct grade");
                     labAvg = inputLabAvg(); 
                     break;}
               }
               student2.setLabAvg(labAvg);
               System.out.println("Value saved!");                              
               break;
            }  
            
            case 'p':
            {
               projectAvg = 0;
               if (student2.getProjectAvg()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(projectAvg<=0)
               {
                  if (projectAvg==0){
                  projectAvg = inputProjectAvg();}
                     else {System.out.println("Enter the correct grade");
                     projectAvg = inputProjectAvg(); 
                     break;}
               }
               student2.setProjectAvg(projectAvg);
               System.out.println("Value saved!");                              
               break;
            }  
            
            case 't':
            {
               testAvg = 0;
               if (student2.getTestAvg()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(testAvg<=0)
               {
                  if (testAvg==0){
                  testAvg = inputTestAvg();}
                     else {System.out.println("Enter the correct grade");
                     testAvg = inputTestAvg(); 
                     break;}
               }
               student2.setTestAvg(testAvg);
               System.out.println("Value saved!");                              
               break;
            }  
            
            case 'f':
            {
               finalExam = 0;
               if (student2.getFinalExam()>0)
                  {System.out.println("Grade has already been entered");
                  break;}
               while(finalExam<=0)
               {
                  if (finalExam==0){
                  finalExam = inputFinalExam();}
                     else {System.out.println("Enter the correct grade");
                     finalExam = inputFinalExam(); 
                     break;}
               }
               student2.setFinalExam(finalExam);
               System.out.println("Value saved!");                              
               break;
            }   
            
            case 'q':
            {
                break;         
            }
            
            default:
            {
               System.out.println("Invalid response");
            }
         }//end student 2 switch      
      }//end student 2 loop
      
      //Calculate student grade
      student1.calculateCourseGrade(student1.getLabAvg(), student1.getProjectAvg(), student1.getTestAvg(), student1.getFinalExam());
      student2.calculateCourseGrade(student2.getLabAvg(), student2.getProjectAvg(), student2.getTestAvg(), student2.getFinalExam());
       
      //Determine passing grade 
      student1.passingGrade();
      student2.passingGrade(); 
            
      //Display student information
      student1.displayGrades();
      student2.displayGrades();
      
      //Thank user
      displayThankYou();   
           
}//end main      
     
   
      //Greeting
      public static void displayGreeting()
      {
         System.out.println("Welcome to the program user!");
         System.out.println("");
      }
      
      //Input methods      
      public static String inputStudentFirst()
      {
         Scanner keyboard = new Scanner(System.in);
         String studentFirst;
         System.out.println("Enter students first name >>");
         studentFirst = keyboard.nextLine();
         return studentFirst;
      }

      public static String inputStudentLast()
      {
         Scanner keyboard = new Scanner(System.in);
         String studentLast;
         System.out.println("Enter students last name >>");
         studentLast = keyboard.nextLine();
         return studentLast;
      }
      
      public static String inputStudentId()
      {
         Scanner keyboard = new Scanner(System.in);
         String studentId;
         System.out.println("Enter student ID >>");
         studentId = keyboard.nextLine();
         return studentId;
      }
      
      public static double inputTestAvg()
      {
         Scanner keyboard = new Scanner(System.in);
         double testAvg;
         System.out.println("Enter students test average >>");
         testAvg = keyboard.nextDouble();
         return testAvg;
      }      
      
      public static double inputLabAvg()
      {
         Scanner keyboard = new Scanner(System.in);
         double labAvg;
         System.out.println("Enter students lab average >>");
         labAvg = keyboard.nextDouble();
         return labAvg;
      }
      
      public static double inputProjectAvg()
      {
         Scanner keyboard = new Scanner(System.in);
         double projectAvg;
         System.out.println("Enter students project average >>");
         projectAvg = keyboard.nextDouble();
         return projectAvg;
      }
      
      public static double inputFinalExam()
      {
         Scanner keyboard = new Scanner(System.in);
         double finalExam;
         System.out.println("Enter students final exam grade >>");
         finalExam = keyboard.nextDouble();
         return finalExam;
      }  
      
      //Grabs current time for each student
      public static LocalDateTime grabToday()
      {
         LocalDateTime today = LocalDateTime.now();
         return today;
      }
      
      //Thank you
      public static void displayThankYou()
      {
         System.out.println("");
         System.out.println("Thank you for using the program!");
      }  
      
      //Menu
      public static char displayMenu()
      {
         Scanner keyboard = new Scanner(System.in); 
         char choice;
         System.out.println("Please select from the following menu:");
         System.out.println(" Lab" + "\n Project" + "\n Test" + "\n Final Exam" + "\n Quit");
         System.out.println("Please enter your selection now.");
         choice = keyboard.next().charAt(0);
         return choice;
      }      
          
}   