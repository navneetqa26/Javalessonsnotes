package lesson_20_LogicProgram;

public class PelindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 135531;
		int numforCalc = num;
		int reverse = 0;
		
					
		while(numforCalc > 0)	
		{
			reverse = reverse*10 + numforCalc%10;
			numforCalc = numforCalc/10;
			
		}
		
		System.out.println(reverse);
		System.out.println(num);
		if(num == reverse)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}

	}

}
