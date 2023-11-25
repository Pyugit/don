package accessmod;

public class Privatet {

	
	private int a=21;
	private void test()
	{
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Privatet obj=new Privatet();
		
		System.out.println(obj.a);
		
		obj.test();
	}

}
