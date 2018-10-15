// by Heekyung Kim @ Oct 9, 2018
// Activity 3: Summing integers with the for statement p176-177

import javax.swing.JOptionPane;

public class KimStatement3 {
  public static void main( String args[])
  {
    int total=0; // initialize Sum

    // total even integers from 2 through 100
    for (int number = 2; number <= 100; number +=2)
      total += number;

    // display results
    JOptionPane.showMessageDialog( null, "The sum is "+ total, "Total Even Integers from 2 to 100", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0); //terminate application

  } // end main
} // end class Sum
