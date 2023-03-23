package com.expert.it.exception.handling.demo1;

public class FinalizeMethodDemo1 {
public static void main(String[] args) {
	
	FinalizeMethodDemo1 f= new FinalizeMethodDemo1();
	f.finalize();
	f.finalize();
	f=null;
	f.finalize();
	System.gc();
	System.out.println("end of main mehtod");
	
}
public void finalize(){
	System.out.println("override finalize method");
	System.out.println(45/0);
}

}
