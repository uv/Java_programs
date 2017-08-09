package com.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputExample {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fos=new FileOutputStream("text.txt");
			fos.write(100);
			fos.write('a');
			String s="yuvi";
			byte[] b=s.getBytes();
			fos.write(b);
			System.out.println("Process Completed... ");
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
		try {
			fis=new FileInputStream("text.txt");
			int i=fis.read();
			while(i!=-1)
			{
				char c=(char)i;
				System.out.print(c);
				i=fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


