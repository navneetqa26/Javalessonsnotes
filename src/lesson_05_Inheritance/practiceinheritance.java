package lesson_05_Inheritance;
class practiceinheritance{

    public void testing()
    {
    	System.out.println("Test Failed");
    }
static class practiceinheritanc extends practiceinheritance{

    public void tests()
    {
    	System.out.println("Test passed");
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceinheritanc p2 = new practiceinheritanc();
		p2.testing();
	
	}

}
}
