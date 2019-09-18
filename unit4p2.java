import java.util.Scanner;

public class unit4p2 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("this program check if a is divisible by b");
		
		System.out.print("Enter a: ");
		a = in.nextInt();
		
		System.out.println("Enter b: ");
		b = in.nextInt();
		
		isDivisble(a,b);
		
	}

	private static void isDivisble(int num1, int num2) {
		if(num1%num2 == 0) {
			System.out.printf("%d id divisible by %d ", num1, num2);
		}else {
			System.out.printf("%d is not divisble by %d", num1, num2);
		}
		
		
	}

}
