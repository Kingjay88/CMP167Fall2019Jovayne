import java.util.Scanner;

public class DateConverter{
   
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
       
        int dayNumber;
        int monthNumber;
        int date;
        int year;
        
        String monthName = "";
        String dayName = "";
        System.out.println("Enter 4 integers representing dayNumber monthNumber date year:");
        
        dayNumber = scnr.nextInt();
        monthNumber = scnr.nextInt();
        date = scnr.nextInt();
        year = scnr.nextInt();
        
        double leapornot = year * 1.0;
        if(dayNumber < 1 || dayNumber > 7) {
            System.out.printf("Invalid day number: %d, please enter a number from 1..7.%n",dayNumber);
            return;}
       
        if(monthNumber < 1 || monthNumber > 12) {
            System.out.printf("Invalid month number: %d, please enter a number from 1..12.%n",monthNumber);
            return;}
       
        if(date < 1 || date > 31) {
            System.out.printf("Invalid date number: %d, please enter a number from 1..31.%n",date);
            return; }
       
        if(monthNumber == 2 && date > 29){
         monthName = "February";
           System.out.printf("Invalid date: %s, does not have %d days, please enter a valid date.%n",monthName,date);
           return; }
      
        if(monthNumber == 4 && date > 30){
         monthName = "April";
           System.out.printf("Invalid date: %s, does not have %d days, please enter a valid date.%n",monthName,date);
           return; }
       
        if(monthNumber == 6 && date > 30){
         monthName = "June";
           System.out.printf("Invalid date: %s, does not have %d days, please enter a valid date.%n",monthName,date);
           return; }
        
        if(monthNumber == 9 && date > 30){
         monthName = "September";
           System.out.printf("Invalid date: %s, does not have %d days, please enter a valid date.%n",monthName,date);
           return; }
       
        if(monthNumber == 11 && date > 30){
         monthName = "November";
           System.out.printf("Invalid date: %s, does not have %d days, please enter a valid date.%n",monthName,date);
           return; }
       
        if(monthNumber == 2 && date == 29){
           if(year % 4 != 0 || year == 1900 || year == 2100){ 
              System.out.printf("Invalid date: %d is not a leap year, February does not have %d days, please enter a valid date.%n",year,date);
              return; }
                  
        }
        if(monthNumber == 1)
           monthName = "January";
        if(monthNumber == 2)
           monthName = "February";
        if(monthNumber == 3)
           monthName = "March";
        if(monthNumber == 4)
           monthName = "April";
        if(monthNumber == 5)
           monthName = "May";
        if(monthNumber == 6)
           monthName = "June";
        if(monthNumber == 7)
           monthName = "July";
        if(monthNumber == 8)
           monthName = "August";
        if(monthNumber == 9)
           monthName = "September";
        if(monthNumber == 10)
           monthName = "October";
        if(monthNumber == 11)
           monthName = "November";
        if(monthNumber == 12)
           monthName = "December";
      if(dayNumber == 1)
         dayName = "Sunday";
      if(dayNumber == 2)
         dayName = "Monday";
      if(dayNumber == 3)
         dayName = "Tuesday";
      if(dayNumber == 4)
         dayName = "Wednesday";
      if(dayNumber == 5)
         dayName = "Thursday";
      if(dayNumber == 6)
         dayName = "Friday";
      if(dayNumber == 7)
         dayName = "Saturday";
       System.out.printf("%d %d %d %d is %s %s %d, %d\n",dayNumber,monthNumber,date,year,dayName,monthName,date,year);
    }
}