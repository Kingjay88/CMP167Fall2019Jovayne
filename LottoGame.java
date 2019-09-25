package hw;

import java.util.Scanner;
import java.util.Random;
public class LottoGame {
	public static void main(String[] args) {
		double budget = 99.99;
		double ticketCost = 1.45;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("LottoGame is a lotto game for you to play." );
		System.out.printf("You have a budget of $%.2f to spend%n", budget );
		System.out.println("Would you like to play?" );
		
		String answer = in.next();
		
		while(answer.equalsIgnoreCase("yes")) {
			if(budget>=ticketCost) {
				budget = budget - ticketCost;
				
				System.out.println("You have played!");
				
				if(play()) {
					System.out.printf("You won $%.2f%n", ticketCost*2);
					budget += ticketCost*2;
					
				}else { 
					System.out.println("You lost");
				}
				
				System.out.printf("You have $%.2f to spend%n", budget);
				}else {
					System.out.println("Not enough money, Go make money and come back");
					break;
				}
				System.out.println("Awesome, would you like to play again? yes/no ");
				answer = in.next();
				}
				System.out.println("Ok, come back soon!");
			}
			public static boolean play() {
				Random rGen = new Random();
				int num = rGen.nextInt(2);
				
				return (num>0)? true:false;
				
	}

}
