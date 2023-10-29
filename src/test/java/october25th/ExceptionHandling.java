package october25th;

public class ExceptionHandling {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3/0);
	} catch (Exception e) {
		System.out.println("Exception Handled");
		e.printStackTrace();
	}
	
	
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
}
}
