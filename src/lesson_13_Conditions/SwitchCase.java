package lesson_13_Conditions;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "Tuesday";
		
		switch(day)
		{
		case "Monday": 
		System.out.println("Go to office for 5 days");
		break;
		
		case "Tuesday": 
		System.out.println("Go to office for 4 days");
		break;
			
		case "Wednesday": 
		System.out.println("Go to office for 3 day");
		break;
		
		default:
		System.out.println("I do not know about days");
		
		
		}

	}

}
