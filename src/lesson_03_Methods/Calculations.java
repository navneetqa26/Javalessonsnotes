package lesson_03_Methods;

public class Calculations {
	
	int num1 = 10;
	int num2 = 12; 
	
	public void addition()
	{    
		System.out.println("Addition of numbers is = " + (num1+num2));
	}
	
	public void Sum(int n1, int n2)
	{
		System.out.println("Sum of numbers is = " + (n1+n2));
	}
	
	public int returnSum(int n1, int n2)
	{
		int sumNum = n1+n2;
		return sumNum;
	}
	
	public void findFullName(String FirstName, String LastName)
	{
		System.out.println("Full name is =  " + FirstName + " "+LastName);
	}
	
	public String returnFullName(String FirstName, String LastName)
	{
		
		String FullName =  FirstName + LastName;
		
		return FullName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations c1 = new Calculations();
		
		c1.addition();
		
		c1.Sum(13, 12);
		
		int sumRet = c1.returnSum(10, 20);
		System.out.println("Returned Sum is = "+sumRet);
		
		c1.findFullName("Pankaj", "Kumar");
		
		String CompleteName = c1.returnFullName("Sumit", "Singh");
		
		System.out.print("DigiBoulevards"+CompleteName);

	}

}
