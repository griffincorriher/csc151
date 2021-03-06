//Project Final, Grade Calculator final
//GradeCalculatorFinal.java
//Written by: Griffin Corriher
//Date modified: 12/5/20

import java.util.Scanner;
import java.time.*;

public class GradeCalculatorFinal
{
   public static void main(String[] args)
   {
      //variables
      String studentFirst;
      String studentLast;
      String studentId;
      double[] labs = new double[3];
      double[] projects = new double[3];
      double[] tests = new double[3];
      int DEFAULT_VALUE = -1;
      double labAvg = DEFAULT_VALUE;
      double projectAvg = DEFAULT_VALUE;
      double testAvg = DEFAULT_VALUE;
      double finalExam = DEFAULT_VALUE;
      LocalDateTime today;
      char choice = 'c';
      char lab = 'l';
      char project = 'p';
      char test = 't';
      char finalEx = 'f';
      char quit = 'q';
      int i = 0;
      
      // Instantiate new objects
      Scanner input = new Scanner(System.in);
      GradesFinal student1 = new GradesFinal();
      GradesFinal student2 = new GradesFinal();
      
      //Display Greeting
      displayGreeting();
   
   //While loop for QUIT PROGRAM function     
   while(choice != 'q' || choice != 'Q')
   {
      //Reset Variables
      int lFinish = 0;
      int pFinish = 0;
      int tFinish = 0;      
   
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
      do
      {
         //Display Menu for Student 1 
         choice = displayMenu();
                                    
         //QUIT PROGRAM
         if(choice == 'q' || choice == 'Q')
            {break;}
            
         //Switch statement Student 1
         switch(choice)
         {
            case 'l':
            case 'L':
            {  
               if(lFinish == 1)
               {
                  System.out.println("\nCategory has already been entered, please select again!\n");
                  break;
               }
               else
               {
                  lFinish = 0;             
                  labs = labDataValidation();
                  student1.setLabAvg(labs);
                  System.out.println("Values Saved!\n");
                  lFinish = 1;
               }
               break;   
            }  
            
            case 'p':
            case 'P':
            {  
               if(pFinish == 1)
               {
                  System.out.println("\nCategory has already been entered, please select again!\n");
                  break;
               }
               else
               {
                  pFinish = 0;             
                  projects = projectDataValidation();
                  student1.setProjectAvg(projects);
                  System.out.println("Values Saved!\n");
                  pFinish = 1;
               }
               break;   
            }     
            
            case 't':
            case 'T':
            {  
               if(tFinish == 1)
               {
                  System.out.println("\nCategory has already been entered, please select again!\n");
                  break;
               }
               else
               {
                  tFinish = 0;             
                  tests = testDataValidation();
                  student1.setTestAvg(tests);
                  System.out.println("Values Saved!\n");
                  tFinish = 1;
               }
               break;   
            }     
            
            case 'f':
            case 'F':
            {  
               finalExam = finalExamDataValidation(finalExam); 
                  if(finalExam>=0){
                  student1.setFinalExam(finalExam);                
                  break;} 
              break;   
            }   
                                   
            default:
            {
               System.out.println("Invalid response");
            }

         }//end student 1 switch  
      }while(finalExam<0 || lFinish != 1 || pFinish != 1 || tFinish != 1);
      //end student 1 loop 
      
      //QUIT PROGRAM
      if(choice == 'q' || choice == 'Q')
         {break;}    
           
      //Reset Variables
      finalExam = DEFAULT_VALUE;
      lFinish = 0;
      pFinish = 0;
      tFinish = 0;           
      
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
      do
      {
         //Display Menu for Student 2 
         choice = displayMenu();
         
         //QUIT PROGRAM
         if(choice == 'q' || choice == 'Q')
            {break;}   
                     
         //Switch statement Student 2
         switch(choice)
         {
            case 'l':
            case 'L':
            {  
               if(lFinish == 1)
               {
                  System.out.println("\nCategory has already been entered, please select again!\n");
                  break;
               }
               else
               {
                  lFinish = 0;             
                  labs = labDataValidation();
                  student2.setLabAvg(labs);
                  System.out.println("Values Saved!\n");
                  lFinish = 1;
               }
               break;   
            }  
            
            case 'p':
            case 'P':
            {  
               if(pFinish == 1)
               {
                  System.out.println("\nCategory has already been entered, please select again!\n");
                  break;
               }
               else
               {
                  pFinish = 0;             
                  projects = projectDataValidation();
                  student2.setProjectAvg(projects);
                  System.out.println("Values Saved!\n");
                  pFinish = 1;
               }
               break;   
            }     
            
            case 't':
            case 'T':
            {  
               if(tFinish == 1)
               {
                  System.out.println("\nCategory has already been entered, please select again!\n");
                  break;
               }
               else
               {
                  tFinish = 0;             
                  tests = testDataValidation();
                  student2.setTestAvg(tests);
                  System.out.println("Values Saved!\n");
                  tFinish = 1;
               }
               break;   
            }
                                    
            case 'f':
            case 'F':
            {  
               finalExam = finalExamDataValidation(finalExam); 
                  if(finalExam>=0){
                  student2.setFinalExam(finalExam);                
                  break;} 
              break;   
            }   
                                   
            default:
            {
               System.out.println("Invalid response");
            }
         }//end Student 2 switch  
      
      }while(finalExam<0 || lFinish != 1 || pFinish != 1 || tFinish != 1);
      //end Student 2 loop
       
      //QUIT PROGRAM
      if(choice == 'q' || choice == 'Q')
         {break;} 
                                  
      //Calculate student grade
      student1.calculateCourseGrade();
      student2.calculateCourseGrade();
       
      //Determine passing grade 
      student1.passingGrade();
      student2.passingGrade(); 
            
      //Display student information
      student1.displayGrades();
      student2.displayGrades();
    break;
    }
    
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
      
      //Display menu
      public static char displayMenu()
      {
         Scanner keyboard = new Scanner(System.in); 
         char choice;
         System.out.println("Please select from the following menu:");
         System.out.println(" Lab" + "\n Project" + "\n Test" + "\n Final Exam" + "\n Quit");
         System.out.println("\nPlease enter your selection now.");
         choice = keyboard.next().charAt(0);
         return choice;
      }
      
      //Lab data validation
      public static double[] labDataValidation()
      {
         double[] labs = new double[3];
         Scanner keyboard = new Scanner(System.in);
         for (int i = 0; i < 3; i++)
         {
            System.out.println("Enter grade for lab # " + (i + 1) + " >>");              
            labs[i] = keyboard.nextDouble();
            if(labs[i] < 0){
               i = -1;
               System.out.println("Invalid grade, please try again!\n");
               }          
         }
         return labs;
      }
      
      //Project data validation
      public static double[] projectDataValidation()
      {
         double[] projects = new double[3];
         Scanner keyboard = new Scanner(System.in);   
         for (int i = 0; i < 3; i++)
         {
            System.out.println("Enter grade for project # " + (i + 1) + " >>");              
            projects[i] = keyboard.nextDouble();
            if(projects[i] < 0){
               i = -1;
               System.out.println("Invalid grade, please try again!\n");
               }             
         }
         return projects;
      } 

      //Test data validation
      public static double[] testDataValidation()
      {
         double[] tests = new double[3];
         Scanner keyboard = new Scanner(System.in);   
         for (int i = 0; i < 3; i++)
         {
            System.out.println("Enter grade for test # " + (i + 1) + " >>");              
            tests[i] = keyboard.nextDouble();
            if(tests[i] < 0){
               i = -1;
               System.out.println("Invalid grade, please try again!\n");
               }             
         }
         return tests;
      } 
      
      //Final exam data validation
      public static double finalExamDataValidation(double finalExam)
      {
         if(finalExam>=0){
            System.out.println("\nCategory has already been entered, please select again!\n");}  
         if(finalExam<0){
         finalExam = inputFinalExam();
            if(finalExam<0){
               System.out.println("\nInvalid grade, please select from the menu again!\n");}
            else{
               System.out.println("\nValue saved!\n");}}                        
         return finalExam;
                           
      }      
}//end class
