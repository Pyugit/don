package accessmod;

public class protectedd {

	
    protected int a=21;
    protected  void test()
	{
		System.out.println(a);
	}
    protected  void display()
     {
    	test(); 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protectedd obj=new protectedd();
		
		System.out.println(obj.a);
		
		obj.test();
		obj.display();
	}

}
