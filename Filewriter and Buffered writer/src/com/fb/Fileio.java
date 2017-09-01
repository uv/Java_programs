package com.fb;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
class book implements Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
    String author;
    int nop;
    int price;
    int discount;

    void getDiscount()
    {
        int finalprice=price-((price/discount));
        System.out.println("Final price after discount="+finalprice);
    }

    public String toString() {
    return name + author +nop + price +discount;
    // above can be any format whatever way you want


    }
}
	class Fileio
	{
		  public static void main(String args[])
		    {
		        Fileio mainObject=new Fileio();

		        book javabook=new book();
		        javabook.name="Java unleashed";
		        javabook.author="someone";
		        javabook.nop=1032;
		        javabook.price=450;
		        javabook.discount=10;
		        javabook.getDiscount();
		        mainObject.writeToFile(javabook);
		    }
		        public void writeToFile(book javabook)
		        {
		        try
		        {
		        File file=new File("JavaBook1.txt");
		        FileWriter fw=new FileWriter(file.getAbsoluteFile());
		        BufferedWriter bw=new BufferedWriter(fw);
		        bw.write(javabook.toString());
		        System.out.println(javabook);
		        bw.close();
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }

		    }
		}