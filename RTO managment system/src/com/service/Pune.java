package com.service;
import com.model.*;
import java.util.*;

public class Pune implements Rto{
	Scanner sc = new Scanner(System.in);
	Vehicle v = new Vehicle();
	
	
	@Override
	public void regVehicle()
	{
		System.out.println("\n\n--------------Registration Window---------------");
		System.out.print("Enter Registration number of vehicle:");
		v.setRegId(sc.nextInt());
		System.out.print("Enter Model name of vehicle:");
		v.setModelName(sc.next());
		System.out.print("Enter price of vehicle:");
		v.setPrice(sc.nextFloat());
		System.out.print("Enter color of vehicle:");
		v.setColor(sc.next());
		System.out.print("Enter area of residency of owner :");
		v.setArea(sc.next());
		System.out.print("Enter owner name :");
		v.setOwnerName(sc.next());
		System.out.print("Enter mobile number :");
		v.setMob(sc.nextLong());
		System.out.print("Enter Aadhar number of Owner :");
		v.setAdhaar(sc.nextLong());
		
		System.out.println("Registration completed Successfully...");
	}
	@Override
	public void viewDetails()
	{
		System.out.println("\n\n-------------Owner Details-------------");
		System.out.println("Registration number :" + v.getRegId());
		System.out.println("Model number :" + v.getModelName());
		System.out.println("Price of vehicle :"+ v.getPrice());
		System.out.println("Color of vehicle :" + v.getColor());
		System.out.println("area of Recidency :" + v.getArea());
		System.out.println("Owner name :"+ v.getOwnerName());
		System.out.println("Mobile Number :"+v.getMob());
		System.out.println("Aadhar Number :"+v.getAdhaar());
		
		
	}
	
	@Override
	public void updateVehicle()
	{
		System.out.println("1. Name of Owner\n2. Mobile Number\n3. Area of recidency");
		System.out.print("Enter Your choice :");
		int num = sc.nextInt();
		if(num==1)
		{
			System.out.println("Enter new name :");
			v.setOwnerName(sc.next());
			System.out.println("Name updated Successfully....");
		}
		else if(num==2)
		{
			System.out.println("Enter new Mobile Number :");
			v.setMob(sc.nextLong());
			System.out.println("Mobile Number updated Successfully");
		}
		else if(num == 3)
		{
			System.out.println("Enter new Area of Recidency :");
			v.setArea(sc.next());
			System.out.println("Area of Recidency updated Successfully...");
		}
		else
		{
			System.out.println("You Entered Wrong Choice");
		}
	}
	


}
