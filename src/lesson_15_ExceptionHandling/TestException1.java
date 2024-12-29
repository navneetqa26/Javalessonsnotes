package lesson_15_ExceptionHandling;

public class TestException1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		int a = 10;		
		System.out.println("value of a = " + a);
		String name = "Anuj";
		int[] age = {12,14,23,21};
		
		try 
		{
		  Class.forName("com.example.NonExistentClass");
		  System.out.println(age[4]);
		  System.out.println("String Length = " + name.length());
		  int result = a/2;
		  System.out.println("Result of Division = " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught ArithmeticException");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught NullPointerException");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		}
		
		catch(Exception e)
		{
			System.out.println("Generic Exception");
		}
		
		
		System.out.println("Rest of the program");
		System.out.println("Rest of the program 1");
		System.out.println("Rest of the program 2");
		

	}

}
