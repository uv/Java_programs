package com.DaoImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.Dao.StudentDao;
import com.pojo.Studentpojo;

public class StudentDaoImp implements StudentDao {

private Scanner sc;
private ObjectOutputStream oos;

@Override
public void search() {
	// TODO Auto-generated method stub
	
}

@Override
public void addStudent() {
	Studentpojo sp=new Studentpojo();
	sc = new Scanner(System.in);

	 FileOutputStream fos=null;
		File f=new File("UV.txt");
		try {
			 fos=new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			System.out.println("Enter Student ID");
			sp.setId(sc.nextInt());
			System.out.println("Enter Student name");
			sp.setName(sc.next());
			oos.writeObject(sp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}


	
}
