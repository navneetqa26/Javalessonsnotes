package lesson_11_Arrays;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] studentList = {12, 13, 18, 20, 21, 22, 30};
		String[] subjects = {"Math", "Eng", "SST"};
 		
		System.out.println(studentList[4]);
		System.out.println(subjects[1]);
		
		int arrayLenght = studentList.length;
		System.out.println(arrayLenght);
		
		for(int i = 0; i<arrayLenght; i++)
		{
			System.out.println(studentList[i]);
		}
		
		

	}

}
