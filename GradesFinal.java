//Project Final, Grade final
//GradesFinal.java
//Written by: Griffin Corriher
//Date modified: 12/5/20

import java.util.Scanner;
import java.time.*;

public class GradesFinal
{
   
   private String studentFirst;
   private String studentLast;
   private String studentId;
   private double labAvg;
   private double projectAvg;
   private double testAvg;
   private double finalExam;
   private double courseGrade;
   private char courseLetter;
   private boolean pass = courseGrade >= 60; 
   private LocalDateTime today;
   public static int numStudents = 0;
   public boolean gradeEntered;

   //Grade weights
   public double lab = .30;
   public double project = .30;
   public double test = .30;
   public double exam = .1;
  
   
   //Number of students entered
      public GradesFinal()
   {
      labAvg = 0;
      projectAvg = 0;
      testAvg = 0;
      finalExam = 0;
      courseGrade = 0;
      numStudents = numStudents + 1;
   }
   
      public GradesFinal(double labAvg, double projectAvg, double testAvg, double finalExam)
   {
      this.labAvg = labAvg;
      this.projectAvg = projectAvg;
      this.testAvg = testAvg;
      this.finalExam = finalExam;
   }      
   
   //Setters
   public void setStudentFirst(String studentFirst)
   {
      this.studentFirst = studentFirst;
   }
   public void setStudentLast(String studentLast)
   {
      this.studentLast = studentLast;
   }
   public void setStudentId(String studentId)
   {
      this.studentId = studentId;
   }
   public void setLabAvg(double labAvg)
   {
      this.labAvg = labAvg;
   }
   public void setProjectAvg(double projectAvg)
   {
      this.projectAvg = projectAvg;
   }   
   public void setTestAvg(double testAvg)
   {
      this.testAvg = testAvg;
   }
   public void setFinalExam(double finalExam)
   {
      this.finalExam = finalExam;
   } 
   public void setCourseGrade(double courseGrade)
   {
      this.courseGrade = courseGrade;
   }      
   public void setPass(boolean pass)
   {
      this.pass = pass;
   }
   public void setToday(LocalDateTime today)
   {
      this.today = today;
   }
   
   //Getters
   public String getStudentFirst()
   {
      return studentFirst;
   }
   public String getStudentLast()
   {
      return studentLast;
   }
   public String getStudentId()
   {
      return studentId;
   }
   public double getLabAvg()
   {
      return labAvg;
   }
   public double getProjectAvg()
   {
      return projectAvg;
   }   
   public double getTestAvg()
   {
      return testAvg;
   }
   public double getFinalExam()
   {
      return finalExam;
   }    
   public double getCourseGrade()
   {
      return courseGrade;
   }
   public boolean getPass()
   {
      return pass;
   }
   public LocalDateTime getToday()
   {
      return today;
   }
       
   //Calculate final course grade
   public void calculateCourseGrade(double labAvg, double testAvg, double projectAvg, double finalExam)
   {
      double courseGrade;
      courseGrade = ( (lab * labAvg) + (test * testAvg) + (project * projectAvg) + (exam * finalExam) );
      this.courseGrade = courseGrade;
      
      if(courseGrade>=90)
         courseLetter = 'A';
      else if(courseGrade>=80 && courseGrade<90)
         courseLetter = 'B';
      else if(courseGrade>=70 && courseGrade<80)
         courseLetter = 'C';
      else if(courseGrade>=60 && courseGrade<70)
         courseLetter = 'D';
      else
         courseLetter = 'F';
      this.courseLetter = courseLetter;
   }
   
   //Determine passing grade
   public void passingGrade()
   {
      boolean pass;
      pass = courseGrade >= 60;
      this.pass = pass;
   }
   
   public void displayGrades()
   {
      System.out.println("");
      System.out.println("Student name: " + studentFirst + " " + studentLast);
      System.out.println("Student ID: " + studentId);
      System.out.println("Test average: " + testAvg);     
      System.out.println("Lab average: " + labAvg);
      System.out.println("Project average: " + projectAvg);
      System.out.println("Final exam : " + finalExam);
      System.out.println("Course grade (numeric): " + courseGrade);
      System.out.println("Course grade (letter): " + courseLetter);
      System.out.println("Student passing: " + pass); 
      System.out.println(""); //Delete "" and add today variable into println to debug and prove it grabs date/time for each student
      System.out.println("The numeric course grade is calculated based on a weighted average: \n Tests = " + test*100 + "%" + "\n Labs = " + lab*100 + "%" + " \n Projects = " + project*100 + "%" + "\n Final Exam = " + exam*100 + "%");                             
                                     
   } 
                                  
}   