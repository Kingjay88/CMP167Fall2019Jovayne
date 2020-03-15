import java.util.Scanner;

public class PatternTwo1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a number 1...9 : ");
		
		int n = scnr.nextInt();
		int j;
		int i;
		int b = 1;
		
		for (i = 1; i <= n; i++) {
			int SS = b;
			System.out.print(" "); 
		
			for (j = i; j < n; j++); {
			System.out.print(" "); }
		
		for (b = 1; b <= i; b++) {
			System.out.print(SS);
			SS = SS - 1; 
			
		}
		System.out.println("");
	
		
		
		
		}
		
		}
		
		

	}


