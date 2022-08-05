package package2;

class product{
	 int id=78;
    String name="Amul";
	public void display()
	{
	
	System.out.println(id+" "+name);
	}
}
	 class A extends product
	 {
		 int count=50;
		 String category="Butter";
		 public void display()
		 {
			 System.out.println(id+" "+name+" "+count+" "+category);
			 
		 }
	 }
	 class B extends product
	 {
		 int count=90;
		 String category="Milk";
		 public void display()
		 {
			 System.out.println(id+" "+name+" "+count+" "+category);
			 
		 }
	 }
	 class C extends product
	 {
		 int count=56;
		 String category="Choco";
		 public void display()
		 {
			 System.out.println(id+" "+name+" "+count+" "+category);
			 
		 }
	 }
	 class subA extends A{
		 int price=30;int totalprice;
		 void total(){
			 totalprice=count*price;
		 }
		 public void display()
		 {
			 System.out.println(id+" "+name+" "+category+" "+totalprice); 
		 }
	 }
	 class subB extends B{
		 int price=30;int totalprice;
		 void total(){
			  totalprice=count*price;
		 }
		 public void display()
		 {
			 System.out.println(id+" "+name+" "+category+" "+totalprice); 
		 }
	 }
	 
	 
	 
	
	

 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subA obj1=new subA();
		obj1.total();
		obj1.display();
		
		subB obj2=new subB();
		obj2.total();
		obj2.display();
		
		

	}

}
