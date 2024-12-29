package lesson_12_Loops;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] studentList = {12, 13, 18, 20, 21, 22, 30};
		String[] students = {"Pankaj", "Rajesh", "Mohit", "Raman"};
		
		for(int s : studentList)
		{
			System.out.println(s);
		}
		
		for(String s1: students)
		{
			System.out.println(s1);
		}

	}

}
