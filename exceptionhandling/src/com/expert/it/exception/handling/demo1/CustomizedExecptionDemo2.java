package com.expert.it.exception.handling.demo1;

public class CustomizedExecptionDemo2 {
 public static void main(String[] args) {
	 System.out.println("statement1");
	 try{
	 System.out.println(10/0);
	 }catch(ArithmeticException a){
		 //a.printStackTrace();
		 System.out.println(10/2);
	 }
	 System.out.println("statement2");
}
}

