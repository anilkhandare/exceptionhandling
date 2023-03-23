package com.expert.it.exception.handling.demo1;

public class FianllyBlockDemo2 {
public static void main(String[] args) {
	try{
		System.out.println("try block executed");
		System.out.println(45/0);
	
	}catch(NullPointerException ae){
		System.out.println("please do the correct arithmetic operation ");
	}finally{
		System.out.println("finally block execucted ");
	}
}
}
