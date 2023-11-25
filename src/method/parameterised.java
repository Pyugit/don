package method;

public class parameterised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   abc obj=new abc();
   obj.test();
   obj.test(1);
   obj.run();
   obj.walk();  
   
   ab objj=new abc();
	objj.test();
	objj.test(1);
	objj.run();
	//objj.walk();  //not run
	
	ab ob=new ab();
	   ob.test();
	   ob.test(1);
	   ob.run();
	  // ob.walk();  //not run
	   
	}
}
class ab{
	void test()
	{
	System.out.println("this is 0000 para. method");
	System.out.println("  ");
	}
	
	void test(int a)
	{
	System.out.println("this is 1111 para. method");	
	System.out.println("  ");
	}
	
	void run()
	{
		System.out.println("this is run in parent ab");
		System.out.println("  ");
	}
	}

class abc extends ab{
	void test()    //overrides ab.test
	{
		super.test();
		super.test(1);
	System.out.println("this is 0 cld. method");
	System.out.println("  ");
	}
	
	void test(int a)
	{
	System.out.println("this is 1 cld. method");	
	System.out.println("  ");
	}
	
	void walk()
	{
		System.out.println("this is walk in cld abc");
		System.out.println("  ");
	}
	}