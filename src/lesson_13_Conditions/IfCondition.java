package lesson_13_Conditions;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 15;
		
		if(age > 18)
		{
			System.out.println("Eligible to Vote");
		}
		else if(age > 15)
		{
			System.out.println("NOT Eligible to Vote yet");
		}
		else
		{
			System.out.println("Wait for few years to Vote");
		}

	}

}
