import java.util.Scanner;

public class SMSAbbreviation1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abbreviation: ");
		String abbreviation = scnr.nextLine();
		
		String translation = "";
		
		if (abbreviation.equalsIgnoreCase("LOL")) {
			translation = "Laugh Out Loud"; }
		
		else if (abbreviation.equalsIgnoreCase("TMI")) {
			translation = "To Much Imformation"; }
		
		else if (abbreviation.equalsIgnoreCase("SHM")) {
			translation = "Shaking My Head"; }
		
		else {
			System.out.println("Unknow Abbreviation"); }
		
		if (!translation.equals(""))
	
		System.out.println(abbreviation + " means " + translation);
		
		return;

	}

}
