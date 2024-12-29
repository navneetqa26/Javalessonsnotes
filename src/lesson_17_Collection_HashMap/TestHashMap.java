package lesson_17_Collection_HashMap;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		System.out.println(students);
		
		
		students.put(201, "Raman");
		students.put(202, "Amit");
		students.put(203, "Amitav");
		students.put(204, "Ramit");
		students.put(205, "GurAmit");
		students.put(201, "Gourav");
		
		System.out.println(students);
		
		System.out.println(students.size());
		
		System.out.println(students.get(202));
		
		students.remove(202);
		students.remove(204, "Ramit");
		
		System.out.println(students);
		
		System.out.println(students.containsKey(207));
		
		System.out.println(students.containsValue("Rakesh"));
		
		
		

	}
	

}
