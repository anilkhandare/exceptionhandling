package com.expert.it.exception.handling.demo1;

import java.util.Scanner;

class HandleExceptionDemo7{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("welcome to SBI");
		int ch;
		SBISavingAC ac=new SBISavingAC(333, "anil", 2000, 29);
		boolean b=true;
		String str;
		try{
			while(b){
				for(int i=0;i<20;i++){
					System.out.print("-------");
				}
				System.out.println("");
				System.out.println("\tMenu");
				System.out.println("1.Create Account");
				System.out.println("2. Deposit Money");
				System.out.println("enter your choice");
				ch=s.nextInt();
				switch(ch){
				case 1: System.out.println("please enter details");
				        System.out.println("Please enter name:");
				        str=s.next();
				        ac.setName(str);
				        System.out.println("Please enter age:");
				        ch=s.nextInt();
				        ac.setAge(ch);
				        System.out.println("Please enter account number:");
				        ch=s.nextInt();
				        ac.setAccountNumber(ch);
				        System.out.println("Please enter balance:");
				        ch=s.nextInt();
				        ac.setBalance(ch);
				        System.out.println("account is created");
				        System.out.println("accountdetails:"+ac);
				        break;
				case 2:System.out.println("deposit section"); 
				       System.out.print("please enter accont");
				       ch=s.nextInt();
				       try{
				    	   if(ac.getAccountNumber()==ch){
				    		   System.out.println("enter money to be deposited");
				    		   try{
				    			   if(ch<500){
				    				   throw new CustomeExecption("minimum balance deposited");
				    			   }else{
				    				   int bb;
				    				   bb=ac.getBalance();
				    				   ac.setBalance(bb);
				    			   }
				    		   }catch(Exception e){
						    	   System.out.println(e.getCause());
						    	   System.out.println("transaction failed");
						    	   b=false;
						       }
				    	   }else {
		    				   throw new CustomeExecption("account not found");

				    	   }
				    	   
				       }catch(Exception e){
				    	   System.out.println(e.getCause());
				    	   System.out.println("transaction failed");
				    	   b=false;
				       }
				       break;
				}
			}
		}catch(Exception e){
			System.out.println("transation failed");
		}
	}
}
