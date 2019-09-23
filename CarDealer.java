package w4p2;

import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int creditScore, age;
		System.out.println("Hello i'm a car dealer, \ndo you want to buy a car?");
		String answer = input.next();
		
		
		
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("ok, Let me show you what i have.  \nwait how old are you?");
			age = input.nextInt();
			if(age>=25) {
				System.out.println("Ok,good");
				System.out.println("what car do you want?");
				answer = input.next();
		}else {
			System.out.println("sorry. I cannot sell you the car");
		}
		}else {
			System.out.println("Ok, come back when you are ready");
		}
		
		}	

	}


