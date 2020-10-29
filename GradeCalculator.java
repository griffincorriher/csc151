//Project 2, Grade calculating program
//GradeCalculator.java
//Written by: Griffin Corriher
//Date modified: 10/24/20

import java.util.Scanner;
import java.time.*;

public class GradeCalculator
{
   public static void main(String[] args)
   {
      //variables
      String studentFirst;
      String studentLast;
      String studentId;
      double labAvg;
      double projectAvg;
      double testAvg;
      double finalExam;
      LocalDateTime today;
      
      // Instantiate new objects
      Scanner input = new Scanner(System.in);
      Grades student1 = new Grades();
      Grades student2 = new Grades();
      
      //Display Greeting
      displayGreeting();
      
      //Request input for student1
      studentFirst = inputStudentFirst();
      studentLast = inputStudentLast();      
      studentId = inputStudentId();
      testAvg = inputTestAvg();
      labAvg = inputLabAvg();
      projectAvg = inputProjectAvg();  
      finalExam = inputFinalExam();
      today = grabToday();
      
      student1.setStudentFirst(studentFirst);
      student1.setStudentLast(studentLast);
      student1.setStudentId(studentId);
      student1.setTestAvg(testAvg);      
      student1.setLabAvg(labAvg);
      student1.setProjectAvg(projectAvg);
      student1.setFinalExam(finalExam);
      student1.setToday(today);
      
      //Request input for student2
      studentFirst = inputStudentFirst();
      studentLast = inputStudentLast();      
      studentId = inputStudentId();
      testAvg = inputTestAvg();
      labAvg = inputLabAvg();
      projectAvg = inputProjectAvg();
      finalExam = inputFinalExam();
      today = grabToday();
      
      student2.setStudentFirst(studentFirst);
      student2.setStudentLast(studentLast);
      student2.setStudentId(studentId);
      student2.setTestAvg(testAvg);      
      student2.setLabAvg(labAvg);
      student2.setProjectAvg(projectAvg);
      student2.setFinalExam(finalExam);  
      student2.setToday(today);
      
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
   }
   
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
}   