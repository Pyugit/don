package accessmod;

public class publicc {

	
    public int a=21;
    public  void test()
	{
		System.out.println(a);
	}
  public  void display()
     {
    	test(); 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicc obj=new publicc();
		
		System.out.println(obj.a);
		
		obj.test();
		obj.display();
	}

}
