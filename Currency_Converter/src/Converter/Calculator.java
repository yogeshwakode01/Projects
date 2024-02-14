package Converter;
import java.util.*;

public class Calculator {
	
	public void convertCurrency()
	{
		System.out.println("select source currency :");
		
	}
	
	public void addRevomeFav()
	{
		
		
	}
	
	public void multipleCon()
	{
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.print("Enter Amount in rupee :");
		float inr = sc.nextFloat();
				
		while(true)
		{
			System.out.println("Select the currency in which you want to convert...");
			System.out.println("1.US Doller\n2.British Pounds\n"
					+ "3.Euro\n4.Australian Dollar");
			System.out.println("\n\nenter your choice : ");
			int n = sc.nextInt();
			
			switch(n)
			{
				case 1 :
					System.out.println(inr+"in US Doller is :"+ (inr*83.3455));
					break;
				case 2 :
					System.out.println(inr+"in British Pounds is :"+ (inr*105.931));
					break;
				case 3:
					System.out.println(inr+"in Euro is :"+ (inr*91.719));
					break;
				case 4 :
					System.out.println(inr+"in Australian Doller is :"+ (inr*55.5412));
					break;
				default :
					System.out.println("Wrong input...!");
				
			}
		}
	}

}
