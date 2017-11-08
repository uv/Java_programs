package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Comparable, Comparable> hm=new HashMap<Comparable, Comparable>();
		hm.put("id",1);
		hm.put(101,"xyz");
		hm.put("Name", "yuvi");
		hm.put("Address", "pune");
		System.out.println(hm);
		
		HashMap<String, Comparable> hm1=new HashMap<String, Comparable>();
		hm1.put("id",2);
		hm1.put("Name", "Namrata");
		hm1.put("Address", "Solapur");
		System.out.println(hm1);
		
		HashMap<String, Comparable> hm2=new HashMap<String, Comparable>();
		hm2.put("id",3);
		hm2.put("Name", "asif");
		hm2.put("Address", "mumbai");
		System.out.println(hm2);
		
		HashMap<Object, Object> hm4=new HashMap<>();
		hm4.putAll(hm);
		hm4.putAll(hm1);
		hm4.putAll(hm2);
		
		Set<Object> s1=hm4.keySet();
		System.out.println(s1);
		
		String s=(String)hm.get("Name");
		System.out.println(s);
		
		hm4.containsKey(hm);
		
		

	}

}
