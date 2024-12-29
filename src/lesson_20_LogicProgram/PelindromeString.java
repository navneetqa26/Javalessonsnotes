package lesson_20_LogicProgram;

public class PelindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "pankaj";		
		String reverse = "";
		
		int strLength = name.length();
		
		for(int i = strLength-1; i>=0; i-- )
		{
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(reverse);
		
		if(name.equals(reverse))
		{
			System.out.println("It is Pelindrome String");
		}
		else
		{
			System.out.println("It is NOT Pelindrome String");
		}
		

	}

}
