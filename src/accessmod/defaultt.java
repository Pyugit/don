package accessmod;

public class defaultt {

	
     int a=21;
     void test()
	{
		System.out.println(a);
	}
     void display()
     {
    	test(); 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultt obj=new defaultt();
		
		System.out.println(obj.a);
		
		obj.test();
	//	obj.display();
	}

}
