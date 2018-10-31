//------OBJECT ARRAY-------
class Book{
  String title;
  String author;
  int pubDate;
  //--------constructor-------
  Book(String t, String a, int d){
    title = t;
    author = a;
    pubDate = d;
  }
  //--------method----------
  void show(){
    System.out.print("\n"+ title);
    System.out.print(" is written by: " + author);
    System.out.print(" in the year: " + pubDate);
  }
}
//---------MAIN CLASS--------
class BookDemo{
	public static void main(String args[]) {
		// Create a new array named books with 3 items
		Book books[] = new Book[2];
		// input information for each book in array Book
		books[0] = new Book("Java: a beginner's Guide", "Schildt", 2018);
		books[1] = new Book("Phyton programming", "Smith Smith", 2016);
		for(int i=0; i<books.length; i++) {
			books[i].show();
		}
	}
}
