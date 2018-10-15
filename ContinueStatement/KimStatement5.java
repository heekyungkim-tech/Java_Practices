// by Heekyung Kim @ Oct 9, 2018
// Activity 5: Continuing Statement with the next iteration of a loop p189

import javax.swing.JOptionPane;

public class KimStatement5 {
  public static void main( String args[])
  {
    String output ="";
    int count;

    for (count = 1; count <=10; count ++ ){   // loop 10 times

      if ( count == 5 )  // if count is 5,
      continue;   		 // skip remaining code in loop

      output += count + " ";

    } // end for

    output += "\nUsed continue to skip printing 5";
    JOptionPane.showMessageDialog( null , output );

    System.exit(0); // terminate application

  } // end main
} // end class BreakTest
