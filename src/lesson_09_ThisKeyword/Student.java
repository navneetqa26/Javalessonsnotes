package lesson_09_ThisKeyword;

public class Student {
	
	String name;
	int age;
	
	public void printStudent()
	{
		System.out.println("Hi " + name + "  you are  " + age + " years old");
	}
	
	Student()
	{
		System.out.println("In NonParameterized Constructor");
	}
	
	Student(String name, int age)
	{
		this();
		this.name = name;
		this.age = age;
		System.out.println("In Constructor");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.printStudent();
		Student s2 = new Student("Pankaj", 22);
		s2.printStudent();

	}

}
