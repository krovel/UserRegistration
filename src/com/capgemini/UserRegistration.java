package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	Scanner sc=new Scanner(System.in);
	public void fname() {
		System.out.println("Enter your first name (NOTE: First letter should be capital and shuold have minimum 3 characters) :");
        String first = sc.next();
		Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
		Matcher m = p.matcher(first);
		Boolean check = m.find();
        if(check) {
        	System.out.println("Valid first name.");
        }
        else
        	System.out.println("ERROR ! Requirement not satisfied.");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration.");
		UserRegistration u = new UserRegistration();
		u.fname();
	}
}