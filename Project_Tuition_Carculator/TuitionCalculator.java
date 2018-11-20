import javax.swing.JOptionPane;

// Create method to class
class Departments{
	double consolidatedFee;
	double TechnologyFee;
	double StudentActivityFee;
}

class Tuition{
	double MarticulatedStudent;
	double NonMarticulatedStudent;
	double OutofStateResident;
	double ForeignStudent;
	double NonDegreeStudent;
}
// -------- MAIN CLASS ----------------------
class TuitionCalculator{
	public static void main(String[] args) {

    // Create objects that will be using variables in class
    Departments SocialSciences = new Departments();
    Departments Business = new Departments();
    Departments Music = new Departments();
    Departments EngneeringTechnology = new Departments();

    Departments FullTime = new Departments();
    Departments PartTime = new Departments();

    Tuition  FT_Resident = new Tuition();
    Tuition  PT_Resident = new Tuition();
    Tuition  FT_PT_NonResident = new Tuition();

    // assign values to fields in each department, FT/PT status, Residency status
   	SocialSciences.consolidatedFee = 12;
	Business.consolidatedFee =13;
	Music.consolidatedFee = 15;
	EngneeringTechnology.consolidatedFee = 11;

    FullTime.TechnologyFee = 125;
    PartTime.TechnologyFee = 62.5;
    FullTime.StudentActivityFee = 62.85;
    PartTime.StudentActivityFee = 16.83;

    FT_Resident.MarticulatedStudent = 2400.00;
    FT_Resident.NonMarticulatedStudent = 265.00;
    FT_PT_NonResident.OutofStateResident = 320.00;
    FT_PT_NonResident.ForeignStudent = 320.00;
    FT_PT_NonResident.NonDegreeStudent = 420.00;

    PT_Resident.MarticulatedStudent = 210.00;
    PT_Resident.NonMarticulatedStudent = 265.00;

    // initialize variables and get the value of each method
    double consolFee1, consolFee2, consolFee3, consolFee4;

    consolFee1 = SocialSciences.consolidatedFee;
    consolFee2 = Business.consolidatedFee;
    consolFee3 = Music.consolidatedFee;
    consolFee4 = EngneeringTechnology.consolidatedFee;

    double FTtech, PTtech, FTact, PTact;
    FTtech = FullTime.TechnologyFee;
    PTtech = PartTime.TechnologyFee;
    FTact = FullTime.StudentActivityFee;
    PTact = PartTime.StudentActivityFee;

    double Tuition1, Tuition2, Tuition3, Tuition4, Tuition5, Tuition6, Tuition7;

    Tuition1 =  FT_Resident.MarticulatedStudent;
    Tuition2 =  PT_Resident.MarticulatedStudent;
    Tuition3 =  FT_Resident.NonMarticulatedStudent;
    Tuition4 =  PT_Resident.NonMarticulatedStudent;
    Tuition5 =  FT_PT_NonResident.OutofStateResident;
    Tuition6 =  FT_PT_NonResident.ForeignStudent;
    Tuition7 = 	FT_PT_NonResident.NonDegreeStudent;



    // ask the student to enter the first and last name
    String enter_studentname = JOptionPane.showInputDialog("Enter your username");

    // ask the student to select department
    String enter_department = JOptionPane.showInputDialog("Select your department\n "
    		+ "Enter 1 for SocialSciences\n "
    		+ "Enter 2 for Business\n "
    		+ "Enter 3 for Music\n "
    		+ "Enter 4 for EngneeringTechnology");
    int departNum = Integer.parseInt(enter_department);


   	String departName = ""; String majorName = ""; double consolFee = 0;

   	// IF-ELSE statement to ask the student to select major
    if (departNum == 1) {

    	departName = "Social Sciences";
    	consolFee = consolFee1;

    	String enter_major = JOptionPane.showInputDialog("There are 3 majors in Social Sciences Department \n"
    			+ "1. Criminal Justice \n"
    			+ "2. Communication Studies \n"
    			+ "3. Sociology \n\n"
    			+ "Select your major by number (1 to 3)");
    	int majorNum = Integer.parseInt(enter_major);

	    	if (majorNum == 1) {
	    		majorName = "Criminal Justice";
	    	}
	    	else if (majorNum == 2) {
	    		majorName = "Communication Studies";
	    	}
	    	else if (majorNum == 3) {
	    		majorName = "Sociology ";
	    	}
    }
    else if (departNum == 2) {

    	departName = "Business";
    	consolFee = consolFee2;

    	String enter_major = JOptionPane.showInputDialog("There are 3 majors in Business Department \n "
    			+ "1. Accounting \n "
    			+ "2. Marketing \n "
    			+ "3. Management \n\n"
    			+ "Select your major by number (1 to 3)");
    	int majorNum  = Integer.parseInt(enter_major);

	    	if (majorNum == 1) {
	    		majorName = "Accounting";
	    	}
	    	else if (majorNum == 2) {
	    		majorName = "Marketing";
	    	}
	    	else if (majorNum == 3) {
	    		majorName = "Management";
	    	}
    }
    else if (departNum == 3) {

    	departName = "Music ";
    	consolFee = consolFee3;

    	String enter_major = JOptionPane.showInputDialog("There are 3 majors in Music Department \n "
    			+ "1. Music Education \n "
    			+ "2. Music in Performance/Composition \n "
    			+ "3. Audio Music Technology \n\n "
    			+ "Select your major by number (1 to 3)");
    	int majorNum = Integer.parseInt(enter_major);
	    	if (majorNum == 1) {
	    		majorName = "Music Education";
	    	}
	    	else if (majorNum == 2) {
	    		majorName = "Music in Performance/Composition";
	    	}
	    	else if (majorNum == 3) {
	    		majorName = "Audio Music Technology";
	    	}
    }
    else if (departNum == 4) {

    	departName = "Engineering Technology";
    	consolFee = consolFee4;

    	String enter_major = JOptionPane.showInputDialog("There are 3 majors in Engineering Technology Department \n "
    			+ "1. Engineering Science \n "
    			+ "2. Architectural Technology \n "
    			+ "3. Electronic Engineering Technology \n\n"
    			+ "Select your major by number (1 to 3)");
    	int majorNum = Integer.parseInt(enter_major);
	    	if (majorNum == 1) {
	    		majorName = "Engineering Science";
	    	}
	    	else if (majorNum == 2) {
	    		majorName = "Architectural Technology";
	    	}
	    	else if (majorNum == 3) {
	    		majorName = "Electronic Engineering Technology";
	    	}
    }
    else {
    	JOptionPane.showMessageDialog( null, "Invalid Number. Try again ", "Departments", JOptionPane.INFORMATION_MESSAGE );
    }

    // Ask the student residency status
    String enter_RegidentStatus = JOptionPane.showInputDialog("What is your Residency status?\n "
    		+ "Enter 1 if you are Residents of New York City \n "
    		+ "Enter 2 if your are Non-Residents of New York City");
    int ResidentStatus = Integer.parseInt(enter_RegidentStatus);


    double tuition = 0; double TechFee = 0; double ActivityFee = 0;

    // IF-ELSE statement for asking the student's residency Status
    if (ResidentStatus == 1) {
    	String enter_enrollStatus = JOptionPane.showInputDialog("Select your Enrollment Status \n"
    			+ "Enter 1 if you are Marticulated Student \n"
    			+ "Enter 2 if you are Non-Marticulated Student (Non-Degree) \n");
    	int enrollStatus = Integer.parseInt(enter_enrollStatus);

    	// Ask the student how many major/minor courses that the student is taking
        String enter_MajorCourse = JOptionPane.showInputDialog("How many Major courses are you taking?");
        int MajorCourse = Integer.parseInt(enter_MajorCourse);

        String enter_ElectiveCourse = JOptionPane.showInputDialog("How many Elective courses are you taking?");
        int ElectiveCourse = Integer.parseInt(enter_ElectiveCourse);

        int TotalCredits = 3*MajorCourse +2*ElectiveCourse;

        	// IF-ELSE statement for checking the student's Enrollment Status
	        if (enrollStatus==1) {

	        	if(TotalCredits >= 12) {
	        		tuition = Tuition1;
	        		TechFee = FTtech;
		        	ActivityFee = FTact;
	        	}
	        	else if(TotalCredits < 12) {
	        		tuition = Tuition2*TotalCredits;
	        		TechFee = PTtech;
	        		ActivityFee = PTact;
	        	}

	        }
	        else if (enrollStatus==2)  {

	        	if(TotalCredits >= 12) {
	        		tuition = Tuition3*TotalCredits;
	        		TechFee = FTtech;
		        	ActivityFee = FTact;
	        	}
	        	else if(TotalCredits < 12) {
	        		tuition = Tuition4*TotalCredits;
	        		TechFee = PTtech;
	        		ActivityFee = PTact;
	        	}
	        }
	        else {
	          	JOptionPane.showMessageDialog( null, "Invalid Number. Try again ", "Enrollment Status", JOptionPane.INFORMATION_MESSAGE );
	        }

    }
    else if(ResidentStatus == 2) {
    	String enter_enrollStatus = JOptionPane.showInputDialog("Select your Enrollment Status \n"
    			+ "Enter 1 if you are Out-of-State Student \n"
    			+ "Enter 2 if you are Foreign Student \n"
    			+ "Enter 3 if you are Non-Marticulated Student (Non-Degree) \n");
    	int enrollStatus = Integer.parseInt(enter_enrollStatus);

        String enter_MajorCourse = JOptionPane.showInputDialog("How many Major courses are you taking?");
        int MajorCourse = Integer.parseInt(enter_MajorCourse);
        String enter_ElectiveCourse = JOptionPane.showInputDialog("How many Elective courses are you taking?");
        int ElectiveCourse = Integer.parseInt(enter_ElectiveCourse);

        int TotalCredits = 3*MajorCourse +2*ElectiveCourse;

        if (enrollStatus==1) {
        	tuition = Tuition5*TotalCredits;

        	if(TotalCredits >= 12) {
        		TechFee = FTtech;
	        	ActivityFee = FTact;
        	}
        	else  if(TotalCredits < 12) {
        		TechFee = PTtech;
        		ActivityFee = PTact;
        	}
        }
        else if (enrollStatus==2) {
        	tuition = Tuition6*TotalCredits;

        	if(TotalCredits >= 12) {
        		TechFee = FTtech;
	        	ActivityFee = FTact;
        	}
        	else  if(TotalCredits < 12) {
        		TechFee = PTtech;
        		ActivityFee = PTact;
        	}
        }
        else if (enrollStatus==3) {
        	tuition = Tuition7*TotalCredits;

        	if(TotalCredits >= 12) {
        		TechFee = FTtech;
	        	ActivityFee = FTact;
        	}
        	else  if(TotalCredits < 12) {
        		TechFee = PTtech;
        		ActivityFee = PTact;
        	}
        }
        else {
          	JOptionPane.showMessageDialog( null, "Invalid Number. Try again ", "Enrollment Status", JOptionPane.INFORMATION_MESSAGE );
        }
    }

    // Calculate total tuition and fee cost for the student
    double TotalTuitionFees = 0;
    TotalTuitionFees = consolFee + tuition + TechFee + ActivityFee;

    JOptionPane.showMessageDialog(null, "Thank you '"+ enter_studentname +"' for choosing the department of '"+departName +"'. \n"+
  			"The total tuition and fee for the major in '"+ majorName +"' is $" +TotalTuitionFees+"\n\n"+
  			"The break of the tuition is: \n"+
  			"Cost for major and elective courses is $ "+tuition+"\n"+
  			"Consolidated fee for major is $ "+consolFee+"\n"+
  			"Technology Fee $ "+ TechFee+"\n"+
  			"Student Activity fee $ "+ ActivityFee+"\n"+
  			"Total Tuition and fee cost $ "+TotalTuitionFees, "CalculationResult", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);

  } // end of main method
} // end of class Project2Kim
