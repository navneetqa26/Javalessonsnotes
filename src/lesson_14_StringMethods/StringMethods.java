package lesson_14_StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String subject = "SeleniumAutomationTesting";
		String Favsubject = "seleniumAutomationTesting";
		
		int stringLength = subject.length();
		System.out.println(stringLength);
		
		
		char charAt = subject.charAt(8);
		System.out.println(charAt);
		
		int index = subject.indexOf('e');
		System.out.println(index);
		
		int lastIndex = subject.lastIndexOf('e');
		System.out.println(lastIndex);
		
		boolean isContained = subject.contains("Auto");
		System.out.println(isContained);
		
		boolean isEqual = subject.equals(Favsubject);
		System.out.println(isEqual);
		
		boolean isEqualIgnoreCase = subject.equalsIgnoreCase(Favsubject);
		System.out.println(isEqualIgnoreCase);
		
		boolean isStartWith = subject.startsWith("Sel");
		System.out.println(isStartWith);
		
		boolean isEndWith  = subject.endsWith("ing");
		System.out.println(isEndWith);
		
		String subStr = subject.substring(8);
		System.out.println(subStr);
		
		String subStr2 = subject.substring(8, 20);
		System.out.println(subStr2);
		
		TestStringBuilder tsb = new TestStringBuilder();
		System.out.println(tsb.name);

	}

}
