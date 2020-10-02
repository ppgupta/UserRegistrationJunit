package com.BridgeLabz.JunitTest;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	public  boolean isValidFirstName(String firstName ) {
		String regex="^[A-Z]{1}[a-z]{2,}";
		Pattern p=Pattern.compile(regex);
		if(firstName==null) {
			return false;
		}
		Matcher m=p.matcher(firstName);
		return m.matches();
	}
	public  boolean isValidLastName(String lastName ) {
		String regex="^[A-Z]{1}[a-z]{2,}";
		Pattern p=Pattern.compile(regex);
		if(lastName==null) {
			return false;
		}
		Matcher m=p.matcher(lastName);
		return m.matches();
	}
	public  boolean isValidEmail(String email) {
      String regex=	"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

		Pattern p=Pattern.compile(regex);
		if(email==null) {
			return false;
		}
		Matcher m=p.matcher(email);
		return m.matches();
	}
	public   boolean isValidMobileNum(String mobile) {
	      String regex=	"^((\\+)?(\\d{1,2}[\\s]))?(\\d{10}){1}?$";

			Pattern p=Pattern.compile(regex);
			if(mobile==null) {
				return false;
			}
			Matcher m=p.matcher(mobile);
			return m.matches();
		}
		public  boolean isValidPassword(String pass) {

			 String regex=	"(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(.).{7,}";
			Pattern p=Pattern.compile(regex);
			if(pass==null) {
				return false;
			}
			Matcher m=p.matcher(pass);
			return m.matches();
		}
	
}
