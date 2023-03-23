package com.expert.it.exception.handling.demo1;

public class ReturnStmtDemo1 {
 public static void main(String[] args) {
	try {
		System.out.println("try block executed");
		System.out.println(45/0);
		return;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("catch block executed");
	}
	finally {
		System.out.println("finally block executed");
	}
}
}
