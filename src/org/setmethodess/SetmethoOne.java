package org.setmethodess;

import java.util.HashSet;
import java.util.Set;

public class SetmethoOne {
	public static void main(String[] args) {
		Set h = new HashSet<>();
		//105,205,305,405,505,605,705,805,505,605
		h.add(105);
		h.add(205);
		h.add(305);
		h.add(405);
		h.add(505);
		h.add(605);
		h.add(705);
		h.add(805);
		h.add(505);
		h.add(605);
		h.addAll(h);
		System.out.println(h);
		
	}

}
