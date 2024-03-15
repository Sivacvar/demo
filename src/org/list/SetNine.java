package org.list;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetNine {
	public static void main(String[] args) {
		Set m = new TreeSet<>();
		//10,20,30,40,50,60,70,80,90,10,20
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		m.add(70);
		m.add(80);
		m.add(90);
		m.add(10);
		m.add(20);
		System.out.println(m);
		m.addAll(m);
		System.out.println(m);
	}

}
