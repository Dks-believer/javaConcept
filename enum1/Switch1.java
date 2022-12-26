package enum1;

import java.util.Scanner;

public class Switch1 {

		enum Day{
			
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the day");
		Day day=Day.valueOf(sc.next().toUpperCase());
		
		switch(day){
		case SUNDAY:
		System.out.println("sunday,its holiday");
		break;
		case MONDAY:
		System.out.println("monday,week starts");
		break;
		default:
		System.out.println("other day,working day");
		}
		
		}
}
