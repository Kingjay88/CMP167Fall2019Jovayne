import java.util.Scanner;
public class drippy { 
	//main method
	//the program starts at the main method
	public static void main(String[] args) {
		//Create Scanner Object 
		Scanner input = new Scanner(System.in);
		//Prompt the user for an input 
		System.out.println("Enter your name");
		//waits for the input from the user
		//and grabs it, then store in variable 
		String name = input.nextLine();
		//Reply to user
		System.out.print("Thank you,"+name);
	}
	
	
}