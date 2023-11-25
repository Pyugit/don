package constructor1;

public class defaultcnstrctr {

	int a;
	defaultcnstrctr()
	{System.out.println(a);	
	}
	void bn()
	{
	System.out.println(a);	 
	}
	
	public static void main(String[] args) {
	//System.out.println(a);	 
		
		//default constructor
		defaultcnstrctr o=new defaultcnstrctr();
		o.bn();
		 
//		System.out.println(o.a);	
	}

}
