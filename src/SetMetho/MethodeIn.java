package SetMetho;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class MethodeIn {
	public static void main(String[] args) {
 Set s = new HashSet();
 //it ignore the same variable values(hashset)
		s.add("Deposit");
		s.add("Deposit");
		s.add('s');
		s.add(234.567876);
		s.add(40000);
		s.add(40000);
		s.add(null);
		System.out.println(s);
	 Set d = new LinkedHashSet();
 //it Also ignore Same variable Values (LinkedHashSet) 
		  d.add("credit");
		  d.add("credit");
		  d.add(2340.9876);
		  d.add('s');
		  d.add(40000);
		  d.add(40000);
		  d.add(null);
		  System.out.println(d);

		  Set <String>f = new TreeSet();
		  f.add("Bold");
		  f.add("40000");
		  f.add("s");
		  f.add("343.8877");
		  System.out.println(f);
		//  s.removeAll(d);
		  System.out.println(s);
		  d.removeAll(f);
		  System.out.println(s);
		  
				
 
		
		
		
		
	}

}
