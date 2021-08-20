public class Calendar {
	public static void main(String[] args) {
		printCalendar(31,1);

	}
	public static void printCalendar(int numberOfDays, int firstSunday){
		printFirstWeek(1);
		restWeeks(1);
	}
	public static void printFirstWeek(int firstSunday){
        for (int weekCount = 1; weekCount >=1; weekCount--){
            for (int weekOneDays = 7; weekOneDays >= 1; weekOneDays--){
                System.out.print(firstSunday - weekOneDays );
            }
        }

	}
	public static void restWeeks(int firstSunday){
	for (int weekCount = 1; weekCount>=1;weekCount--){
	    System.out.print(firstSunday);
	    for (int weekOneDays = 7; weekOneDays >= 1; weekOneDays--){
	    	System.out.print(firstSunday - weekOneDays);
			}
    	}

	}
	public static void printLastWeek(){

	}
	public static void printBlankDays(){

	}


}