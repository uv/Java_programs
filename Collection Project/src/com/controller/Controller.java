package com.controller;

import java.io.FileNotFoundException;

import com.DaoImpl.StudentDaoImpl;
import com.DaoImpl.TeacherDaoImpl;

public class Controller {

	public static void main(String[] args) throws FileNotFoundException {
		StudentDaoImpl sdi=new StudentDaoImpl();
		TeacherDaoImpl tdi=new TeacherDaoImpl(); 
		sdi.addStudent();
		tdi.addTeacher();
		sdi.search();

	}

}
