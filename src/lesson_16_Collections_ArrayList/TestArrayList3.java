package lesson_16_Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> students = new ArrayList<>();
		ArrayList<String> teachers = new ArrayList<>();
				
		
		students.add("Pankaj");
		students.add("Kamal");
		
		teachers.add("Amit");
		teachers.add("Rohit");
		
		students.addAll(teachers);
		
		Collections.sort(students);
		
		System.out.println(students);
		
		Collections.reverse(students);
		
		System.out.println(students);
		
		System.out.println(students.get(0));
		
		

	}

}
