package package3;


class A extends Marks
{
	A(int sub1,int sub2,int sub3)
	{
		subject1=sub1;
		subject2=sub2;
		subject3=sub3;
		 total=subject1+subject2+subject3;
		
	}
}
class B extends Marks
{
	B(int sub2,int sub3)
	{
		subject1=0;
		subject2=sub2;
		subject3=sub3;
		total=subject1+subject2+subject3;
		
	}
	
}

 class Marks {
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
System.out.println("Percentage of student1 is "+(s1.total/3)+"%");
System.out.println("Marks of student 1 in three subjects are "+s1.subject1+" "+s1.subject2+" "+s1.subject3);

	}

}
