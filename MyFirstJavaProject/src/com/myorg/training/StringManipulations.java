package com.myorg.training;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparing two strings
		
		/*String s1 ="Hello";
		String s2 ="Hello";
		String s3 ="hello";
		
		if(s1 == s2){
			System.out.println("Equal");
		}
		if(s1 == s3){
			System.out.println("Equal");
		}
		
		if(s1.equals(s3)){
			System.out.println("Equals");
		}
		if(s1.equalsIgnoreCase(s3)){
			System.out.println("Equals");
			*/
			String msg ="How Are You";
			if(msg.indexOf("You") != -1){
				System.out.println("found");
			} else{
				System.out.println("Not Found");
		}
	System.out.println(msg.toUpperCase());
	System.out.println(msg.toLowerCase());
	
			
			
	}

}
