/*
//------ CONSTRUCTORS----------
// Example 1) Simple CONSTRUCTOR
class MyClass{
  int x,y;
  String z; // declare variable name first
  MyClass(){ // This is a CONSTRUCTOR for MyClass
    x = 10;
    y= -23;
    z = "lol"; // set the value in CONSTRUCTOR
  } // end CONSTRUCTOR
}// end class MyClass
//
// ------- MAIN CLASS ------------------
class ConsDemo{
  public static void main(String args[]){
    MyClass valueCons = new MyClass(); // call class name, then create an object, link it to MyClass(), the object doesn't have value until we set one to it.
    System.out.println("valueCons has the info of the CONSTRUCTOR, which is:" + valueCons.x);
  }// end main
} // end of class ConsDemo


// Example 2) CONSTRUCTOR with parameters
class MyClass{
  int age;
  String givenName;
  char gender;
  MyClass(int a, String name, char g){
    age=a;
    givenName = name;
    gender = g;
  } // end of constructor
} // end of myClass
//--- Main Class ---------
class ConsDemo{
  public static void main(String args[]){
    MyClass valueCons = new MyClass(15, "Ka", 'F');
    System.out.println("The valueCons has the value of: " + valueCons.givenName + " is a " + valueCons.gender);
  }
}*/


//------------------INHERITANCE-------------------
// Example 3) Calculate the area of a triangle using inheritance. Page 226=228
//--------------Simple class hierarchy------------
class TwoShape{
  private double width, height;
  //
  // In order to use the private variables, you will need to create an accessor methods to return those private variables
  double getWidth() {return width;}
  double getHeight() {return height;}
  // create accessor methods to set the value for the width and height
  void setWidth(double w) {width = w;}
  void setHeight(double h) {height = h;}
  //
  void ShowDim(){
    System.out.println("Width is "+ width + " and the height is "+ height);
  } // end ShowDim
}// end TwoShape
//----------Create a subclass named Triangle for class TwoShape
class Triangle extends TwoShape{
  String style;
  double area(){
    return getWidth()*getHeight()/2;
    }
    void showStyle(){
      System.out.println("Triangle is: " + style);
    }
}
//------MAIN CLASS--------------
class ConsDemo{
  public static void main(String args[]){
	  Triangle t1 = new Triangle();
	  Triangle t2 = new Triangle();
	  // input info to all members in Triangle using the object t1 and t2.
	  t1.setWidth(1.2);
	  t1.setHeight(3.5);
	  t1.style = "Filled";
	  // display information
	  System.out.print("The info for triangle 1 is: ");
	  t1.ShowDim(); // ShowDime is from class TwoShape (parent class of Triangle).
	  System.out.print("The area is: "+ t1.area());
  }
}
