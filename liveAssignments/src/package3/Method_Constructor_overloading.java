package package3;

public class Method_Constructor_overloading {
	int length,breadth,side,d1,d2;
	double radius;
	Method_Constructor_overloading()
	{
		 d1=2;
		 d2=3;
		double base=4;
		int height=5;
		
	}
	Method_Constructor_overloading(double r)
	{
		radius =r;
	}
	Method_Constructor_overloading(int s)
	{
		side=s;
	}
	Method_Constructor_overloading(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void square()
	{
		System.out.println("Area of square="+(side*side));
	}
	public void rectangle()
	{
		System.out.println("Area of recangle="+(length*breadth));
	}
	public void circle()
	{
		System.out.println("Area of circle="+(3.141*radius*radius));
	}
	public void Area(int l1,int l2)
	{
		System.out.println("Area of rhombus="+(0.5*l1*l2));
	}
	public void Area(int l1,double l2)
	{
		System.out.println("Area of Triangle="+(0.5*d1*d2));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Constructor_overloading obj=new Method_Constructor_overloading();//for triangle and rhombus
		Method_Constructor_overloading obj2=new Method_Constructor_overloading(3.2);//for circle
		Method_Constructor_overloading obj3=new Method_Constructor_overloading(3);//for square
		Method_Constructor_overloading obj4=new Method_Constructor_overloading(3,2);//for rectangle
		obj2.circle();
		obj3.square();
		obj4.rectangle();
         obj.Area(5,6);
         obj.Area(5, 3.2);
	}

}
