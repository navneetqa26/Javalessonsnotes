package lesson_15_ExceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;		
		System.out.println("value of a = " + a);
		String name = null;
		int[] age = {12,14,23,21};
		
		try 
		{
		  
		  System.out.println(age[1]);
		  
		  try 
		  {
		  System.out.println("String Length = " + name.length());
		  int result = a/2;
		  System.out.println("Result of Division = " + result);
		  }
		  
		  catch(Exception e)
		  {
			System.out.println(e.getMessage());
		  }
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			  System.out.println("I m in finally block ");
		}
		

	}

}
