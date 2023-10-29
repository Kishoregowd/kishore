package october4th;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap();
		m.put(10, "java");
		m.put(20, "Oracle");
		m.put(30, "API");
		m.put(40, "Selenium");

		Collection<String> value = m.values();
		System.out.println(value);

		Set<Integer> key = m.keySet();
		System.out.println(key);

		Set<Entry<Integer, String>> allkeys = m.entrySet();

		for (Entry<Integer, String> x : allkeys) {

			System.out.println(x);

		}

	}

}
