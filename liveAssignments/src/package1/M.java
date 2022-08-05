package package1;

public class M {
	 private int n1=2;
	 long n2=3L;
     protected float n3=0.3f;
	public void methodpublic()
	{
		System.out.println("public method called");
		methodprivate();
	}
	private void methodprivate()
	{
		System.out.println("private method called");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}
	public void methodprotected()
	{
		System.out.println("protected method called");
		methodprivate();
	}
	void methoddefault()
	{
		System.out.println("default method called");
		methodprivate();
	}


}
