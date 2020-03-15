import java.util.Scanner;

public class FirstLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int j;
		int num = 1;
		
		for(j = num; j <= 30; ++j) {
		if (j % 2 != 0) {
			System.out.println(j + " is an odd number"); }
		
		else if (j % 2 == 0) {
			System.out.println(j + " is an even number"); }
		
		
		if (j % 3 == 0) {
			System.out.println( j + " is divisible by 3"); }
		
		if (j % 5 == 0) {
			System.out.println(j + " is divisible by 5"); }
		
		if (j % 7 == 0) {
			System.out.println(j + " is divisible by 7"); }
		
		if (j % 9 == 0) {
			System.out.println(j + " is divisible by 9"); }
		
		}
		
		
	
		}
		
		
	}
	


