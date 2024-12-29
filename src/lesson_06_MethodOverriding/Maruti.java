package lesson_06_MethodOverriding;

public class Maruti extends Car{
	
	
	public void run()
	{
		System.out.println("Maruti Car is Running");
	}
	
	public void drive()
	{
		System.out.println("Car is driving");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruti m1 = new Maruti();
		m1.run();
		m1.drive();
		
	}

}
