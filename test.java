package test;

import java.util.Random;
public class test {
	public static void main(String[] args) {
		Random randGen;
		int    num;
		int    num2;
		
		randGen= new Random();
		num    =randGen.nextInt(69) + 1; //generates a random value from 1-69
		num2   =69;
		
		System.out.println("The number of today is...");
		System.out.println(num);
		
		if (num==num2 || num==8 || num==6 || num==0 || num==66 || num==4)
			System.out.println("Best number");
		else 
			System.out.println("bad number");	
	}

	
}

