package package2;
import package1.M;
import package1.N;
public class Z extends M {
	public static void main(String args[])
	{
		M obj1=new M();
		obj1.methodprotected();
		obj1.methodpublic();
		X obj=new X();
		obj.display();
	}

}
