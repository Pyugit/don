package ifstmnt;

public class nestedifc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String unm1="John";
		String unm2="John1";
		String unm3="John2";
		
		String password="j@2";
		
		if(unm1=="john" || unm2=="John1" || unm3=="john2")
		{
			if(password=="j@2")
				System.out.println("user valid");
		
			else
				System.out.println("not a valid");
		}
		else
			System.out.println("not valid");
	}
}