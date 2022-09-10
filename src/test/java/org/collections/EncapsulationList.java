package org.collections;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EncapsulationList {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setUsername("Kishore");
		e.setPassword("kishore@123");

		Encapsulation e1 = new Encapsulation();
		e1.setUsername("Ram");
		e1.setPassword("Ram@123");

		// List<Encapsulation> li=new ArrayList();
		// li.add(e);
		// li.add(e1);
		// for (Encapsulation a : li) {
		// System.out.println(a.getUsername());
		// System.out.println(a.getPassword());
		// }

//Set<Encapsulation> li = new LinkedHashSet<Encapsulation>();
//li.add(e);
//li.add(e1);
//for (Encapsulation a : li) {
//	System.out.println(a.getUsername());
//	System.out.println(a.getPassword());
//}
		
	Map<Integer, Encapsulation> li =new LinkedHashMap();
		li.put(1, e);
		li.put(2, e1);
		Set<Entry<Integer, Encapsulation>> a = li.entrySet();
		for (Entry<Integer, Encapsulation> b : a) {
			System.out.println(b.getKey());
			System.out.println(b.getValue().getUsername());
			System.out.println(b.getValue().getPassword());
			
		}
			
		
		
		
	}}
