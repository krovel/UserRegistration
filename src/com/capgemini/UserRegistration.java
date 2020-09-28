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
        	first=sc.next();
	}
	public void lname() {
		System.out.println("Enter your last name (NOTE: First letter should be capital and shuold have minimum 3 characters) :");
        String first = sc.next();
		Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
		Matcher m = p.matcher(first);
		Boolean check = m.find();
        if(check) {
        	System.out.println("Valid last name.");
        }
        else
        	System.out.println("ERROR ! Requirement not satisfied.");
	}
	public void email() {
		System.out.println("Enter your Email:");
        String email = sc.next();
		Pattern p = Pattern.compile("^abc+([_+-.]{0,1}([a-zA-Z0-9]+))*[@][a-z0-9]{1,}[.]([c][o][m]|[n][e][t])([.][a-zA-Z]{2,}){0,1}$");
		Matcher m = p.matcher(email);
		Boolean check = m.find();
		if(check) {
        	System.out.println("Valid Email.");
        }
        else
        	System.out.println("ERROR ! Requirement not satisfied.");  
	}
	public void mobile() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your Mobile No:");
		String mobile = in.nextLine();
		Pattern p = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
		Matcher m = p.matcher(mobile);
		Boolean check = m.find();
		if(check) {
        	System.out.println("Valid Mobile Number.");
        }
        else
        	System.out.println("ERROR ! Requirement not satisfied.");  
	}
	public void pwd() {
		System.out.println("Enter your Password:");
		String pwd = sc.next();
		Pattern p = Pattern.compile("(?=.*[A-Z])(?=.*\\d)(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{5,}$");
		Matcher m = p.matcher(pwd);
		Boolean check = m.find();
		if(check) {
        	System.out.println("Valid Password.");
        }
        else
        	System.out.println("ERROR ! Requirement not satisfied.");  
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration.");
		UserRegistration u = new UserRegistration();
		u.fname();
		u.lname();
		u.email();
		u.mobile();
		u.pwd();
	}
}