package org.list;

import java.util.ArrayList;
import java.util.List;

public class CollecFive {
public static void main(String[] args) {
	List a  =new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(90);
	//System.out.println("input"+a);
	int value = a.indexOf(10);
	//System.out.println("Index Value of 10 Is = "+value);
	
	List s  =new ArrayList();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(90);
	s.add(10);
	s.add(10);
	s.add(40);
	s.add(50);
	//System.out.println("input"+s);
	int last = s.lastIndexOf(10);
	
	//System.out.println("Index Value of 10 Is = "+last);
	
	
	List  so =new ArrayList();
	so.add(10);
	so.add(20);
	so.add(30);
	so.add(90);
	so.add(10);
	so.add(10);
	so.add(40);
	so.add(50);
	System.out.println("input"+s);
	int valuee = so.indexOf(90);
	System.out.println("Index Value of 10 Is = "+valuee);
	
}
}















