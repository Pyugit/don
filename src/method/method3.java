package method;

public class method3 {
	
	public static void test()
	{
		System.out.println("this is test method");
	}


	public static void display()
	{
		test();
		System.out.println("this is display method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        System.out.println("main started");
        method3.display();
        System.out.println("main ended");   
    }

}
