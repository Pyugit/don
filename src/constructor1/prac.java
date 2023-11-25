package constructor1;

public class prac {
	int a;
	prac()
	{
		System.out.println("constructor");
	}
	
	prac(int a)
	{
		//prac();       prac method is undefined 

		System.out.println("constructor 1para."+a+this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        prac o=new prac();
        prac o1=new prac(5);
        
	}

}
