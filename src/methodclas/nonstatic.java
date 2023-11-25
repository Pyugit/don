package methodclas;

public class nonstatic {

	
	static void test()
    {
  	  System.out.println("this is test method");
    }
    void display()
    {
  	  System.out.println("this is display method");
    }
    void print()
    { 
    	System.out.println("this is print method");
    }
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    test();
    nonstatic.test();
     nonstatic var = new nonstatic();
     var.display();
     var.print();
     
     var.test();
	}
}
