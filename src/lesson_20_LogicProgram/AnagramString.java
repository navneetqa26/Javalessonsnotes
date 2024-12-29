package lesson_20_LogicProgram;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "silent";
		String s2 = "listen";
		boolean flag = true;
		
		char[] arrs1 = s1.toCharArray();
		char[] arrs2 = s2.toCharArray();
		
		Arrays.sort(arrs1);	
		Arrays.sort(arrs2);
				
		if(Arrays.equals(arrs1, arrs2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		

	}

}
