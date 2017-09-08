package com.equals;

class Student{
	private int id;
	private String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st=(Student) obj;
			return this.id==st.id;
		}
		else {
			return false;
		}
	}
}
public class EqualsMethosExample {

	public static void main(String[] args) {
		Student std=new Student(1,"uv");
		Student std1=new Student(1,"uv");
		boolean b=std.equals(std1);
		System.out.println(b);
	}

}
