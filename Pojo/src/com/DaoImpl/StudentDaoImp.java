package com.DaoImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.Dao.StudentDao;
import com.pojo.Studentpojo;

public class StudentDaoImp implements StudentDao {

private Scanner sc;
private BufferedWriter bw;

@Override
public void search() {
	// TODO Auto-generated method stub
	
}

@Override
public void addStudent() {
	Studentpojo sp=new Studentpojo();
	sc = new Scanner(System.in);

	FileWriter fw=null;
		File f=new File("UV.txt");
		try {
			 fw=new FileWriter(f.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			System.out.println("Enter Student ID");
			sp.setId(sc.nextInt());
			System.out.println("Enter Student name");
			sp.setName(sc.next());
			bw.write(sp.toString());
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fw!=null)
			{
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		FileReader  fr=null;
		try {
			try {
				fr=new FileReader ("UV.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sp.toString());
			}
			
		finally {
			if(fr!=null)
			{
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

}
}

