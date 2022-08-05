package package3;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class linked_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet l1= new LinkedHashSet();
		l1.add(1);
		l1.add(2);
		l1.add(1.2f);
		l1.add(1.3f);
		l1.add(true);
		System.out.println(l1);
		
		LinkedHashSet<Integer> l2= new LinkedHashSet<Integer>();
		
		System.out.println("Enter Four numbers");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		
		l2.add(n1);
		l2.add(n2);
		l2.add(n3);
		l2.add(n4);
		
		
		
		System.out.println(l2);
		
		

	}

}
