package com.client;
import com.service.Pune;
import java.util.Scanner;



public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pune p = new Pune();
		System.out.println("--------------Welcome to Rto--------------");
		while(true)
		{
			System.out.println("\n\n--------------Menu---------------");
			System.out.println("1. Register for new Vehicle");
			System.out.println("2. View Vehicle Details");
			System.out.println("3. Update Vehicle details");
			System.out.println("4. Exit");
			System.out.print("Enter your choice :");
			int n= sc.nextInt();
			
			switch(n)
			{
			case 1 :
				p.regVehicle();
				break;
			case 2:
				p.viewDetails();
				break;
			case 3 :
				p.updateVehicle();
				break;
			case 4 :
				System.out.println("Thank you visit again...");
				System.exit(0);
			default:
				System.out.println("You enterd Wrong input, Please select correct choice.....");
				
			}
		}
	}

}
