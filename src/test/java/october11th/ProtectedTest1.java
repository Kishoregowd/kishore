package october11th;

public class ProtectedTest1 extends ProtectedTest{
	protected void clientName() {
		System.out.println("ramesh");
	}
	
	public static void main(String[] args) {
		ProtectedTest1 p1 = new ProtectedTest1();
		p1.clientName();
		p1.ClientId();
		
	}

}
