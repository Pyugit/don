package method;

public class method2 {
	
	public static void test()
	{
		System.out.println("this is test method");
	}
	
     void test1()
	{
		System.out.println("this is test1 method");
	}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("this is main method");
		method2 o = new method2();
		test();
		method2.test();
		o.test1();
	}

}
