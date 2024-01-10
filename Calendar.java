public class Calendar {	
        static int dayOfMonth = 1;   
        static int month = 1;
        static int year = 1900;
        static int dayOfWeek = 2;     // 1.1.1900 was a Monday
        static int nDaysInMonth = 31; // Number of days in January

        public static void main(String args[]) {
            int GivenYear = Integer.parseInt(args[0]);
            while (year < GivenYear) {
                advance();
            }
            
            while (year < GivenYear + 1) {
                if (dayOfWeek == 1) {
                    System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                } else {
                    System.out.println(dayOfMonth +"/"+month+"/"+year);
                }
                advance();
            }               
         }
        

         private static void advance() {
            
            dayOfMonth++;
            if (dayOfMonth > nDaysInMonth){
                dayOfMonth =1;
                month ++;
                 if (month > 12){
                    month = 1;
                    year ++;
                }
                nDaysInMonth = nDaysInMonth(month, year);
            }
           
            dayOfWeek ++;
            if (dayOfWeek==8) {
                dayOfWeek = 1;
            }
         }
    
             
        private static boolean isLeapYear(int year) {
            boolean leapyear = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
            return leapyear;
        }
         
        private static int nDaysInMonth(int month, int year) {
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
