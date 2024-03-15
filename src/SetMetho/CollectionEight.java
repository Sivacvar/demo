package SetMetho;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionEight {
	public static void main(String[] args) {
		List h = new ArrayList<>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(90);
		h.add(10);
		h.add(10);
		h.add(40);
		h.add(50);
//Example-8.1
		System.out.println("Input " + h);
		h.add(2, 50);
		System.out.println(h);
		h.remove(2);
//Example-8.2
		System.out.println(h);
		h.add(8, 70);
//Example-8.3
		System.out.println(h);
		h.add(8, 80);
//Example-8.4
		System.out.println(h);
		h.add(5, 100);
		System.out.println(h);
	}

}
