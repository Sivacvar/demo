package SetMetho;

import java.util.ArrayList;
import java.util.List;

public class CollectionNine {
	public static void main(String[] args) {
		List w = new ArrayList<>();
		//10,20,30,90,10,10,40,50
		w.add(10);
		w.add(20);
		w.add(30);
		w.add(90);
		w.add(10);
		w.add(10);
		w.add(40);
		w.add(50);
	w.retainAll(w);
	
		System.out.println("Input"+w);
		//w.add(0, 100);
		//System.out.println("  "+w);
	}	

}
