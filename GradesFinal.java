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
   double[] labs = new double[3];
   double[] projects = new double [3];
   double[] tests = new double[3];
   private double labAvg = 0;
   private double projectAvg = 0;
   private double testAvg = 0;
   private double finalExam;
   private double courseGrade;
   private char courseLetter;
   private boolean pass = courseGrade >= 60; 
   private LocalDateTime today;
   public static int numStudents = 0;
   public boolean gradeEntered;
   int i = 0;

   //Grade weights
   public double lab = .30;
   public double project = .30;
   public double test = .30;
   public double exam = .1;
  
   
   //Number of students entered
      public GradesFinal()
   {
      labs[i] = 0;
      projects[i] = 0;
      tests[i] = 0;
      labAvg = 0;
      projectAvg = 0;
      testAvg = 0;
      numStudents = numStudents + 1;
   }
   
      public GradesFinal(double[] labs, double[]projects, double[] tests, double finalExam)
   {
      this.labs = labs;
      this.projects = projects;
      this.tests = tests;
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
   public void setLabAvg(double[] labs)
   {
      this.labs = labs;
   }
   public void setProjectAvg(double[] projects)
   {
      this.projects = projects;
   }   
   public void setTestAvg(double[] tests)
   {
      this.tests = tests;
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
   public double[] getLabAvg()
   {
      return labs;
   }
   public double[] getProjectAvg()
   {
      return projects;
   }   
   public double[] getTestAvg()
   {
      return tests;
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
   public void calculateCourseGrade()
   {
      for (i = 0; i < labs.length; i++)
      {
         labAvg += labs[i] / labs.length;
      }
      
      for (i = 0; i < projects.length; i++)
      {
         projectAvg += projects[i] / projects.length;
      } 
      
      for (i = 0; i < tests.length; i++)
      {
         testAvg += tests[i] / tests.length;
      }   
      
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
      System.out.println("LABS");
      for (i = 0; i < 3; i++)
      {
         System.out.println("  Lab " + (i + 1) + ": " + labs[i]);
      }
      System.out.println("Lab average: " + labAvg);
      System.out.println("");     
      System.out.println("PROJECTS");
      for (i = 0; i < 3; i++)
      {            
         System.out.println("  Project " + (i + 1) + ": " + projects[i]);
      }
      System.out.println("Project average: " + projectAvg);
      System.out.println("");        
      System.out.println("TESTS");
      for (i = 0; i < 3; i++)
      {            
         System.out.println("  Test " + (i + 1) + ": " + tests[i]);
      }   
      System.out.println("Test average: " + testAvg);
      System.out.println("");                
      System.out.println("FINAL EXAM : " + finalExam);
      System.out.println("COURSE GRADE: " + courseGrade);
      System.out.println("LETTER GRADE: " + courseLetter);
      System.out.println("Student passing: " + pass);                        
   } 
                                  
}   
