// by Heekyung Kim @ Oct 9, 2018
// Control Structure: switch statement
// Activity 2: ask the user to input, the Class activity grade,
// and Project 1, 2, 3, and 4 grade using dialog box.
// After it, you are going to calculate the overall grade as:
// overallGrade = 0.2*classActivity + 0.2*project1 + 0.2*project2 + 0.2*project3 + 0.2*project4
// After you calculate the overallGrade, you are going to use switch statement and display the GPA

import javax.swing.JOptionPane; // Import the Java API that has the dialog box.

public class KimStatement2{
  public static void main(String args[]) {
	
	
    String classActivityString = JOptionPane.showInputDialog("Enter your class activity grade: ");
    double classActivity = Integer.parseInt(classActivityString);
    
    String project1String = JOptionPane.showInputDialog("Enter your project 1 grade: ");
    double project1 = Integer.parseInt(project1String);
    
    String project2String = JOptionPane.showInputDialog("Enter your project 2 grade: ");
    double project2 = Integer.parseInt(project2String);
    
    String project3String = JOptionPane.showInputDialog("Enter your project 3 grade: ");
    double project3 = Integer.parseInt(project3String);
    
    String project4String = JOptionPane.showInputDialog("Enter your project 4 grade: ");
    double project4 = Integer.parseInt(project4String);
    
    
    double overallGrade = 0.2*classActivity + 0.2*project1 + 0.2*project2 + 0.2*project3 + 0.2*project4;
    System.out.println("Your grade is " + overallGrade);
    
    switch( overallGrade ) {
    	case(overallGrade >= 96 && overallGrade <= 100) :
    		System.out.println("A");
    	break;
    	case(overallGrade >= 90 && overallGrade < 96) :
    		System.out.println("A-");
    	break;
    	case(overallGrade >= 87 && overallGrade < 90) :
    		System.out.println("B+");
    	break;
    	case(overallGrade >= 84 && overallGrade < 87) :
    		System.out.println("B");
    	break;
    	case(overallGrade >= 80 && overallGrade < 84) :
    		System.out.println("B-");
    	break;
    	case(overallGrade >= 77 && overallGrade < 80) :
    		System.out.println("C+");
    	break;
    	case(overallGrade >= 74 && overallGrade < 77) :
    		System.out.println("C");
    	break;
    	case(overallGrade >= 70 && overallGrade < 74) :
    		System.out.println("C-");
    	break;
    	case(overallGrade >= 67 && overallGrade < 70) :
    		System.out.println("D+");
    	break;
    	case(overallGrade >= 64 && overallGrade < 67) :
    		System.out.println("D");
    	break;
    	case(overallGrade >= 60 && overallGrade < 64) :
    		System.out.println("D-");
    	break;
    	case(overallGrade >= 0 && overallGrade < 60) :
    		System.out.println("F. Failure");
    	break;
    	default :
    		System.out.println("Your grade is " + overallGrade);
    	
    }
    
  }
}
