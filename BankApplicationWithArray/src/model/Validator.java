package model;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
	
	static Scanner sc = new Scanner(System.in);
   
	public  static String validName() {
		
		while(true) {
			System.out.println("Enter name: ");
			String name=sc.next();
		if(Pattern.matches("[A-Za-z]+", name)) {
			return name;
		} else {
			System.out.println("Invalid name.. Plzz Enter again!");
		
		}
		}
	}
	
	
	   
public  static String validAddress() {
		
		while(true) {
			System.out.println("Enter Address: ");
			String address=sc.next();
		if(Pattern.matches("[A-Za-z]+", address)) {
			return address;
		} else {
			System.out.println("Invalid address.. Plzz Enter again!");
		
		}
		}
	}
	
	   
	public  static long validMobileNo() {
		
		while(true) {
			System.out.println("Enter Mobile Number: ");
			long mobile=sc.nextLong();
		if(mobile <= 9999999999l && mobile >= 6000000000l) {
			return mobile;
		} else {
			System.out.println("Invalid mobile no.. Plzz Enter again!");
		
		}
		}
	}
	
	
	   
	public  static String validAdharNo() {
		
		while(true) {
			System.out.println("Enter Adhar Number: ");
			String adhar=sc.next();
		if(Pattern.matches("[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}+", adhar)) {
			return adhar;
		} else {
			System.out.println("Invalid Adhar number.. Plzz Enter again!");
		
		}
		}
	}
	
	
public  static String validPanNo() {
		
		while(true) {
			System.out.println("Enter PanNo: ");
			String name=sc.next();
		if(Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}+", name)) {
			return name;
		} else {
			System.out.println("Invalid PanNo.. Plzz Enter again!");
		
		}
		}
	}



public  static String validEmail() {
	
	while(true) {
		System.out.println("Enter email: ");
		String email=sc.next();
	if(Pattern.matches("^[A-Za-z0-9]+@[A-Za-z]+.com", email)) {
		return email;
	} else {
		System.out.println("Invalid email.. Plzz Enter again!");
	
	}
	}
}
public  static double validBalance() {
	
	while(true) {
		System.out.println("Enter Balance: ");
		double balance=sc.nextDouble();
		if (balance >= 0) {
		    return balance;
		} else {
		    System.out.println("Invalid Account Balance");
		}
	
	}
	}
}

	

	



