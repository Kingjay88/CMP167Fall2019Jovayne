import java.util.Scanner;
public class AgeLabel {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter an age in number of days :");
		
		int ageInDays = scnr.nextInt();
		
		if (ageInDays <= 365) {
			System.out.println("You are an infant");} 
		
		if (ageInDays > 365 && ageInDays <= 1095) {
			System.out.println("You are a toddler"); }
		
		if (ageInDays > 1095 && ageInDays <= 4380){
			System.out.println("You are a child"); }
		
		if (ageInDays > 4380 && ageInDays <= 6935) {
			System.out.println("You are a teenager");}
		
		if (ageInDays > 6935 && ageInDays <= 7665) {
			System.out.println("You are a young adult");}
		
		if (ageInDays > 7665 && ageInDays <= 18950) {
			System.out.println("You are an adult");}
		
		if (ageInDays > 18950 && ageInDays <= 23725) {
			System.out.println("You are middle aged");}
		
		if (ageInDays >= 25550) {
			System.out.println("You are a senior citizen");}
	}
	
}
	
	
	
		
			
		
		
		
	

	


