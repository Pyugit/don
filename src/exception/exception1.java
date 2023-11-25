package exception;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[5];


try {
	arr[5]=15;
	System.out.println(arr[4]);

	}
catch(Exception e){
	System.out.println("catch blok "+e);
	
	
}
finally{
	System.out.println("finally blok");
	
}
try {
	 int v=8/0;
	}
catch(Exception e)
{System.out.println("catch blok2  "+e);}
finally{
	System.out.println("finally blok");
}

//	}
//}
}
	}