package co.sirius.seleniumexample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		HashMap<Number, String> reference = new HashMap();

		reference.put(101, "Chid");
		reference.put(102, "Dinesh");
		reference.put(104, "Dinesh");
		reference.put(103, "Karthi");

		System.out.println(reference);

		reference.remove(102);

		System.out.println(reference);
		System.out.println(reference.get(103));

		for (Map.Entry copy : reference.entrySet()) {
			System.out.println((copy.getKey() + "  " + copy.getValue()));
		}
	}
}
