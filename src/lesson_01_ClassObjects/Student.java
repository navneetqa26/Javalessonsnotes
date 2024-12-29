package lesson_01_ClassObjects;

public class Student {
	
	String studentName = "Rajesh";
	int studentAge = 24;
	
	
	 void printStudentInfo()
	{
		System.out.println("Student Name = " + studentName);
		System.out.println("Student Age = " + studentAge);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.printStudentInfo();
		
		Student s2 = new Student();
		s2.printStudentInfo();
		
		Student s3 = new Student();
        s3.printStudentInfo();
	}



}
