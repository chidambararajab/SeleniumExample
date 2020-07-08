package co.sirius.seleniumexample;

import java.util.ArrayList;

public class ListExpample {

	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		System.out.println(a.isEmpty());
		a.add(1);
		a.add("two");
		a.add(3.3);
		
		int size = a.size();
		System.out.println("Size " + size);
		System.out.println(a.contains("two"));
		System.out.println(a.isEmpty());
		System.out.println(a);
		
		a.add("D");
		a.add("U");
		a.add("K");
		a.add("E");
		
		System.out.println("Size " + size);
		System.out.println(a.contains("two"));
		System.out.println(a);
	}

}
