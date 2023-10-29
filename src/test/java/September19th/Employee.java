package September19th;

public class Employee extends Polymany2 {
	private void empid() {
		System.out.println("12345");
	}
	@Override
	public void clientdetails(int id) {
		System.out.println("ID is - " + id);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.clientdetails(100);
		e.empid();
	}

}
