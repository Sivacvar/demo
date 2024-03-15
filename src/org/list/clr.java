package org.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class clr {
	public static void main(String[] args) {
		List d = new ArrayList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(60);
		System.out.println(d);
		Object inc = d.get(2);
		System.out.println("Index 2nd Value is "+inc);
		
		List e = new Vector();
		e.add(100);
		e.add(200);
		e.add(300);
		e.add(400);
		e.add(500);
		e.add(600);
		e.add(700);
		System.out.println(e);
		Object brr = e.get(4);
		System.out.println("Index 2nd Value is "+brr);

		List lo = new Vector();
		lo.add(105);
		lo.add(205);
		lo.add(305);
		lo.add(405);
		lo.add(505);
		lo.add(605);
		lo.add(705);
		lo.add(805);
		System.out.println(lo);
		boolean under = lo.contains(8);
		System.out.println("Index 8nd Value is "+under);
	
		
		
		
		
	}

}
