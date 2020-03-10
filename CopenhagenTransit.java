import java.util.Scanner;


public class CopenhagenTransit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter zone number :");
		System.out.println("Enter adult or child :");
		
		int zoneNumber = input.nextInt();
		String adultOrChild = input.next();
		
		
		if (zoneNumber <= 2 && adultOrChild.equals("adult")) {
			System.out.printf("The fare for %s to zone number %d is 23.0.%n" , adultOrChild, zoneNumber); }
		
		if (zoneNumber <= 2 && adultOrChild.equals("child")) {
			System.out.printf("The fare for %s to zone number %d is 11.5.%n" , adultOrChild, zoneNumber); }
		
		if (zoneNumber == 3 && adultOrChild.equals("adult")) {
			System.out.printf("The fare for %s to zone number %d is 34.5.%n", adultOrChild, zoneNumber); }
		
		if (zoneNumber == 3 || zoneNumber == 4) {
			if (adultOrChild.equals("child")) {
				System.out.printf("The fare for %s to zone number %d is 23.0.%n", adultOrChild, zoneNumber); }}
		
		if (zoneNumber == 4 && adultOrChild.equals("adult")) {
			System.out.printf("The fare for %s to zone number %d is 46.0.%n", adultOrChild, zoneNumber); }
		
		if (zoneNumber > 4 ) {
			System.out.printf("The fare for %s to the zone number %d is -1.00.%n", adultOrChild, zoneNumber); }
		
		
		{
		
		}
	}
}
	
		

	
		
		
		
		
		
		
		
		
		
		
			
		

	


