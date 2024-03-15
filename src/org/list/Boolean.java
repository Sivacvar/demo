package org.list;

import java.util.ArrayList;
import java.util.List;

public class Boolean {
	public static void main(String[] args) {
	List ro = new ArrayList();
	//10,20,30,90,10,10,40,50,10
	ro.add(10);
	ro.add(20);
	ro.add(30);
	ro.add(90);
	ro.add(10);
	ro.add(10);
	ro.add(40);
	ro.add(50);
	ro.add(10);
	System.out.println(ro);
	boolean Present = ro.contains(70);
	System.out.println("Present in list "+Present);

}
}