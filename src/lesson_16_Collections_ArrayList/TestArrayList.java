package lesson_16_Collections_ArrayList;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> students = new ArrayList<>();
		System.out.println(students);
		
		students.add("Pankaj");
		students.add("Kamal");
		
		
		students.add(0, "Rahul");
		System.out.println(students);
		
		students.remove(0);
		System.out.println(students);

	}

}
