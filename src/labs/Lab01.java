package labs;

import java.util.Scanner;

public class Lab01 {

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
		double num = inKey.nextInt();
		
		//asks user for another positive integer
		System.out.print("Enter a positive integer: ");
		double num2 = inKey.nextInt();
		
		//double newNum finds the sum of the num to the power of num 2
		double newNum = Math.pow(num, num2);
		//prints out the new number (num to the power of num2)
		System.out.println(num + "^" + num2 + " = " + newNum);
		
	}
	
	
	
	
	public static void problem02() {
		//asks user for a positive integer
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		double num = inKey.nextInt();
		
		//holds the square root of the number the user inputed
		double sqrNum = Math.sqrt(num);
		
		//prints out the square root
		System.out.println("The square root of " + num + " is " + sqrNum);
		
		
	}

	
	

	public static void problem03() {
		
		//asks user for the one side of the triangle
		Scanner inKey = new Scanner(System.in);
		System.out.print("Length of side A: ");
		double sideA = inKey.nextInt();
				
		
		//asks user for the other side of the triangle
		System.out.print("Length of side B: ");
		double sideB = inKey.nextInt();
		
		//finds the sum of both sides to the power of 2
		double aSqr = Math.pow(sideA, 2);
		double bSqr = Math.pow(sideB, 2);
		
		//adds the a^2 plus the c^2
		double add = aSqr + bSqr;
		//finds the square root of "add"
		double hypot = Math.sqrt(add);
		
		//prints out hypotenuse
		System.out.println("Hypotenuse: " + hypot);
		

	}

	
	
	public static void problem04() {
	Scanner inKey = new Scanner(System.in);
		
	int max = Integer.MIN_VALUE;	
	int min = Integer.MAX_VALUE;
	//int input has a value of -1
	int input = -1;
	//runs while input does not = 0
	while(input != 0) {
		//asks user for a integer
		System.out.println("Enter an integer: ");
		input = inKey.nextInt();
		//finds the max and the min of all the numbers
		max = Math.max(max, input);
		min = Math.min(min, input);
	}
	//prints out the max and the min
	System.out.println("Max = " + max);
	System.out.println("Min = " + min);
	
	}
	
	
	
	
	
	
}
