package com.expert.it.exception.handling.demo1;

public class FianallyBlockDemo1 {
public static void main(String[] args) {
	try {
		System.out.println("try block");
	}catch(ArithmeticException ae){
		System.out.println(" catch block is executed");
	}finally{
		System.out.println("finally block executed");
	}
}
}
