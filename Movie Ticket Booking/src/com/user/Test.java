package com.user;
import java.util.*;
import com.model.User;
import com.service.*;


public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BookMyShow b = new BookingDesk();
		User u = new User();
				
		System.out.println("============Welocome to book my show=============");
		
		boolean a = u.loginCredential();
		while(true)
		{
			
			if(a)
			{
				while(true)
				{
					System.out.println("1.Book Ticket \n2.Order Meal \n3.Print Details \n4.Logout");
					System.out.print("Enter Your Choice :");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1 :
						b.bookTicket();
						break;
					case 2 :
						b.orderMeal();
						break;
					case 3 :
						b.printDetails();
						break;
					case 4 :
						System.out.println("Logout Successfully....");
						System.exit(0);
					default :
						System.out.println("Please enter correct input ...!");
						
					}
					
				}
			}
			else
			{
				System.out.println("Please Enter Correct credentials....");
				System.out.println("1.Create new Account\n2.login page");
				int temp = sc.nextInt();
				if(temp==1)
				{
					
					u.signUp();
					a=u.loginCredential();
				}
				else if (temp ==2)
				{
					a=u.loginCredential();
				}
				else
					System.out.println("Wrong input...");
				
			}
		}
		
	}

}
