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
              labs = inputLabAvg();
              student1.setLabAvg(labs);

              break;   
            }  
            
            case 'p':
            case 'P':
            {  
              projects = inputProjectAvg();
              student1.setProjectAvg(projects);

              break;   
            }    
            
            case 't':
            case 'T':
            {  
               tests = inputTestAvg();
               student1.setTestAvg(tests);
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
      }while(finalExam<0);
      //end student 1 loop 
      
      //QUIT PROGRAM
      if(choice == 'q' || choice == 'Q')
         {break;}    
           
      //Reset Variables
      labAvg = DEFAULT_VALUE;
      testAvg = DEFAULT_VALUE;
      projectAvg = DEFAULT_VALUE;
      finalExam = DEFAULT_VALUE;   

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
              labs = inputLabAvg();
              student2.setLabAvg(labs);

              break;   
            }  
            
            case 'p':
            case 'P':
            {  
              projects = inputProjectAvg();
              student2.setProjectAvg(projects);

              break;   
            }    
            
            case 't':
            case 'T':
            {  
               tests = inputTestAvg();
               student2.setTestAvg(tests);
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
      
      }while(finalExam<0);
      //end Student 2 loop
       
      //QUIT PROGRAM
      if(choice == 'q' || choice == 'Q')
         {break;} 
                
      //Reset Variables
      labAvg = DEFAULT_VALUE;
      testAvg = DEFAULT_VALUE;
      projectAvg = DEFAULT_VALUE;
      finalExam = DEFAULT_VALUE; 
                       
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

      public static double[] inputLabAvg()
      {
         double[] labs = new double[3];
         Scanner keyboard = new Scanner(System.in);
         int i = 0;     
         for (i = 0; i < 3; i++)
         {
            System.out.println("Enter students #" + (i + 1) + " lab grade >>");               
            labs[i] = keyboard.nextDouble();
         }
         return labs;
      }
      
      public static double[] inputProjectAvg()
      {
         double[] projects = new double[3];
         Scanner keyboard = new Scanner(System.in);
         int i = 0;     
         for (i = 0; i < 3; i++)
         {
            System.out.println("Enter students #" + (i + 1) + " project grade >>");               
            projects[i] = keyboard.nextDouble();
         }
         return projects;
      }
      
      public static double[] inputTestAvg()
      {
         double[] tests = new double[3];
         Scanner keyboard = new Scanner(System.in);
         int i = 0;     
         for (i = 0; i < 3; i++)
         {
            System.out.println("Enter students #" + (i + 1) + " test grade >>");               
            tests[i] = keyboard.nextDouble();
         }
         return tests;
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
      
//       //Lab data validation
//       public static double labDataValidation(double labAvg)
//       {
//          if(labAvg>=0){
//             System.out.println("\nCategory has already been entered, please select again!\n");}        
//          if(labAvg<0){
//          labs[i] = inputLabAvg();
//             if(labAvg<0){
//                System.out.println("\nInvalid grade, please select from the menu again!\n");}
//             else{
//                System.out.println("\nValue saved!\n");}} 
//                             
//          return labAvg;
//                            
//       }
//       
//       //Project data validation
//       public static double projectDataValidation(double projectAvg)
//       {
//          if(projectAvg>=0){
//             System.out.println("\nCategory has already been entered, please select again!\n");}        
//          if(projectAvg<0){
//          inputProjectAvg();
//             if(projectAvg<0){
//                System.out.println("\nInvalid grade, please select from the menu again!\n");}
//             else{
//                System.out.println("\nValue saved!\n");}}                
//          return projectAvg;
//                            
//       } 
//       
//       //Test data validation
//       public static double testDataValidation(double testAvg)
//       {
//          if(testAvg>=0){
//             System.out.println("\nCategory has already been entered, please select again!\n");}  
//          if(testAvg<0){
//          inputTestAvg();
//             if(testAvg<0){
//                System.out.println("\nInvalid grade, please select from the menu again!\n");}
//             else{
//                System.out.println("\nValue saved!\n");}}                
//          return testAvg;
//                            
//       } 
      
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
