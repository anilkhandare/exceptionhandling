package com.expert.it.exception.handling.demo1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsDemo1{
  public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw= new PrintWriter("test.txt");
	pw.print("testing throws");
	
}
  public ThrowsDemo1() throws FileNotFoundException{
	// TODO Auto-generated constructor stub
}
}
