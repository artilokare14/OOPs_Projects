package model;

import java.util.Scanner;

//import model.Register;

public class Login {
	Scanner sc = new Scanner(System.in);

    public void loginUser() {
    	System.out.println("--------Now Lohin--------");

        if (Register.email == null || Register.password == null) {
            System.out.println("Please Register First!");
            return;
        }
        while(true) {
        System.out.println("Enter Email: ");
        String email = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        if (email.equals(Register.email) && password.equals(Register.password)) {
            System.out.println("Login Successful!");
            break;
        } else {
            System.out.println("Invalid Email or Password!");
        }
        }
    }
}
