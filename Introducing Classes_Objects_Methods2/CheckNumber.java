/* By Heekyung Kim @ Oct 16 Class activity 5
Example 5) methods with arguments: The program will ask the user to enter a number
and check if it is even or odd*/
import javax.swing.JOptionPane;
// Create a class to check if a number is even
class check_number{
  // this class will have a method that check the input number "x".
  // if "x" is even, return a boolean expression "true"
  boolean isEven(int x){
    if(x % 2 == 0){
      return true;
    }
    else
      return false;
  } // end isEven method
} // end checkNumber class
//---------------------------------------------------
//
class CheckNumber{
  public static void main(String arg[]){
    check_number textNumber = new check_number();
    String enter_number = JOptionPane.showInputDialog("Enter a number: ");
    int number1 = Integer.parseInt(enter_number);
    // check if the entered number is an even number ==> if else
    if (textNumber.isEven(number1)) {
    	System.out.println(number1 + " is even!");
    } else
    	System.out.println(number1 + " is not even!");

  } // end of main method
} // end of class CheckNumber
