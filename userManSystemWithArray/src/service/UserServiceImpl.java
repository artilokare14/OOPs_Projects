package service;

import java.util.Scanner;

import model.Constant;
import model.User;
import model.Validator;

public class UserServiceImpl implements UserService {
 Scanner sc =new Scanner(System.in);
 User[] users=new User[Constant.max_Size];
 
 
	@Override
	public void createUser() {
		System.out.println("Enter no of user you want to create: ");
		int u=sc.nextInt();
		for(int i=0;i<u;i++) {
			User us=new User();
		us.setUserId(Validator.validUserId());
		us.setUserName(Validator.validUserName());
		us.setAge(Validator.validAge());
		us.setAddress(Validator.validAddress());
		us.setMobileNo(Validator.validMobileNo());
		us.setAdharNo(Validator.validAdharNo());
		us.setPanNo(Validator.validPanNo());
		us.setEmail(Validator.validEmail());
		users[i]=us;
					
		System.out.println(String.format("User %s Added Successfully!!!", us.getUserName()));
		}
	}

	@Override
	public void displayUserDetails() {
		 System.out.println("Enter User ID: ");
		    int uid = sc.nextInt();

		    for (int i = 0; i < users.length; i++) {
		        if (users[i] != null && uid == users[i].getUserId()) {
		            System.out.println(users[i]);
		            return;
		        }
		    }

		    System.out.println("Invalid User ID");
	
		
		
	}

	@Override
	public void updateUserDetails() {
		System.out.println("Enter User ID: ");
        int uid = sc.nextInt();
        for(int i=0;i<users.length;i++) {
        	if (users[i] != null && uid == users[i].getUserId()) {
            System.out.println("Enter New Name: ");
            users[i].setUserName(sc.next());
            System.out.println("Enter New Address: ");
            users[i].setAddress(sc.next());
            System.out.println("Enter New Mobile No.: ");
            users[i].setMobileNo(sc.nextLong());
            System.out.println("User Details Updated Successfully.");
            return;
        } 
        }
        System.out.println("Invalid User No.");
	}

	@Override
	public void deleteUser() {
		System.out.println("Enter User ID: ");
        int uid = sc.nextInt();
        for(int i=0;i<users.length;i++) {
        if (users[i] != null && uid == users[i].getUserId()) {
            users[i] = null;
            System.out.println("User deleted successfully!");
            return;
        } 
        
        
	}
        System.out.println("Invalid User ID.");
		
	}

}
