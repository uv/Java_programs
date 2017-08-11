package com.controller;

import com.DaoImpl.StudentDaoImp;
import com.DaoImpl.TeacherDaoImpl;

public class Controller {

	public static void main(String[] args) {
		StudentDaoImp sdi=new StudentDaoImp();
		TeacherDaoImpl tdi=new TeacherDaoImpl(); 
		sdi.addStudent();
		tdi.addTeacher();

	}

}
