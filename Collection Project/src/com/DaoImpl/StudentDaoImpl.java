package com.DaoImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import com.Dao.StudentDao;
import com.pojo.Studentpojo;

public class StudentDaoImpl implements StudentDao {

private Scanner sc;
private BufferedWriter bw;
ArrayList<Object> al=new ArrayList<>();
//private Scanner scanned;
public void search() {
}
 


@Override
public void addStudent() {
	Studentpojo sp=new Studentpojo();
	sc = new Scanner(System.in);

	FileWriter fw=null;
	
		File f=new File("UV.txt");
		try {
			int n=0;
			 fw=new FileWriter(f.getAbsoluteFile(),true);
			bw = new BufferedWriter(fw);
			System.out.println("Enter Student ID");
			sp.setId(sc.nextInt());
			System.out.println("Enter Student name");
			sp.setName(sc.next());
			al.add(sp);
			
			System.out.println("Do you want to perform Again Yes=1 and No=0");
			n=sc.nextInt();
			if(n==1)
			{
				addStudent();
			}
			else {
				bw.write(al.toString());
			}
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
			 ListIterator<Object> litr = null;
			litr=al.listIterator();
			//System.out.println(al); 
		    while(litr.hasNext()) {  
		    	 System.out.println(litr.next());
		    } 
			
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

