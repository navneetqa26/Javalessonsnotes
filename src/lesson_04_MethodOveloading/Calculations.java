package lesson_04_MethodOveloading;

public class Calculations {
	
	public void Sum(int n1, int n2)
	{
		System.out.println("Sum of numbers is = " + (n1+n2));
	}
	
	public void Sum(int n1, int n2, int n3)
	{
		System.out.println("Sum of numbers is = " + (n1+n2+n3));
	}
	
	public void Sum(double d1, double d2)
	{
		System.out.println("Sum of doubles numbers is = " + (d1+d2));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculations c1 = new Calculations();
		c1.Sum(2, 3);
		c1.Sum(1.3, 2.2);
		c1.Sum(1, 2, 3);

	}

}
