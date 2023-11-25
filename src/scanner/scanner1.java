package scanner;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {

Scanner obj=new Scanner(System.in);

System.out.print("enter name:");

String s=obj.nextLine();

System.out.println("name is:"+s);

System.out.println("enter age");

try {
int age=obj.nextInt();

System.out.println("age:"+age);
	}
catch(Exception exceptiondescription)
{
	System.out.println(exceptiondescription+"5");
}
}
}