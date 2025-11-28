package com.mphasis;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
//		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
//		hashMap.put(1,"Hyderabad");
//		hashMap.put(34,"Bangalore");//Bangalore changed bcaz of duplication
//		hashMap.put(25,"Chennai");
//		hashMap.put(46,"Coimbatore");
//		hashMap.put(34,"Delhi");//34 replaced with Delhi
//		System.out.println(hashMap);
//		System.out.println(hashMap.keySet());
//		System.out.println(hashMap.values());
//		System.out.println(hashMap.entrySet());
//		System.out.println(hashMap.get(34));
//		System.out.println(hashMap.getOrDefault(1, "No Data"));
//		System.out.println(hashMap.getOrDefault(3, "No Data"));
//		//System.out.println(hashMap);
//		
//		Set<Integer> keySet=hashMap.keySet();
//		Iterator<Integer> keyItr=keySet.iterator();
//		while(keyItr.hasNext())
//			System.out.println(keyItr.next());
//		
//		
//		Set<String> valueSet=new HashSet<>((hashMap.values()));
//		Iterator<String> valItr=valueSet.iterator();
//		while(valItr.hasNext())
//			System.out.println(valItr.next());
//		
//		Iterator<Entry<Integer,String>> entryItr=hashMap.entrySet().iterator();
//		while(entryItr.hasNext())
//			System.out.println(entryItr.next());
		
		
//		TreeMap<Integer,Integer> tm=new TreeMap<Integer, Integer>();
//		tm.put(1, 1);
//		tm.put(4, 16);
//		tm.put(2, 4);
//		tm.put(7, 49);
//		tm.put(10, 100);
//		tm.put(5, 25);
//		tm.put(6, 36);
//		tm.put(3, 9);
//		System.out.println(tm);
//		System.out.println(tm.ceilingKey(7));//7
//		System.out.println(tm.ceilingEntry(8));//10=100
//		System.out.println(tm.higherKey(7));//10
//		System.out.println(tm.descendingMap());
//		System.out.println(tm.navigableKeySet());
//		System.out.println(tm.floorKey(7));//7
//		System.out.println(tm.floorKey(8));//7
		
		TreeMap<Student,Department> psmap=new TreeMap<Student, Department>();
		psmap.put(new Student(2,"Saranya",21,"Erode",80.40),new Department(102,"ECE"));
		psmap.put(new Student(1,"Parveen",22,"CBE",80.70),new Department(101,"CSE"));
		psmap.put(new Student(4,"Ashik",24,"CBE",85.70),new Department(102,"ECE"));
		psmap.put(new Student(3,"Sathis",22,"DPM",80.20),new Department(101,"CSE"));
		psmap.put(new Student(5,"Wahith",14,"CBE",70.70),new Department(103,"EEE"));
		psmap.put(new Student(5,"Mohammed Wahith",14,"CBE",70.70),new Department(103,"EEE"));
		//System.out.println(psmap);
		Iterator<Entry<Student,Department>> entryItr=psmap.entrySet().iterator();
		while(entryItr.hasNext())
			System.out.println(entryItr.next());
		
//		Hashtable<Integer,String> table=new Hashtable<Integer, String>();
//		table.put(2, "Parveen");
//		table.put(5, "Banu");
//		table.put(1, "Saranya");
//		table.put(12, "Ashik");
//		table.put(22, "Wahith");
//		table.put(8, "Sathis");
//		System.out.println(table);
//		
//		Enumeration<Integer> enums=table.keys();
//		while(enums.hasMoreElements())
//			System.out.println(enums.nextElement());
//		
//		Enumeration<String> enumVal=table.elements();	//can't use .values()
//		while(enumVal.hasMoreElements())
//			System.out.println(enumVal.nextElement());
		
		
		
		
		
		
		
		
		
	}

}
