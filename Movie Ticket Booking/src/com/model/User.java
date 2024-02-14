package com.model;

import java.util.HashMap;
import java.util.*;

public class User 
{
	Scanner sc = new Scanner(System.in);
	Map<String, String> cred = new HashMap<>();

	public boolean loginCredential()
	{
		cred.put("user1", "pass1");
		cred.put("user2", "pass2");
		cred.put("user3", "pass3");
		
		System.out.println("Please enter your user name :");
		String uid = sc.next();
		System.out.print("Enter a Password :");
		String pas = sc.next();
		
		boolean flag=false;
		if(cred.containsKey(uid))
		{
			for(int i=0;i<cred.size();i++)
			{
				if(cred.get(uid).equals(pas))
				{
					System.out.println("---------------Login Successfully--------------");
					return true;
				}
			}
		}
		else
		{
			System.out.println("User ID not found");
		}
		
		
		return flag;
	}
	
	public void signUp()
	{
		System.out.println("Please enter  new user name :");
		 String uid = sc.next();
		System.out.print("Enter a new Password :");
		 String pas = sc.next();
		cred.put(uid, pas);
		System.out.println("Account create Successfully.....");
		System.out.println("login again !");
		
	}
	

}
