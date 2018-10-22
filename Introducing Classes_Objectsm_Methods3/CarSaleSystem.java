import javax.swing.JOptionPane;

//Create method to class CarTypes
class CarTypes{
  int milesRate;
  int carMile;
  int SalesPrice(){
    return milesRate*carMile;	// return the SalesPrice for a given CarTypes
  }// end method SalesPrice()
}// end of class CarTypes
//--------------------------------------------------------------
//Create the class with the main method
class CarSaleSystem{
  public static void main(String arg[]){

    String enter_Username = JOptionPane.showInputDialog("Enter your username: ");

    String enter_carType = JOptionPane.showInputDialog("Which car do you want to sell?\n Enter 1 for Nissan\n Enter 2 for Toyota\n Enter 3 for Hyundai");
    int carNum = Integer.parseInt(enter_carType);

    String enter_carMile = JOptionPane.showInputDialog("enter the car's miles that the car has already: ");
    int Miles = Integer.parseInt(enter_carMile);

	CarTypes Nissan = new CarTypes();
	CarTypes Toyota = new CarTypes();
	CarTypes Hyundai = new CarTypes();

    int price1, price2, price3;

    // assign values to fields in Nissan, Toyota,Hyundai
    Nissan.milesRate = 50;
    Toyota.milesRate = 40;
    Hyundai.milesRate = 60;

    Nissan.carMile = Miles;
    Toyota.carMile = Miles;
    Hyundai.carMile = Miles;

    // get the value of Sales Price
    price1 = Nissan.SalesPrice();
    price2 = Toyota.SalesPrice();
    price3 = Hyundai.SalesPrice();

    // output based on the choice of carType
    if (carNum == 1) {
    	System.out.println("Thank you "+ enter_Username + "\n"
    			+ "The car that you want to sell is: Nissan \n"
    			+ "The sales price for the car is: $" + price1);
    }
    else if (carNum ==2) {
    	System.out.println("Thank you "+ enter_Username + "\n"
    			+ "The car that you want to sell is: Toyota \n"
    			+ "The sales price for the car is: $" + price2);
    }else
    	System.out.println("Thank you "+ enter_Username + "\n"
    			+ "The car that you want to sell is: Hyundai \n"
    			+ "The sales price for the car is: $" + price3);

  } // end of main method
} // end of class CarTypes
