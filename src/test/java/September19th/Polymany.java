package September19th;

public class Polymany {
	private void clientDetails(int id) {
		System.out.println(id);
	}

	private void clientDetails(String name) {
		System.out.println(name);

	}

	private void clientDetails(String name, int id) {
		System.out.println("Name is " + name + " id is " + id);
	}

	private void clientDetails(int id, String name) {
		System.out.println("id is " + id + " Name is " + name);
	}

	public static void main(String[] args) {
		Polymany p = new Polymany();
		p.clientDetails(50);
		p.clientDetails("Besant");
		p.clientDetails("Besant", 200);
		p.clientDetails(200, "Besant");
	}

}
