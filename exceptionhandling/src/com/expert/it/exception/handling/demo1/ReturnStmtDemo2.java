package com.expert.it.exception.handling.demo1;

public class ReturnStmtDemo2 {
 public static void main(String[] args) {
	 System.exit(-1);
	 System.out.println(method1());
	
}
 public static int method1() {
	try{
		System.out.println("try block executed");
		System.out.println(65/0);
		return 10;
	}catch(Exception e ){
	System.out.println("catch block executed");
	
	return 20;
	
	}
	finally {
		System.out.println("finally block executed");
	}
} 
}
