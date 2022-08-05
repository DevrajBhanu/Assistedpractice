package package1;
//import package1.A;
//import package1.B;

import java.util.Scanner;

//import package3.A;
//import package3.B;

class A extends Student
{
	A(int sub1,int sub2,int sub3)
	{
		subject1=sub1;
		subject2=sub2;
		subject3=sub3;
		 total=subject1+subject2+subject3;
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name ");
				name=sc.nextLine();
				System.out.println("Enter Age ");
				age=sc.nextInt();
				
				
				
				
		
	}
}
class B extends Student
{
	B(int sub2,int sub3)
	{
		subject1=0;
		subject2=sub2;
		subject3=sub3;
		total=subject1+subject2+subject3;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name ");
		name=sc.nextLine();
		System.out.println("Enter Age ");
		age=sc.nextInt();
		
		
		
		
		
	}
	
}

class Student {
	String name;
	int age;
	char section;
	char gender;
	int subject1,subject2,subject3;
	int total;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

A s1=new A(60,90,86);
A s4=new A(74,56,98);
B s2=new B(70,80);
B s3=new B(85,90);
//I am printing deatails of only student 1 in brief just for understanding we can do in same manner for remaining students.
System.out.println("Name of student: "+s1.name);
System.out.println("Age is "+s1.age+"years");
System.out.println("Percentage of student1 is "+(s1.total/3)+"%");
System.out.println("Marks of student 1 in three subjects are "+s1.subject1+" "+s1.subject2+" "+s1.subject3);
System.out.println();
System.out.println("Percentage of student2 is "+(s2.total/3)+"%");
System.out.println("Marks of student 1 in three subjects are "+s2.subject1+" "+s2.subject2+" "+s2.subject3);
System.out.println();
System.out.println("Percentage of student1 is "+(s3.total/3)+"%");
System.out.println("Marks of student 3 in three subjects are "+s3.subject1+" "+s3.subject2+" "+s3.subject3);
System.out.println();
System.out.println("Percentage of student4 is "+(s4.total/3)+"%");
System.out.println("Marks of student 1 in three subjects are "+s4.subject1+" "+s4.subject2+" "+s4.subject3);





	}

}


