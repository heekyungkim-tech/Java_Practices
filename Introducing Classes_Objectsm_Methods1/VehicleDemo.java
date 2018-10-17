/*By: Heekyung Kim Oct 16, 1028 - Class activity 5
Example 4 - methods with returning values
*/
// Create method to class Vehicle
class Vehicle{
  int passangers;
  int fuelcap;
  int mpg;
  // a method that returns an integer
  int range(){
    // in range method we are going to calculate range = fuelcap*mpg and Display
    return fuelcap*mpg;
  } // end method range()
} // end of class vehicle
// --------------------------------------------------
//Create the class with the main method
class VehicleDemo{
	public static void main(String args[]){
	  Vehicle minivan = new Vehicle(); // creating an object named "minivan that will be using the passenger, fuelcap, and mpg int"
	  Vehicle sportcar = new Vehicle();
  /* assign values to each integers in class Vehivle. You will use the dot (.) operator to link the name of an object
  with the name of the member in the used class */
	  minivan.passangers = 8;
	  minivan.fuelcap = 2;
	  minivan.mpg = 6;
  //
	  sportcar.passangers = 4;
	  sportcar.fuelcap = 10;
	  sportcar.mpg = 6;
  // -------------------------------------------------------
  // use if else statement to check which range is greater
	  if (minivan.range() > sportcar.range()) {
		  System.out.println("Minivan range is greater than sportcar!");
	  }
	  else if (minivan.range() > sportcar.range()) {
		  System.out.println("Minivan range is less than sportcar!");
	  } else
		  System.out.println("Minivan range is equal to sportcar!");
	} // end main method
} // end VehicleDemo
