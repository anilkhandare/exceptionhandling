package com.expert.it.exception.handling.demo1;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		method1();
	}
public static void method1(){
	method2();
}
public static void method2(){
	System.out.println("hello");
}
}
