package model;

import java.util.Scanner;

public class Register {
	static Scanner sc=new Scanner(System.in);
	static Validator v=new Validator();
	
	static String email;
	static String password;
	
	public static void registerUser() {
		System.out.println("----Register to user Management system----");
		//System.out.println("Enter email: ");
	     
		email =Validator.validEmail();
		
		
		//System.out.println("Enter Passwprd");
		
		password=Validator.validPassword();
		System.out.println("Registered Successfully!");
	}
}
