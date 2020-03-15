import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalGrades = 0;
		int numA = 0;
		
		int numBPlus = 0;
		int numB = 0;
		int numBMinor = 0;
		int numCPlus = 0;
		int numC = 0;
		int numCMinor = 0;
		int numD = 0;
		int numF = 0;
		int i;
		int max = 100;
		int numAMenor = 0;
		
		for (i = -1; i <= max; i++) {
			System.out.println("Enter a grade: ");
			i = input.nextInt();
			
			if ((i >= 93)&& (i < 100)) {
				numA = numA + 1;
				totalGrades = totalGrades + 1; }
			
			if ((i >=90) && (i < 93)) {
				numAMenor = numAMenor + 1;
				totalGrades += 1; }
			
			if ((i >= 87) && (i < 90)) {
				numBPlus += 1;
				totalGrades += 1; }
			
			if ((i >= 83) && (i < 87)) {
				numB += 1;
				totalGrades += 1; }
			
			if (( i >= 80) && (i < 83)) {
				numBMinor +=1;
				totalGrades += 1;}
			
			if ((i >= 77) && (i < 80)) {
				numCPlus += 1;
				totalGrades += 1; }
			
			if ((i >= 73) && (i < 77)) {
				numC += 1;
				totalGrades += 1; }
			
			if ((i >= 70) && (i < 73)) {
				numCMinor += 1;
				totalGrades += 1; }
			
			if ((i >= 60) && (i < 70)) {
				numD += 1;
				totalGrades += 1; }
			
			if ((i >= 0) && (i < 60)) {
				numF += 1;
				totalGrades += 1;
			}
			
			if ( i == -1) {
				break; 
			}
			
		}
	
	System.out.println("Total number of grades = " + totalGrades);
	System.out.println("Number of A's  = " + numA);
	System.out.println("Number of A-'s = " + numAMenor);
	System.out.println("Number of B+'s = " + numBPlus);
	System.out.println("Number of B's  = " + numB);
	System.out.println("Number of B-'s = " + numBMinor);
	System.out.println("Number of C+'s = " + numCPlus);
	System.out.println("Number of C's  = " + numC);
	System.out.println("Number of C-'s = " + numCMinor);
	System.out.println("Number of D's  = " + numD);
	System.out.println("Number of F's  = " + numF);
	
	
	
	
	}
	
}

