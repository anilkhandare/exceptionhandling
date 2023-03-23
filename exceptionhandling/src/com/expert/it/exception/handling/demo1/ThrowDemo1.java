package com.expert.it.exception.handling.demo1;

public class ThrowDemo1 {
  public static void numberValidation(long mobileNumber){
	  if(mobileNumber!=8805489){
		 throw new ArithmeticException(" mobile number not validate");
		 
	  }else
		  System.out.println("moible validate");
  
  }
  public static void main(String[] args) {
	numberValidation(9424455);
}
}
