/*package com.expert.it.exception.handling.demo1;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
	  
		 try{
			 
			 System.out.println(10/0);
		 }catch(Exception e){
			 System.out.println(" defualthandler ");
		 }catch(ArithmeticException ae){
			 ae.printStackTrace();
		 }
	}
}
// this is the approach  not recommended to handle multiple catch blocks bcz exception is default handler 



class MultipleCatchBlocks1{
	
	 public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
// this is approach to use highly recommended  multiple catch block 
  // output : java.lang.ArithmeticException: / by zero
//at com.expert.it.exception.handling.demo1.MultipleCatchBlocks1.main(MultipleCatchBlocks.java:25)*/