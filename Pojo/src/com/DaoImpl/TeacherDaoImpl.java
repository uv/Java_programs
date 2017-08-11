package com.DaoImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.pojo.Teacherpojo;;
public class TeacherDaoImpl {

private Scanner sc;
private ObjectOutputStream oos;

public void addTeacher() {
	Teacherpojo tp=new Teacherpojo();
	sc = new Scanner(System.in);

	 FileOutputStream fos=null;
		File f=new File("UV1.txt");
		try {
			 fos=new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			System.out.println("Enter Teacher name");
			tp.setTeacher_name(sc.next());
			System.out.println("Enter Teacher Subject");
			tp.setSubject(sc.next());
			
			oos.writeObject(tp);
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
