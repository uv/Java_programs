package com.DaoImpl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.pojo.Teacherpojo;;
public class TeacherDaoImpl {

private Scanner sc;
private BufferedWriter bw;
public void addTeacher() {
	Teacherpojo tp=new Teacherpojo();
	sc = new Scanner(System.in);

	FileWriter fw=null;
		File f=new File("UV1.txt");
		try {
			 fw=new FileWriter(f);
			bw = new BufferedWriter(fw);
			System.out.println("Enter Teacher name");
			tp.setTeacher_name(sc.next());
			System.out.println("Enter Teacher Subject");
			tp.setSubject(sc.next());
			
			bw.write(tp.toString());
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
				fr=new FileReader ("UV1.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(tp.toString());
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
