package com.equals;

import java.util.LinkedHashSet;

class Student2{
	private int id;
	private String name;
	
	Student2(int id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class LinkSetExample {
	public static void main(String[] args) {
Student2 s=new Student2(1,"sagar");
Student2 s1=new Student2(2,"saga");
Student2 s2=new Student2(3,"sag");
Student2 s3=new Student2(2,"saga");
Student2 s4=new Student2(4,"s");
Student2 s5=new Student2(1,"sagar");
LinkedHashSet hs=new LinkedHashSet<Student2>();
hs.add(s);
hs.add(s1);
hs.add(s2);
hs.add(s3);
hs.add(s4);
hs.add(s5);
System.out.println(hs);
hs.remove(s4);
hs.add(null);
hs.add(s4);
hs.remove(hs);
hs.spliterator();
System.out.println(hs);
}
}
