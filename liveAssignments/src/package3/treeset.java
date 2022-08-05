package package3;
import java.util.*;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> l2= new TreeSet<String>();
		
		//System.out.println("Enter Four numbers");
		//Scanner sc=new Scanner(System.in);
		
		l2.add("Java");
		l2.add("C++");
		l2.add("Html");
		l2.add("Css");
		l2.add("Python");
		l2.add("Javascript");
		
		
		
		System.out.println(l2);
		System.out.println(l2.contains("Java"));
		
			System.out.println(l2.remove("Java"));
			 System.out.println("After removing element : " +"JAVA" + " TreeSet is : " + l2);
			System.out.println(l2.remove("C++"));
			 System.out.println("After removing element : " + "C++" + " TreeSet is : " + l2);
			System.out.println(l2.remove("Html"));
			 System.out.println("After removing element : " +"Html" + " TreeSet is : " + l2);
			System.out.println(l2.remove("Css"));
			 System.out.println("After removing element : " + l2 + " TreeSet is : " + l2);
			System.out.println(l2.remove("Python"));
			 System.out.println("After removing element : " + l2 + " TreeSet is : " + l2);
			System.out.println(l2.remove("Javascript"));
			 System.out.println("After removing element : " + l2 + " TreeSet is : " + l2);
		
		

	}

}
