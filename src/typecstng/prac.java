package typecstng;

public class prac {

	public static void main(String[] args) {
		 float f=65535;
		 long d=98754;
		 System.out.println(f+" "+d);
	//	  f=   d;
		 d=(char)f;
		  System.out.println((f>d)+" "+f+" "+d);
	//	 d=f;
		 
	}

}

/*
1.implicit conversion or casting down or widening    done automatically-->
	byte -> short -> char -> int -> 'long -> float' -> double  
	
2.explicit conversion or casting up or narrowing     done manually --->
	double -> 'float -> long' -> int -> char -> short -> byte  
 
Data Type	     Size	          Description
byte	        1 byte	    Stores whole numbers from -128 to 127
short	  	    2 bytes	    Stores whole numbers from -32,768 to 32,767
int				4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
long			8 bytes	    Stores whole numbers 
								from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float			4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double			8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean			1 bit	    Stores true or false values
char			2 bytes  	Stores a single character/letter or ASCII values

*/