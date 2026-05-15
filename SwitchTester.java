import java.util.Scanner;


class SwitchTester {
 public static void main(String args[]) {
	Scanner myScanner = new Scanner(System.in);
	String month = myScanner.next();
	switch (month) {
		case "Jan" -> System.out.println("Winter, new year new me!");
		case "Feb" , "Dec" , "Nov" , "Oct" -> System.out.println("Winter");
		case "Mar" , "Apr" , "May" -> System.out.println("Spring");
		case "Jun" , "Jul"  -> System.out.println("Summer");
		case "Aug"  -> System.out.println("Fall, Summer vacation is over!");
		case "Sep"  -> System.out.println("Fall");
		default -> System.out.println("mate this ain't a month");	
	}
 } 
 }
 