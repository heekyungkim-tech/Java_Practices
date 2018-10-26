/* week7 - Arrays using Java, Oct 23, 2018
by: Heekyung Kim
*/

//-----------------Arrays-------------------
/*class ArraysString{
  public static void main(String args[]){
    int numbs[]=new int[3]; // new will allow you to create a new array with three values
    numbs[0] = -10;
    numbs[1] = 8;
    numbs[2] = 3;
    System.out.println(numbs[2]);
  }
}*/


//----------Arrays: use for-each loop to display each value is array numbs--------
/*class ArraysString{
	public static void main(String args[]) {
		int numbs[]= {-10,8,3};
		//for-each loop
		// int x is automatically given a value equal to each in the array starting from index "0"
		for(int x:numbs) // set int x = numbs in here
		System.out.println("The value is: "+ x);
	}
}*/


//---------Another way to display all the values in an arraysKim-----------
/*class ArraysString{
	public static void main(String args[]){
		int numbs[]={-10,8,3};
		for (int x=0; x<3; x++)
		System.out.println("The value in index: "+ x +" is ="+ numbs[x]);
	}
}*/


//---------using the length member in array---------------
/*class ArraysString{
  public static void main(String args[]){
    int numbs[]={-10,8,3};
    int numbs2[]= new int[numbs.length]; // create new array named "numbs2" with size that depends on array numbs
    for (int x=0; x<numbs.length; x++) {
    	numbs2[x] = numbs[x]*2;
    System.out.println(numbs[x]+ " "+ numbs2[x]);
  }// end of for loop
 }
}// end of main class
*/



//-----------------find minimum and maximum number in an array---------------
/*class ArraysString{
	public static void main(String args[]) {
		int numbs[]= {-10,8,3};
		int min, max;
		min= max =numbs[0];  //declaring the first value in array numbs as the min and max value
		// check if each value of your array numbs(increasing order) is greater or less than the previous index value

  for(int i=1;i<numbs.length;i++) {
	  if(numbs[i]< min)
		  min = numbs[i];
	  if(numbs[i]> max)
		  max = numbs[i];
  }
  System.out.println("The minimum value is:"+ min);
  System.out.println("The maximum value is:"+ max);
	}
}*/


//-----------Array with Strings---------------------
class ArraysString{
	public static void main(String args[]) {
		String names[]= {"Mary","John", "Lisa"};
		System.out.println("The original names are: ");

		for(String x: names) { // colon here means set x to reference names
			System.out.println(x);
		}

	// replace the name John with James
	names[1]= "James";
		System.out.println("Modified names are:");
		for (String x:names) {
			System.out.println(x);
		}
	}
}
