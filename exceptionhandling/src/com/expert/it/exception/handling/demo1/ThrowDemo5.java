package com.expert.it.exception.handling.demo1;

public class ThrowDemo5 {
 public static void main(String[] args) {
	System.out.println(82/0);
	 
	throw new ArithmeticException("/by zero");
	System.out.println("statement2"); // compile time exception (unreachable code)
}
}
