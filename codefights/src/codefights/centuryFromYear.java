package codefights;

public class centuryFromYear {
	
	static int centuryFromYear(int year) {
	    return ((year % 10) / 10) + 1;
	}

	
	
	public static void main(String[] args) {
		centuryFromYear(1905);
	}
}
