package com.pojo;

public class Teacherpojo{
private String teacher_name;
private String subject;
public Teacherpojo(String teacher_name, String subject) {
	super();
	this.teacher_name = teacher_name;
	this.subject = subject;
}
public Teacherpojo() {
	// TODO Auto-generated constructor stub
}
public String getTeacher_name() {
	return teacher_name;
}
public void setTeacher_name(String teacher_name) {
	this.teacher_name = teacher_name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "Teacherpojo [teacher_name=" + teacher_name + ", subject=" + subject + "]";
}

}
