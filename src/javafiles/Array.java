package javafiles;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Array {
	public static void main(String args[]) {
		int a[] = new int[5]; // declaration and instantiation
		a[0] = 10; // initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		// traversing array
		for (int i = 0; i < a.length; i++) // length is the property of array
			System.out.println(a[i]);

		List l1 = new LinkedList();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + l1);

		System.out.println("                               ");

		Set s1 = new HashSet();
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Ayan");
		System.out.println();
		System.out.println(" Set Elements");
		System.out.print("\t" + s1);

		System.out.println("                               ");
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.print("\t" + m1);

	}
}

