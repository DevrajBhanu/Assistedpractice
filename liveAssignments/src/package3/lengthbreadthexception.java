package package3;

import java.io.IOException;
import java.util.Scanner;

public class lengthbreadthexception {

	

		static void display(int num1,int num2)throws IOException
		{
			if(num1>num2)
			{
				throw new IOException("Num1 is greater than Num2");
			}
			else
			{
				System.out.println("Area= "+(num1*num2));
			}
					}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers");
			int num3=sc.nextInt();
			int num4=sc.nextInt();
			try
			{
				display(num3,num4);
			}
			catch(IOException ae)
			{
				System.out.println("Exception occured");
				System.out.println(ae.getMessage());
			}

		}

	}
