package com.expert.it.exception.handling.demo1;

public class ThrowExceptionHandlingDemo2 {
 public static void main(String[] args) {
	m1();
}
 public static void m1(){
	 m2();
 }
 public static void m2(){
	 throw new ArithmeticException("/please do correct operation");
 }
}
