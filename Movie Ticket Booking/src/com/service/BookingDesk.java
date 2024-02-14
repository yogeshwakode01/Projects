package com.service;
import java.util.*;
import com.model.*;

public class BookingDesk implements BookMyShow 
{
	Scanner sc = new Scanner(System.in);
	int noOfTicket, total;
	boolean flag =false;
	List<CheckOut> checkout = new ArrayList<>();
	@Override
	public void bookTicket()
	{
		List<Movie> m = new ArrayList<>();
		m.add(new Movie(1001, "ABC", 150, 4.6f, "Comedy"));
		m.add(new Movie(1002, "DEF", 150, 4.2f, "Action"));
		m.add(new Movie(1003, "GHI", 150, 3.9f, "suspance"));
		
		System.out.println("**************Today's Showes**************");
		System.out.println("-------------------------------------------------------------");
		Iterator<Movie> itr = m.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println("-------------------------------------------------------------");
		}
		System.out.print("Select movie id: ");
		int n =sc.nextInt();
		Iterator<Movie> it = m.iterator();
		while(it.hasNext())
		{
			Movie mov = it.next();
			if(mov.getMovieId()==n)
			{
				System.out.println("How many ticket do you want to book :");
				noOfTicket =sc.nextInt();
				String movieName = mov.getMovieName();
				int moviePrice = mov.getPrice();
				total = moviePrice * noOfTicket;
				checkout.add(new CheckOut(movieName, moviePrice));
				flag= true;
			}
		}
		System.out.println((flag) ? " " : "Please enter correct movie id");
				
		
	}
	
	@Override
	public void orderMeal()
	{
		flag=false;
		List<Snack> m = new ArrayList<>();
		m.add(new Snack(101, "pop-corn", 130, "Hot salty popcorn"));
		m.add(new Snack(102, "Pizza", 150, "cheese pizza"));
		m.add(new Snack(103, "Burger", 100, "corn n cheese"));
		
		System.out.println("**************List of Meal**************");
		System.out.println("-------------------------------------------------------------");
		Iterator<Snack> itr = m.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println("-------------------------------------------------------------");
		}
		boolean t = true;
		while(t)
		{
			System.out.print("Select snacks id: ");
			int n =sc.nextInt();
			Iterator<Snack> it = m.iterator();
			while(it.hasNext())
			{
				Snack mov = it.next();
				if(mov.getId()==n)
				{
					String name = mov.getName();
					int price = mov.getPrice();
					total = total + price;
					checkout.add(new CheckOut(name, price));
					flag= true;
				}
			}
			System.out.println("Want any thing more ? press 'Y' to yes and 'N' to say no");
			char a = sc.next().charAt(0);
			if(a=='Y' || a=='y')
			{
				continue;
			}
			else
			{
				t=false;
			}
		}
		
		System.out.println((flag) ? " " : "Please enter correct Snacks id");
				
	}
	
	@Override
	public void printDetails()
	{
		boolean tt=true;
		System.out.println("----------------CheckOut Window----------------");
		
		Iterator<CheckOut> i = checkout.iterator();
		while(i.hasNext())
		{
			Object ob = i.next();
			System.out.println(ob.toString());
			if(tt== true) 
			{
				System.out.println("No of tickets :"+noOfTicket+"\t total : "+(noOfTicket));
				tt =false;
			}
			System.out.println("-------------------------------------------");
		}
		System.out.println("Your total bill is :"+total);
	}

}
