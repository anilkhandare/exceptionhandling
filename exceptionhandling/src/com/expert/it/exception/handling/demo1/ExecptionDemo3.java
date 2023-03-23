package com.expert.it.exception.handling.demo1;


public class ExecptionDemo3 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
	          			 
		   
		    
		}
		// event we cant use finally block also inside the try and catch block
		/*finally {
			System.out.println("its fianlly");
		}*/
	// i am trying to use while statement inside try and catch block	
	/*	int i=1;
		while(i<1){
			System.out.println("im in while");
		}*/
	// we cant use any statement inside the try and catch block
		catch(Exception e){
			e.printStackTrace();
		}
	/*	int i=1;
		while(i<1){
			System.out.println("im in while");
		}*/
		// you cant keep statement here 
		finally {
			System.out.println("its fianlly");
		}
	}
}
