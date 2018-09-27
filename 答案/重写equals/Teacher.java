package com.briup.chap08;

public class Teacher{

	private long id;
	private String name;
	private int age;
	public Teacher(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		else if(!(o instanceof Teacher)){
			return false;
		}
		Teacher tea=(Teacher)o;
		return this.name.equals(tea.name) && this.age==tea.age;
	}
}
