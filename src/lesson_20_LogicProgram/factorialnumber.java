package lesson_20_LogicProgram;

public class factorialnumber {

	public static void main(String[] args) {
	
		int num = 5;		
		int factorial = 1;
		
		for(int i = num; i >= 1; i--)
		{
			factorial = factorial*i;
			
		}
		
		System.out.println(factorial);
		
}
}
