package com.expert.it.exception.handling.demo1;

public class Execptiondemo2 {
 public static void main(String[] args) {
	try{
		System.out.println("statement1");
		System.out.println(10/0);
		System.out.println("statement2");
	}catch(Exception e){
		System.out.print(10/2);
		e.printStackTrace();// this methods pring exception information with name of excepiton: decription of exception  and track trace(it means location of the exception)
		// output: java.lang.ArithmeticException: / by zero	at com.expert.it.exception.handling.demo1.Execptiondemo2.main(Execptiondemo2.java:7)

		System.out.println(e.toString()); // this method prints exception infromation with the name of exception and decsription of exception 
		// output: java.lang.ArithmeticException: / by zero
		
		System.out.println(e.getMessage()); // this method retruns only description of exception 
		// output: / by zero
	}
}
}
