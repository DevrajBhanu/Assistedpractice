package package3;



class shape {
	public void Area(int a,int b)
	{
		
	}
}
class Rectangle extends shape
{
	public void Area(int l,int b)
	{
		System.out.println("Area of Recatangle"+(l*b));	
	}
}
class Triangle extends shape
{
	public void Area(int bs,int he)
	{
		System.out.println("Area of Triangle"+(0.5*bs*he));
	}
}
class Square extends shape
{
	public void Area(int s,int s2)
	{
		System.out.println("Area of squatre"+(s*s2));
	}
}
class Rhombus extends shape
{
	public void Area(int d1,int d2)
	{
		System.out.println("Area of Rhombus"+(0.5*d1*d2));
	}
}

    class call{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    shape s;
    s=new Rectangle();
    s.Area(2,3);
    
    s=new Square();
    s.Area(6,6);
    
    s=new Rhombus();
    s.Area(2,3);
    
    s=new Triangle();
    s.Area(2,3);
    
    
    
    


	}

}

