package lesson_18_Collections_HashSet;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Set<String> set = new HashSet<>();
		 
		 set.add("Amit");
		 set.add("Raman");
		 		 
		 System.out.println(set);
		 
		 System.out.println(set.contains("Rahul"));
		 
		 set.add("Rahul");
		 
		 set.remove("Amit");
		 set.remove("Raman");
		 set.remove("Rahul");
		 System.out.println(set);
		 
		 System.out.println(set.isEmpty());
		 

	}

}
