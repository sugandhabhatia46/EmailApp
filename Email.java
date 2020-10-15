package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String Email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	
	//constructor to recieve the first name & last name
	
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call a method for asking for dep - return department
		
		this.department = setDepartment();
		
		//call a method to gen random password
		this.password = randomPassword(defaultPasswordLength);
		
		//combine element to generate email
		Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + 
		department + "." + companySuffix;
		
		System.out.println("Your Email is: " + Email);
		
	}
	
	
	//Ask for department
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES: Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		
		
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Dev";
		} else if (depChoice == 3) {
			return "Acct";
		} else {
			return " ";
		}
	}
	
	//Generate random password
	
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++) {
			int rand = (int)Math.random() * passwordSet.length();
			password[i] = passwordSet.charAt(rand);
		} return new String (password);
	}
	
	
	//Set the mailbox Capacity
	public void SetMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + Email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}

}
