import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String SorSF = "";
		String Operation = "";
		String RunAgain = "Y";
		
		int numberstoUse;
		
		double ans = 0; //ans = answer
        double num = 0; //num = number
       
        	//Makes loop run again
        while (RunAgain.equalsIgnoreCase("Y")) { 
        
		System.out.println("Enter the calculator mode: Standard/Scientific?");
			SorSF = input.next();
			
		if (SorSF.equalsIgnoreCase("Standard")) 
			System.out.printf("The calculator will operate in %s mode. \n", SorSF);
			
			//Invalid
		while (!SorSF.equalsIgnoreCase("Standard") && (!SorSF.equalsIgnoreCase("Scientific"))) {
			System.out.println("Invalid Operation Recieved");
            System.out.println("");
            System.out.println("Enter the calculator mode: Standard/Scientific?");
            SorSF = input.next(); }
			
		if (SorSF.equalsIgnoreCase("Standard")) {
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			Operation = input.next();
			
				//Invalid
			 while (!Operation.equals("+") && (!Operation.equals("-") && (!Operation.equals("*") && (!Operation.equals("/"))))) {
	                System.out.println("Invalid Operation Recieved");
	                System.out.println("");
	                System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
	                Operation = input.next(); }
			 
			 	//Addition
			 if (Operation.equals("+")) {
                 System.out.println("How many numbers do you want to add?");
                 numberstoUse = input.nextInt();
                 System.out.printf("Enter %d numbers\n", numberstoUse);
                 for (int i = 1; i <= numberstoUse; i++) {
                     num = input.nextDouble();
                     if (i == 1)
                         ans = num;
                     if (i > 1)
                         ans = ans + num; } 
                 
                 System.out.println("Result: " +ans); }
            
              	//Subtraction
             if (Operation.equals("-")) {
                 System.out.println("How many numbers do you want to subtract?");
                 numberstoUse = input.nextInt();
                 System.out.printf("Enter %d numbers\n", numberstoUse);
                 for (int i = 1; i <= numberstoUse; i++) {
                     num = input.nextDouble();
                     if (i == 1)
                         ans = num;
                     if (i > 1)
                         ans = ans - num; }
                 
                 System.out.println("Result: " +ans); }
              
              	//Multiplication
             if (Operation.equals("*")) {
                 System.out.println("How many numbers do you want to multiply?");
                 numberstoUse = input.nextInt();
                 System.out.printf("Enter %d numbers\n", numberstoUse);
                 for (int i = 1; i <= numberstoUse; i++) {
                     num = input.nextDouble();
                     if (i == 1)
                         ans = num;
                     if (i > 1)
                         ans = ans * num; }
                
                 System.out.println("Result: " + ans); }
             
              	//Division
             if (Operation.equals("/")) {
                 System.out.println("How many numbers do you want to divide?");
                 numberstoUse = input.nextInt();
                 System.out.printf("Enter %d numbers\n", numberstoUse);
                 for (int i = 1; i <= numberstoUse; i++) {
                     num = input.nextDouble();
                     if (i == 1)
                         ans = num;
                     if (i > 1)
                         ans = ans / num; }
                
                 System.out.println("Result: " +ans);
             }
     } 
		
		//Start of Scientific
		
         if (SorSF.equalsIgnoreCase("Scientific")) {
         System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
         Operation = input.next(); 
         
         while (!Operation.equals("+") && (!Operation.equals("-") && (!Operation.equals("*") && (!Operation.equals("/")
                  && (!Operation.equals("sin") && (!Operation.equals("cos") && (!Operation.equals("tan")))))))){
             System.out.println("Invalid Operation Recieved");
             System.out.println("");
             System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
             Operation = input.next(); }
       
              //Addition
         if (Operation.equals("+")) {
             System.out.println("How many numbers do you want to add?");
             numberstoUse = input.nextInt();
             System.out.printf("Enter %d numbers\n", numberstoUse);
             for (int i = 1; i <= numberstoUse; i++) {
                 num = input.nextDouble();
                 if (i == 1)
                     ans = num;
                 if (i > 1)
                     ans = ans + num; }
             
             System.out.println("Result: " +ans); }
        
              //Subtraction
         if (Operation.equals("-")) {
             System.out.println("How many numbers do you want to subtract?");
             numberstoUse = input.nextInt();
             System.out.printf("Enter %d numbers\n", numberstoUse);
             for (int i = 1; i <= numberstoUse; i++) {
                 num = input.nextDouble();
                 if (i == 1)
                     ans = num;
                 if (i > 1)
                     ans = ans - num; }
              
             System.out.println("Result: " +ans); }
         
              //Multiplication
         if (Operation.equals("*")) {
             System.out.println("How many numbers do you want to multiply?");
             numberstoUse = input.nextInt();
             System.out.printf("Enter %d numbers\n", numberstoUse);
             for (int i = 1; i <= numberstoUse; i++) {
                 num = input.nextDouble();
                 if (i == 1)
                     ans = num;
                 if (i > 1)
                     ans = ans * num; }
          
             System.out.println("Result: " +ans); }
         
              //Division
         if (Operation.equals("/")) {
             System.out.println("How many numbers do you want to divide?");
             numberstoUse = input.nextInt();
             System.out.printf("Enter %d numbers\n", numberstoUse);
             for (int i = 1; i <= numberstoUse; i++) {
                 num = input.nextDouble();
                 if (i == 1)
                     ans = num;
                 if (i > 1)
                     ans = ans / num; }
            
             System.out.println("Result: " +ans); }
     
          						//Sin
                         if (Operation.equalsIgnoreCase("sin")) {
                             System.out.println("Enter a number in radians to find the sine");
                                 num = input.nextDouble();
                                 ans = Math.sin(num);
                             System.out.println("Result: " +ans); }
                         	
                         		//Cos
                         if (Operation.equalsIgnoreCase("cos")) {
                             System.out.println("Enter a number in radians to find the cosine");
                                 num = input.nextDouble();
                                 ans = Math.cos(num);
                             System.out.println("Result: " +ans); }
                
                         		//Tan
                         if (Operation.equalsIgnoreCase("tan")) {
                             System.out.println("Enter a number in radians to find the tangent");
                                 num = input.nextDouble();
                                 ans = Math.tan(num);
                             System.out.println("Result: " +ans); }
              
     } 
         
         	System.out.println("Do you want to start over? (Y/N)");
         	RunAgain = input.next(); }
     
      
		System.out.println("Goodbye"); 
     
			//End with Goodbye
			
			
			
			
			
			
		}
		
			
		}
	



