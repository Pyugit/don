package constructor1;

public class constructor11 {
	void test()
	{
		System.out.println("this is method");
	}
	
	constructor11(int a)
	{
		System.out.println("this is para constructor");
	}
	
	constructor11()
	{
		System.out.println("this is constructor");
	}
	public static void main(String[] args) {
		 
		new constructor11();
		new constructor11(2);
		}

}
