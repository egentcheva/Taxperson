package ComcastTest;


import java.util.InputMismatchException;
import java.util.Scanner;
/*Java program to Calculate the total cost of an item including tax based on 
whether it is considered a necessary or luxury item. 
The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%.
For simplicity of implementation, all transactions are measured in cents (pennies).*/

public class Comcast_Taxperson {

	public static void main(String[] args) {

		float ttlPrice = (float) 0.0;
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("Are you buying luxury or necessary item?\nPlease enter 1 for luxury item.\nEnter 2 for necessary item");
			int itemCtgr = sc.nextInt();


			System.out.println("Enter item price in cents.");
			int itemPrice = sc.nextInt();

			if (itemPrice <= 0){
				System.out.println("You have entered invalid price. Total price cannot be calculated");

			} else {

				if (itemCtgr == 1){
					ttlPrice = (float)(itemPrice*1.09);
					System.out.println("Total price of your item is: " + ttlPrice);
					
				} else if (itemCtgr == 2){
					ttlPrice = (float)(itemPrice*1.01);
					System.out.println("Total price of your item is: " + ttlPrice);
					
				} else 
					System.out.println("You have entered invild item category. Total price cannot be calculated");
			}	
		} catch (InputMismatchException e) { 
			System.out.println("Invalid input. Please enter only whole numbers");
			
		}finally{
			sc.close();
		}
	}
}




