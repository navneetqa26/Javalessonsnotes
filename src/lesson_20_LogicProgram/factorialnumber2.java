package lesson_20_LogicProgram;

public class factorialnumber2 {

	public static void main(String[] args) {
	
		int num = 5;		
		int factorial = 1;
		
		while(num >= 1)
		{
			factorial = factorial*num;
			num--;
		}
		
		System.out.println(factorial);
		
}
}
