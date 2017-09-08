package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.net.ssl.HandshakeCompletedEvent;

class Student
{
	private int id;
	private String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class IteratorExample {

	public static void main(String[] args) {
	List l=new ArrayList<>();
	Student s=new Student(1,"yuvi");
	Student s1=new Student(2,"uv");
	Student s2=new Student(3,"uva");
	Student s5=new Student(4,"Mayur");
	l.add(s);
	l.add(s1);
	ListIterator itr=l.listIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.nextIndex());
		Student s3=(Student)itr.next();
		
		
		itr.set(s2);
	/*	if(s3.getId()==2)
		{
		itr.remove();
		}*/
		System.out.println(l);
	}
	//System.out.println(l);

	/*while(itr.hasPrevious())
	{
		System.out.println(itr.previousIndex());
		Student s4=(Student)itr.previous();
		itr.set(s5);
		System.out.println(l);
	}*/
	//l.add(s5);
System.out.println(l);
	System.out.println(itr.nextIndex());
	System.out.println(itr.previousIndex());
	}

}
