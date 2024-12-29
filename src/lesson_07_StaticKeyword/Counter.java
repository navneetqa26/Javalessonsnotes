package lesson_07_StaticKeyword;

public class Counter {
	
	static int count = 1;
	
	public static void increment()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increment();
		increment();
		

	}

}
