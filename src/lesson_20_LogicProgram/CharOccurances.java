package lesson_20_LogicProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject = "seleniumautomationtesting";
		
		char[] charArray = subject.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : charArray)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
			
		}
		
		System.out.println(map);
		
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "  Occured " + " " + entry.getValue() + " times");
			
		}
	
	}

}
