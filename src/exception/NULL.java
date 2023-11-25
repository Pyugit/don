package exception;

public class NULL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str =null;
System.out.println(str);
String st="hu";
//int a=5/0;
try
{
	//System.out.println(str.length());
	int a=5/0;
	int g=Integer.parseInt(st);
}

	

catch(ArithmeticException var)
{
	System.out.println("arithmatic exp");}

catch(NullPointerException var)
{
	System.out.println("arithmatic1 exp");}

catch(NumberFormatException var)
{
	System.out.println("arithmatic2 exp");}

catch(ArrayIndexOutOfBoundsException var)
{
	System.out.println("arithmatic3 exp");}

finally
{
	System.out.println();}
	
	try
	{
		int a=25/0;
		System.out.println(a);
		}
	catch(Exception n)
	{System.out.println("fggshsh");}
	finally
	{System.out.println("1");}

	}}
