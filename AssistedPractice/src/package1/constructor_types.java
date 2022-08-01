package package1;

public class constructor_types {
	int id;
	String name;
	constructor_types()
	{
		System.out.println("Value of Default Constructor");
	    id=2;
	    name="JAVA";
	}
	
	constructor_types(int i,String n)
	{
		System.out.println("Value of Parametrized Constructor");
	    id=i;
	    name=n;
	}

	void display() {
		System.out.println(id+" "+name);
		}

	public static void main(String[] args) {

		constructor_types  emp1=new constructor_types();

		emp1.display();
		constructor_types  emp2=new constructor_types(5,"Learn Java");
		emp2.display();
		}
	}


	