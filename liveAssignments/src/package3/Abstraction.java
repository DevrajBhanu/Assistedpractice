package package3;

abstract class MNC{
	abstract void method1();
	abstract void method2();
	public MNC()
	{
		System.out.println("MNC class constructor called");
	}
	void method3(){
		System.out.println("Normal method of MNC class called");
		
	}
	
}
abstract class Infosys extends MNC{
	void method1()
	{
		System.out.println("Abstract Method1 called");
		
	}
	
}
class Hello extends Infosys{
	void method2()
	{
		System.out.println("Abstract Method2 called");
	}
	void method4()
	{
		System.out.println("Normal method of hello class called");
	}
}
public class Abstraction {
	public static void main(String args[])
	{
		MNC obj1=new Hello();
		Hello obj2=new Hello();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj2.method4();

}
}
