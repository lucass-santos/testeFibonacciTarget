package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and will be verified if it's in fibonacci sequence or not");
		int number = verifyStringToNumber(sc.next());
		List<Integer> fibonacciSequence = new ArrayList<>();
		fibonacciSequence.add(0);
		fibonacciSequence.add(1);
		boolean verifier = false;
		
		for(int i = 0; i < number; i++) {
			int sum = fibonacciSequence.get(i) + fibonacciSequence.get(i+1); 
			fibonacciSequence.add(sum);
			if(sum == number) {
				System.out.println("The informed number is in the fibonacci sequence");
				verifier = true;
				break;
			}
		}
		
		if(!verifier) {
			System.out.println("The number informed isn't in the fibonacci sequence");
		}
		
		
	}
	
	static int verifyStringToNumber(String input) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while(!(input != null && input.matches("[0-9]+"))) {
			System.out.println("The informed number is incorrect. Please enter a valid number.");
			input = sc.next();
		}	
		try {
			number = Integer.parseInt(input);
		}catch(Exception e) {
			System.out.println("The error is: " + e.getMessage());
		}
		return number;
	}

}
