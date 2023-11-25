package stati;

public class empl 
{
	String name;
	int age;
	static int depno=20;

	void display()
	{
	  System.out.println("name of emp: "+name);
	  System.out.println("age of emp: "+age);
	  System.out.println("dept no of emp: "+depno);
	}

	public static void main(String[] args) { 
		empl e1=new empl();
		e1.name="emp1";
		e1.age=25;
		e1.depno=10;
		e1.display();
		
		empl e11=new empl();
		e11.name="emp11";
		e11.age=26;
	depno=30;
		e11.display();
	
		empl e111=new empl();
		e111.name="emp111";
		e111.age=27;
	//	e111.depno=10;
		e111.display();
	
		empl e1111=new empl();
		e1111.name="emp1111";
		e1111.age=29;
	//	e1111.depno=10;
		e1111.display();
	
	}

}
