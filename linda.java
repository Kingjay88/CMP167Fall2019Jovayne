import java.util.Scanner;

public class linda {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		String nijja = "";
		

		
		System.out.println("What is your name my g?");
		name = input.next();
		
		System.out.println("whats your pets name?");
		nijja = input.next();
		
		int petlength = nijja.length();
		
		System.out.printf("%s, %s has %d characters", name, nijja, petlength);
		
		
	

	}

}
