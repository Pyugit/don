package exception;

public class tread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
