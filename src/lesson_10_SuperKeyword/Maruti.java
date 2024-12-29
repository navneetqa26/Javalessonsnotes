package lesson_10_SuperKeyword;

public class Maruti extends Car{
	
	int speed = 50;
	
	public void drive()
	{   
		System.out.println("Car is driving at "  + super.speed);
	}
	
	public void run()
	{
		System.out.println("Maruti Car is Running");
		super.run();
	}
	
	Maruti()
	{
		super();
		System.out.println("Maruti Constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruti m1 = new Maruti();
		m1.run();
		m1.drive();
		
		
		
		

	}

}
