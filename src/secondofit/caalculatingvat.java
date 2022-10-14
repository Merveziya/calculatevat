package secondofit;
import  java.util.Scanner;
public class second {
	
		public static void main(String[] args) {
			
			Scanner inpt = new Scanner(System.in);
			System.out.print("What is the price: ");
			int price = inpt.nextInt();
			double vat=(price* (0.18) );
			double newPrice=vat+price;
			System.out.println("Vat is: " +vat);
			System.out.print("New prie is: " +newPrice);
			
		}
	}
		

