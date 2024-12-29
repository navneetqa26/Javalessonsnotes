package lesson_01_ClassObjects;

import lesson_02_ClassObjects.Employee;

public class Teacher {
	
	String teacherName = "Pawan";
	int teacherID = 12001;
	
	public void printTeacherInfo()
	{
		System.out.println("Teacher = " + teacherName + "   ID = " + teacherID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher();
		t1.printTeacherInfo();
		
		Student s3 = new Student();
		s3.printStudentInfo();
		
		Employee e1 = new Employee();
		e1.printEmpInfo();

	}

}
