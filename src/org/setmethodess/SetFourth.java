package org.setmethodess;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFourth {
	public static void main(String[] args) {
//		Set a = new HashSet<>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(90);
//		a.add(10);
//		a.add(10);
//		a.add(40);
//		a.add(50);
//	Set z = new LinkedHashSet<>();
//	z.add(30);
//	z.add(40);
//	z.add(50);
//	z.add(60);
//	z.add(80);
//	a.retainAll(z);
//	System.out.println(a);
	
//Set s = new LinkedHashSet<>();	
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(90);
//		s.add(10);
//		s.add(10);
//		s.add(40);
//		s.add(50);
//	Set z = new LinkedHashSet<>();
//	//10,20,60,50,40,70,80,90
//	z.add(10);
//	z.add(20);
//	z.add(60);
//	z.add(50);
//	z.add(40);
//	z.add(70);
//	z.add(80);
//	z.add(90);
//	s.retainAll(z);
//	System.out.println(s);
//	
		
		Set so = new TreeSet<>();
		//10,20,30,40,50,60,70,80
		so.add(10);
		so.add(20);
		so.add(30);
		so.add(40);
		so.add(50);
		so.add(60);
		so.add(70);
		so.add(80);
	Set no = new LinkedHashSet<>();
	//100,200,300,400,500,600,700,8000
	no.add(100);
	no.add(200);
	no.add(300);
	no.add(400);
	no.add(500);
	no.add(600);
	no.add(700);
	no.add(8000);
	so.retainAll(no);
	System.out.println(so);
	
		
	}

}
