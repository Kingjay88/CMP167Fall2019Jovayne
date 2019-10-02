import java.util.Scanner;

public class Numbers {

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
	}

}

