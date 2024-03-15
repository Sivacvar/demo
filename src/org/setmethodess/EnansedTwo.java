package org.setmethodess;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EnansedTwo {
	public static void main(String[] args) {
		Set go = new LinkedHashSet<>();
		//105,205,305,405,505,605,705,805
		go.add(105);
		go.add(205);
		go.add(305);
		go.add(405);
		go.add(505);
		go.add(605);
		go.add(705);
		go.add(805);

		for(Object s:go) {
			System.out.println(s);
		
		Set j = new TreeSet<>();
		//10,20,30,40,50,60,70,80,90,10,20
		j.add(10);
		j.add(20);
		j.add(30);
		j.add(40);
		j.add(50);
		j.add(60);
		j.add(70);
		j.add(80);
		j.add(90);
		j.add(10);
		j.add(20);
for (Object v:j)	{
	System.out.println(v);
		Set d = new HashSet<>();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(60);
		d.add(70);
		d.add(80);
		d.add(90);
		d.add(10);
		d.add(20);
		for(Object b:d) {
			System.out.println(b);
		
		
}
		
	}

}
}
}