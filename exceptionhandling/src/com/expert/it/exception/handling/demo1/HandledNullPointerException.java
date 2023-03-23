package com.expert.it.exception.handling.demo1;

public class HandledNullPointerException {
	
	static {
		System.out.println("i am static block");
	}
	
	
 public static void main(String[] args) {
	 String username=null;
	 try{
		 if( username == null){
			 throw new NullPointerException(" null pointer exception");
		 }
		 if ("anilkh".equals(username)){
			 System.out.println("username match and login sucessfully ");
		 }else
			 System.out.println("invalid user or might its null value");
	 }catch(NullPointerException npe){
		 npe.printStackTrace();
	 }
}
}
