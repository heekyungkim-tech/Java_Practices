//Heekyung Kim @10/2/18
// Program description: Create a program that will ask the user to enter two numbers and display the sum of them in a dialog box
//
// import the java optional package that has the dialog box
import javax.swing.JOptionPane;
//
public class Kim{
  public static void main(String args[]){


      String message="My name is : K.Heekyung";
      JOptionPane.showMessageDialog(null, message);

        // declare variables
	  	String firstNumber;
	  	String secondNumber;
	  	int number1, number2, sum;
	  	// read the numbers from the user
	  	firstNumber = JOptionPane.showInputDialog("Enter first integer: "); // input information is a String
	  	secondNumber = JOptionPane.showInputDialog("Enter second integer: "); // input information is a String
	    // convert the input type from String to integer ==> integer.parseIn();
	  	number1 = Integer.parseInt(firstNumber);
	  	number2 = Integer.parseInt(secondNumber);
	  	// add the two integers
	  	sum = number1 + number2;
	  	//
	  	// display result
	  	//
	  	JOptionPane.showMessageDialog(null, "The sum of the first number "+ number1 +" and "+ number2 +" is: "+ sum, "AdditionResult", JOptionPane.ERROR_MESSAGE);


      //activity
	  	String FullName,FirstNum, SecondNum;
	  	double numberOne,numberTwo;
	  	double sum1, difference, product, remainder;
	  	double quotient;

	  	FullName = JOptionPane.showInputDialog("Enter your full name: ");
	  	FirstNum = JOptionPane.showInputDialog("Enter first number: ");
	  	SecondNum = JOptionPane.showInputDialog("Enter second number: ");

	  	numberOne = Integer.parseInt(FirstNum);
	  	numberTwo = Integer.parseInt(SecondNum);

	  	sum1 = numberOne + numberTwo;
	  	difference = numberOne - numberTwo;
	  	product = numberOne * numberTwo;
	  	quotient = numberOne / numberTwo;
	  	remainder = numberOne % numberTwo;

	  	JOptionPane.showMessageDialog(null, "My name is: "+ FullName +"\n" +
	  			"\t\t\t The entered number is:  "+ numberOne +" and "+ numberTwo +"\n" +
	  			"\t\t\t The sum is: "+ sum1 +"\n"+
	  			"\t\t\t The difference is: "+ difference +"\n"+
	  			"\t\t\t The product is: "+ product +"\n"+
	  			"\t\t\t The quotient is: "+ quotient +"\n"+
	  			"\t\t\t The remainder is: "+ remainder +"\n", "CalculationResult", JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
        } // end of main method
} // end of class Kim
