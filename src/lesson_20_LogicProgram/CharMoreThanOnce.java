package lesson_20_LogicProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharMoreThanOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject = "SeleniumAutomationTesting";
		subject =subject.toLowerCase();
		
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
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey() + " occured  " + entry.getValue() + " times" );
			}
			
			
		}
	
	}

}
