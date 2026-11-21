package controller;

import java.util.Scanner;

import model.Login;
import model.Register;
import service.UserService;
import service.UserServiceImpl;

public class UserController {
	public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        //Register.registerUser();
        //Login l = new Login();        
        //l.loginUser();

        UserService us = new UserServiceImpl();
        

        System.out.println("----WELCOME TO USER SERVICE MANAGEMENT----");
        System.out.println("-------------------------------------------");

        boolean flag = true;

        while (flag) {

            System.out.println("1. Create User");
            System.out.println("2. Display User Details");
            System.out.println("3. Update User Details");
            System.out.println("4. Delete User Info");
            System.out.println("5. Exit...!");
            System.out.println("-----------------------------------------");

            System.out.println("Enter Your Choice: ");
      
	try {

            int ch = sc.nextInt();

            switch (ch) {

            case 1:
            	us.createUser();
               break;
            case 2:
            	us.displayUserDetails();
               break;
            case 3:
            	us.updateUserDetails();
                
                break;
            case 4:
               us.deleteUser();
                break;
            
            case 5:
                flag = false;
                System.out.println("Application Exit.... Thank You for Visiting!");
                break;
            default:
                System.out.println("Invalid choice.... Choose again");
                break;
            }
	}catch(Exception e) {
		System.out.println(e);
		return;
	}
         
        }

        }

}
