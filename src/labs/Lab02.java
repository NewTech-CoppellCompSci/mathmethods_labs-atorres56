package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		//asks user for a positive integer
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = inKey.nextInt();
		//asks user for another positive integer			
		System.out.print("Enter another positive integer: ");
		int num2 = inKey.nextInt();
		
		//finds the max and the min between the two numbers
		int max = Math.max(num, num2);
		int min = Math.min(num, num2);
		
		//creates the scope
		int scope = max - min;
		
		//for loop runs 10 times
		for(int i = 1; i < 10; i++) {
			//finds a random number between the two numbers given
			int rand = (int) (Math.random() * scope + min);
			//prints out the random numbers
			System.out.print(rand + " ");

		}
		System.out.println();
	}
	
	
	
	
	public static void problem02() {
		//asks user for the radius
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = inKey.nextInt();
		
		//asks user for the height
		System.out.print("Enter the height: ");
		double height = inKey.nextInt();
		
		double radSqr = Math.pow(radius, 2);
		
		double volume = Math.PI * radSqr * height;
	
		System.out.println("The volume is: " + volume);
	
	
	
	}

	
	

	public static void problem03() {

		
		
	}


	
	
	public static void problem04() {
		
		
		
		
	}
	
	

	
}
