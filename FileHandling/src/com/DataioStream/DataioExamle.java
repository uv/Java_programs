package com.DataioStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class DataioExamle {
 
  public static void main(String[] args) {
   
    String strFilePath = "text.txt";
   
    try
    {
      FileOutputStream fos = new FileOutputStream(strFilePath);
     
       DataOutputStream dos = new DataOutputStream(fos);
     
       int i = 100;
     
        dos.writeInt(i);
             
         dos.close();
       
    }
    catch (IOException e)
    {
      System.out.println("IOException : " + e);
    }
 
  }
}