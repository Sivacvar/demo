package org.setmethodess;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveallFive {
	public static void main(String[] args) {
		Set h = new HashSet<>();
		//10,20,30,90,10,10,40,50
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(90);
		h.add(10);
		h.add(10);
		h.add(40);
		h.add(50);
	Set no = new LinkedHashSet<>();
	//30,40,50,60,80
	no.add(30);
	no.add(40);
	no.add(50);
	no.add(60);
	no.add(80);
   h.removeAll(no);	
	System.out.println(h);
	
		
	}

}
