package com.briup.chap07;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		Student s1= new Student(12,"zhangsan",45);
		Student s2= new Student(12,"tom",46);
		Student s3= new Student(12,"lisi",48);
		ArrayList<Student> list=new ArrayList<>();
		ArrayList list1=new ArrayList();
	    list.add(s1);
	    list.add(s2);
	    list.add(s3);
	    Iterator<Student> iterator = list.iterator();
	    while(iterator.hasNext()){
	    	System.out.println(iterator.next());
	    }
	    System.out.
println("------------------");
	    TreeSet<Student> tree=new TreeSet<>();
	    tree.add(s1);
	    tree.add(s2);
	    tree.add(s3);
	    Iterator<Student> iterator2 = tree.iterator();
	    while(iterator2.hasNext()){
	    	System.out.println(iterator2.next());
	    }
	}
}
