package day20_stringManupilation_part2;

import java.util.Scanner;

public class task_82 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your username: ");
		
		String userName = scan.nextLine();
		
		System.out.print("Enter your password: ");
		
		String password = scan.nextLine();
		
		String userNameInSystem = "Mike";
		String passwordInSystem = "123";
		
		if(userName.equals("") && password.equals("")) {
			
			System.out.println("UserName and Password fields cannot be empty");
			
		}else if(userName.equals("") && !password.equals("")) {
			
			System.out.println("UserName cannot be empty");
			
		}else if(!userName.equals("") && password.equals("")){
			
			System.out.println("Password cannot be empty");
			
		}else if(!userName.equals(userNameInSystem) || !password.equals(passwordInSystem)) {
			
			System.out.println("UserName and Password not valid, please verify");	
			
		}else if(userName.equals(userNameInSystem) && password.equals(passwordInSystem)) {
			
			System.out.println("User logged in successfully");	
		}

	}

}
