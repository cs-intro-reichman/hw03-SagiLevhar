/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		// Replace this comment with your code
		for (int i = 1; i <= 12; i++){
			System.out.println("month " + i + " has " + nDaysInMonth(i, year) + " days");  
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    boolean leapyear = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
		return leapyear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		int numDays = 0;
		if (month == 1){
			numDays = 31;
		}
		if (month == 2) {
			if (isLeapYear(year)) {
				numDays = 29;
			} else {
				numDays = 28;
			}
		}
		if (month == 3) {
			numDays = 31;
		}
		if (month == 4) {
			numDays = 30;
		}
		if (month == 5) {
			numDays = 31;
		}
		if (month == 6) {
			numDays = 30;
		}
		if (month == 7){
			numDays = 31;
		}
		if (month == 8){
			numDays = 31;
		}
		if (month == 9){
			numDays = 30;
		}
		if (month == 10){
			numDays = 31;
		}
		if (month == 11){
			numDays = 30;
		}
		if (month == 12){
			numDays = 31;
		}
		return numDays;
	}
}
