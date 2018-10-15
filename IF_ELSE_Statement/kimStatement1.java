// By: Heekyung Kim @ Oct 9, 2018
// control statement: if and if..else
// Create a program that will ask the user to input a grade from 0 to 100.
// if the grade is between 100 and 90, the overall grade is A
// if the grade is between 89 and 80, the overall grade is B
// if the grade is between 79 and 70, the overall grade is C
// if the grade is between 69 and 60, the overall grade is D
// if the grade is less than 59, the overall grade is F

import javax.swing.JOptionPane; // Import the Java API that has the dialog box.

public class kimStatement1{
  public static void main(String args[]){
    String gradeString = JOptionPane.showInputDialog("Enter the overall grade: "); // ask to user to enter overall grade
    int grade = Integer.parseInt(gradeString); // convert String gradeString into an Integer
    //  control statement if..else
    if (grade>=90 && grade <=100 ){
      JOptionPane.showMessageDialog( null, "The overall grade is A", "class Overall", JOptionPane.INFORMATION_MESSAGE );
    }
    else if (grade>=80 && grade <=89 ){
        JOptionPane.showMessageDialog( null, "The overall grade is B", "class Overall", JOptionPane.INFORMATION_MESSAGE );
      }
    else if (grade>=70 && grade <=79 ){
        JOptionPane.showMessageDialog( null, "The overall grade is C", "class Overall", JOptionPane.INFORMATION_MESSAGE );
      }
    else if (grade>=60 && grade <=69 ){
        JOptionPane.showMessageDialog( null, "The overall grade is D", "class Overall", JOptionPane.INFORMATION_MESSAGE );
      }
    else if (grade>=0 && grade <=59 ){
        JOptionPane.showMessageDialog( null, "The overall grade is F", "class Overall", JOptionPane.INFORMATION_MESSAGE );
      }
    else {
      	JOptionPane.showMessageDialog( null, "Better Try again! ", "class Overall", JOptionPane.INFORMATION_MESSAGE );
    }
    System.exit(0);
  }
}
