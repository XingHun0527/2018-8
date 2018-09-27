package com.briup.chap07;

public class Student implements Comparable{

	private long id;
	private String name;
	private double score;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	//-1   stu1.equals(stu2)  stu1>stu2 1
	//1                        79   76
	//0
	//假如stu1  "tom"  stu2 "zhangsan"  1
	//          "zhangsna"    "tom"     -1
	//            >         1
	//            <         -1
	//            =         0
	@Override
	public int compareTo(Object o) {
     //this	后       传 前	                   
	   Student stu=(Student)o;
	   if(this.name=="tom"&&stu.getName()!="tom"){
		   return -1;
	   }else if(this.name!="tom"&&stu.getName()=="tom"){
		   return 1;
	   }else{
		   if(this.getScore()>stu.getScore()){
			   return -1;
		   }else if(this.getScore()<stu.getScore()){
			   return 1;
		   }else{
			   return 0;
		   }
		   
	   }
	
		
	}
	
}
