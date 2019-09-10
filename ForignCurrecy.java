

import java.util.Scanner;
public class ForignCurrecy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

double Peso = 0.0544;
double Quetzal = 0.1305;
double Colon = 0.1144;

	System.out.println("Enter number of Mexican Pesos");
	int Mex = input.nextInt();
	
	System.out.println("Enter number of Guatemalan Quetzals");
	int Gua = input.nextInt();
	
	System.out.println("Enter number of Saladoran Colons");
	int Sal = input.nextInt();
	
	double MexUS = Mex*Peso;
	double GuaUS = Gua*Quetzal;
	double SalUS = Sal*Colon;
	
		double result = MexUS+GuaUS+SalUS;
		System.out.println("US Doller =" +result);
	
			
			
	

	}
}