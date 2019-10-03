import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eneter two numbers");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int result = num1 + num2;
		System.out.println(result);
	
		
		
		System.out.println("Enter N");
		int N = input.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
			
			}
		System.out.println("The square of ");
		for (int i1 = 1; i1 <= N; i1++) {
			System.out.println(i1*i1);
			
		}
		
		for (int i3 = 1; i3 <= 100; i3++) {
			if (i3% 2 == 1) continue;
			System.out.println(i3++);
		}
	}
		
}
	
