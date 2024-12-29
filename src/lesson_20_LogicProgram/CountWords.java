package lesson_20_LogicProgram;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String slogan = "Let,us,learn,automation,testing";
		String[] sloganWords = slogan.split(",");
		System.out.println(sloganWords.length);
		String slogan2 = "Let us learn automation testing";
		String[] slogan2Words = slogan2.split("\\s");
		System.out.println(slogan2Words.length);
		

	}

}
