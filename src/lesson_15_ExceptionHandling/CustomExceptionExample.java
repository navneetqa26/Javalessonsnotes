package lesson_15_ExceptionHandling;

public class CustomExceptionExample {
	
	public static void validateAge(int age) throws MyCustomException {
       
		if (age < 18) 
        {
            throw new MyCustomException("Age must be 18 or older!");
        }
                
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
            validateAge(15); // This will throw MyCheckedException
        }
		catch (MyCustomException e) 
		{
            System.out.println("Exception caught: " + e.getMessage());
        }

	}

}
