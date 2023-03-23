package com.expert.it.exception.handling.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingDemo2 {
  public static void main(String[] args) {
	 FileInputStream filedata=null;
	 try {
		filedata = new FileInputStream("D:/exception/test.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		System.out.println("i am  fianlly block ");
	}
	 int i;
	 try {
		while((i=filedata.read())!=-1){
			 System.out.println((char)i);
		 }
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	finally{
		System.out.println("i am  fianlly block ");
	}
	 try {
		filedata.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	finally{
		System.out.println("i am  fianlly block ");
	}
}
}
