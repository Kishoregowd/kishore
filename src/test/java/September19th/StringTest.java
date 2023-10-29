package September19th;

public class StringTest {
	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "JAVA";
		
		//equals();
		boolean e = s1.equals(s2);
		System.out.println(e);
		
		//equalsIgnoreCase();
		boolean not = s1.equalsIgnoreCase(s2);
		System.out.println(not);
		
		//contains();
		boolean c = s1.contains("v");
		System.out.println(c);
		
		//isEmpty();
		boolean em = s1.isEmpty();
		System.out.println(em);
		
		//toLowerCase();
		String lo = s2.toLowerCase();
		System.out.println(lo);
		
		//toUpperCase();
		String up = s1.toUpperCase();
		System.out.println(up);
		
		//endsWith();
		boolean end = s1.endsWith("A");
		System.out.println(end);
		
		//startsWith();
		boolean start = s1.startsWith("j");
		System.out.println(start);
		
		//charAt();
		char ch = s2.charAt(1);
		System.out.println(ch);
		
		//length();
		int le = s1.length();
		System.out.println(le);
		
		//indexOf();
		int i = s1.indexOf("v");
		System.out.println(i);
		
		//lastIndexOf();
		int last = s1.lastIndexOf("a");
		System.out.println(last);
	}

}
