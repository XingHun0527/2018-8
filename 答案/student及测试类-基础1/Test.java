package com.briup.chap08;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		Student s1 = new Student(1,"张三",15,67.0);
		Student s2 = new Student(2,"李四",16,68.0);
		Student s3 = new Student(3,"王五",17,69.0);
		Student s4 = new Student(4,"赵六",18,70.0);
		Student s5 = new Student(5,"钱七",19,71.0);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			System.out.println(stu);
		}
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
	}
}
