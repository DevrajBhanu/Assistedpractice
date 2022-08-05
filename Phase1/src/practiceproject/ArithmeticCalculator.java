package practiceproject;

import java.util.Scanner;

public class ArithmeticCalculator {
     int a,b;
     char ch;
	public void calci(char ch)
	{
		if(ch=='+')
		{
			int add=a+b;
			System.out.println("Result of Addition of two number"+a+" "+b+" is "+add);
		}
		else if(ch=='-')
		{
			int sub=a-b;
			System.out.println("Result of Subtraction of two number"+a+" "+b+" is "+sub);
		}
		else if(ch=='*')
		{
			int mul=a*b;
			System.out.println("Result of Multiplication of two number"+a+" "+b+" is "+mul);
		}
		else if(ch=='/')
		{
			double div=(double)a/b;
			System.out.println("Result of Division of two number"+a+" "+b+" is "+div);
		}
		else{
			System.out.println("Wrong Input ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticCalculator obj=new ArithmeticCalculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation you want to perform among these: ");
		System.out.println("'+' or '-' or '*' or '/'");
		 obj.ch=sc.next().charAt(0);
		 System.out.println("Enter two number");
		 obj.a=sc.nextInt();
		 obj.b=sc.nextInt();
		 obj.calci(obj.ch);
		 
		
		
		

	}

}
