// by Heekyung Kim @ Oct 9, 2018
// Activity 4: Terminating a loop with Break Statement p188

import javax.swing.JOptionPane;

public class KimStatement4 {
  public static void main( String args[])
  {
    String output ="";
    int count;

    for (count = 1; count <=10; count ++ ){ //loop 10 times

      if ( count == 5 ) // if count is 5,
      break; 			// terminate loop

      output += count + " ";

    } // end for

    output += "\nBroke out of loop at count = " + count;
    JOptionPane.showMessageDialog( null , output );

    System.exit(0); // terminate application

  } // end main
} // end class BreakTest
