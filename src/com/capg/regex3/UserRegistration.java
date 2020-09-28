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
				System.out.println("Correct entry");
				break;
			}
			else {
				System.out.println("Invalid email ");
				
			
			}
			}
		
		
	}
}
