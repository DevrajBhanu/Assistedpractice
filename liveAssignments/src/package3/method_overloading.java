package package3;

public class method_overloading {
	public int calculate(int n1,int n2)
	{
		int add=n1+n2;
		return add;
	}
	public float calculate(float n1)
	{
		float area=(float)(3.141*n1*n1);;
		return area;
	}
	public int calculate(double n1,int n2)
	{
		int rec=(int)(n1*n2);
		return rec;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading m1=new method_overloading();
		System.out.println("Addition of two number= "+m1.calculate(2,3));
		System.out.println("Area of circle= "+m1.calculate(3.0f));
		System.out.println("Area of Reactangle= "+m1.calculate(4.0,5));

	}

}
