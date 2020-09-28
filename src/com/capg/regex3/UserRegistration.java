package com.capg.regex3;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration");
		for(int i=0;;) {
		System.out.println("Enter first name (Start with capital):");
		String fname = sc.nextLine();
		Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(fname);
		boolean matchfound = matcher.find();
		if(matchfound) {
			break;
		}
		else {
			System.out.println("Invalid name (Start with capital and should have min 3 charcaters ");
			
		
		}
		}
		for(int i=0;;) {
			System.out.println("Enter last name (Start with capital):");
			String lname = sc.nextLine();
			Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
			Matcher matcher = pattern.matcher(lname);
			boolean matchfound = matcher.find();
			
			if(matchfound) {
				break;
			}
			else {
				System.out.println("Invalid name (Start with capital and should have min 3 charcaters ");
				
			
			}
			}
		for(int i=0;;) {
			System.out.println("Enter Email ID: ");
			String email = sc.nextLine();
			Pattern pattern =Pattern.compile("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}");
			Matcher matcher = pattern.matcher(email);
			boolean matchfound = matcher.find();
			
			if(matchfound) {
				break;
			}
			else {
				System.out.println("Invalid email ");
				
			
			}
			}
		for(int i=0;;) {
			System.out.println("Enter phone number: ");
			String phoneNumber = sc.nextLine();
			Pattern pattern =Pattern.compile("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
			Matcher matcher = pattern.matcher(phoneNumber);
			boolean matchfound = matcher.find();
			
			if(matchfound) {
				break;
			}
			else {
				System.out.println("Invalid number (Enter in this format: 91 9919819801) ");
				
			
			}
			}
		for(int i=0;;) {
			System.out.println("Enter password: \n(min. 8 char)");
			String password = sc.nextLine();
			Pattern pattern =Pattern.compile("(?=.*[A-Z])(?=.*\\d)([a-zA-Z0-9]){8,}");
			Matcher matcher = pattern.matcher(password);
			boolean matchfound = matcher.find();
			
			if(matchfound) {
				System.out.println("Correct entry");
				break;
			}
			else {
				System.out.println("Invalid password ");
				
			
			}
			}
		
		
	}
}
