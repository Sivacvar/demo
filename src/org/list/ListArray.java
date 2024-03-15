package org.list;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
	public static void main(String[] args) {
		
		List a = new ArrayList();
		a.add(10);
		a.add(10);
		a.add(20);
		a.add(50);
		a.add(60);
		a.add(80);
		a.add(60);
		a.add(50);
		
			System.out.println("  a[]="+a);
			a.remove(1);
			a.remove(5);
			 
			System.out.println("output ="+a);
		
		
		
		
		
	}

}
