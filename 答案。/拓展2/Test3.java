package com.briup.chap08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		HashSet<String> set=new HashSet<>();
		list.add("a");
		list.add("b");
		list.add("a");
		set.addAll(list);
		
		/*Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			set.add(iterator.next());
		}*/
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		String[] a=new String[12];
		list.toArray(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
