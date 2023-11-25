package string;

public class string1 {

	public static void main(String[] args) {
		 String s1="  ";
		 String s2="asdgfg zxcvuuu  ";
		 
		 System.out.println(s1.isBlank());
		 System.out.println(s1.isEmpty());
		 
		 Object i=s2.length();
		 System.out.println(i);
		 System.out.println(s2.lastIndexOf('u'));
		 System.out.println(s2.indexOf('u'));
			
	}

}
