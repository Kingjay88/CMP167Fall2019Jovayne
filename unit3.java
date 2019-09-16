package w3p2;
/**
 * @jovayne
 */
import java.io.StringWriter;
import java.io.PrintWriter;


public class unit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringWriter Sw= new StringWriter();
		PrintWriter Pw= new PrintWriter(Sw);
		
		Pw.print("Celine Dion");
		//sending the character to the buffer
		String name = Sw.toString();
		//turn sequence of character into a string
		System.out.print(name);
		
		//%(flag)(width).(precision)specifier
		System.out.printf("Her name was %-20s ok?", name);
		
		
				

	}

}
