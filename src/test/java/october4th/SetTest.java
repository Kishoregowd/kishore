package october4th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(10);
		
		int size = s.size();
		System.out.println("size - "+size);
		
		for (Object x : s) {
			System.out.println(x);
		}
	}

}
