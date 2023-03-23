package com.expert.it.exception.handling.demo1;

public class InnertrycatchDemo1 {
public static void main(String[] args) {
	try{
		 System.out.println("statemnt1");
		 System.out.println("statemnt2");
		 System.out.println("statemnt3");
		 try{
			 System.out.println("statemnt4");
			 System.out.println("statemnt5");
			 System.out.println("statemnt6");
		 }catch(Exception e ){
			 System.out.println("statemnt7");
			
		 }
		 finally{
			 System.out.println(98/0);
			 System.out.println("statement8");
		 }
		 System.out.println("statement 9");
	}catch(Exception e){
		 System.out.println("statement 10");	
	}finally{
		System.out.println(98/0);
		 System.out.println("statement 11");
	}
	System.out.println("statement 12");
}
}
