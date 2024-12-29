package lesson_16_Collections_ArrayList;

import java.util.ArrayList;

public class TestArrayList2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> students = new ArrayList<>();
		ArrayList<String> teachers = new ArrayList<>();
				
		students.add("Pankaj");
		students.add("Kamal");
		
		teachers.add("Pankaj");
		teachers.add("Kamal");
		
		if(students.equals(teachers))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		students.addAll(teachers);
		
		System.out.println(students);
		
		
		

	}

}
