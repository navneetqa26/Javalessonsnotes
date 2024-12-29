package lesson_19_Interface;

public class ICICI implements Banks, Financer{
	
	@Override
	public double rateOfInterst() {
		// TODO Auto-generated method stub
		return 7.5;
	}
	
	@Override
	public double rateOfRepo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double getFinance() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public void hello() {
		System.out.println("Hello Customer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICI ob1 = new ICICI();
		System.out.println(ob1.rateOfInterst());
		ob1.hello();
		
	}

	
	

	

}
