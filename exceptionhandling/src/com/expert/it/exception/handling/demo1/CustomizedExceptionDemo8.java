package com.expert.it.exception.handling.demo1;

public class CustomizedExceptionDemo8 {
	public static void ageValidation(){
		int age=10;
		if(age>60){
			throw new AgeValidationException("your too old");
		}else 
			throw new AgeValidationException("your younger");
	}
	public static void dobValidation(){
		String dob="4/2/2000";
		if(dob.equals(4/2/2001)){
			throw new DobValidationException("dob is matched");
		}
		else {
			throw new DobValidationException("dob not matched please provide correct dob");

		}
	}
  public static void main(String[] args) {
	  ageValidation();
	  dobValidation();
	
	
}
}
