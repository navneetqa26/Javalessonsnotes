package lesson_20_LogicProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String input = "programming";		 
	        StringBuilder result = new StringBuilder();
	        LinkedHashSet<Character> set = new LinkedHashSet<>();

	        for (char c : input.toCharArray()) {
	            set.add(c);
	        }
	        
	        System.out.println(set);

	        for (char c : set) {
	            result.append(c);
	        }

	        System.out.println("String after removing duplicates: " + result);

	}

}
