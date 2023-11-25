
public class parse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="asc";
try {
	//System.out.println(a);

	System.out.println("asf  r");
		
char a= (char) Integer.parseInt(s);
System.out.println(a);
System.out.println("asf");   //not print
	}
catch(Exception e){
	
	System.out.println("asf  c");
		System.out.println("handled-->"+e);
	}
finally {System.out.println("always execute");}

//Thread.sleep(2000);   //error

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
}
}

}
