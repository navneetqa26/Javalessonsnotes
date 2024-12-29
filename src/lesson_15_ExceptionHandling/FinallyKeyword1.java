package lesson_15_ExceptionHandling;

public class FinallyKeyword1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		int a = 10;		
		System.out.println("value of a = " + a);
		String name = "Punit";
		int[] age = {12,14,23,21};
		
		try 
		{
		  
		  System.out.println(age[9]);
		  System.out.println("String Length = " + name.length());
		  int result = a/2;
		  System.out.println("Result of Division = " + result);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			  System.out.println("I m in finally block ");
		}
		
		
		
		
		System.out.println("Rest of the program");
		System.out.println("Rest of the program 1");
		System.out.println("Rest of the program 2");
		

	}

}
