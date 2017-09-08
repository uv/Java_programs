package com.equals;

import java.util.HashSet;

class Student1{
	private int id;
	private String name;
	
	public Student1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}

	public boolean equals(Object obj) {
		if(obj instanceof Student1) {
			Student1 st=(Student1) obj;
			return this.id==st.id;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return this.id;
	}
	
}
public class EqualsAndHashCodeContractExample {

	public static void main(String[] args) {
		
		Student1 std=new Student1(1,"uv");
		Student1 std1=new Student1(1,"uv");
		Student1 std2=new Student1(2,"uv");
		Student1 std3=new Student1(3,"uv");
		Student1 std4=new Student1(4,"uv");
		Student1 std5=new Student1(3,"uv");
		Student1 std6=new Student1(5,"uv");
		Student1 std7=new Student1(6,"uv");
		HashSet hs=new HashSet<Student1>();
		hs.add(std7);
		hs.add(std6);
		hs.add(std5);
		hs.add(std4);
		hs.add(std3);
		hs.add(std2);
		hs.add(std1);
	}

}
