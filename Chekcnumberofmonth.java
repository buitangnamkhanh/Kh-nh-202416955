package week1;
import java.util.Scanner;

public class Chekcnumberofmonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String month;
        int year;

        while (true) {
            System.out.println("Enter month: ");
            month = keyboard.nextLine().trim();

            System.out.println("Enter year: ");
            if (keyboard.hasNextInt()) {
                year = keyboard.nextInt();
                keyboard.nextLine(); 

                if (year < 0) {
                    System.out.println("Invalid year. Year must be non-negative.");
                    continue; 
                }

                int day = -1;
                
                if (month.equals("January") || month.equals("Jan.") || month.equals("Jan") || month.equals("1")) day = 31;
                else if (month.equals("February") || month.equals("Feb.") || month.equals("Feb") || month.equals("2")) {
                    if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) day = 28;
                    else day = 29;
                }
                else if (month.equals("March") || month.equals("Mar.") || month.equals("Mar") || month.equals("3")) day = 31;
                else if (month.equals("April") || month.equals("Apr.") || month.equals("Apr") || month.equals("4")) day = 30;
                else if (month.equals("May") || month.equals("5")) day = 31;
                else if (month.equals("June") || month.equals("Jun") || month.equals("6")) day = 30;
                else if (month.equals("July") || month.equals("Jul") || month.equals("7")) day = 31;
                else if (month.equals("August") || month.equals("Aug.") || month.equals("Aug") || month.equals("8")) day = 31;
                else if (month.equals("September") || month.equals("Sept.") || month.equals("Sep") || month.equals("9")) day = 30;
                else if (month.equals("October") || month.equals("Oct.") || month.equals("Oct") || month.equals("10")) day = 31;
                else if (month.equals("November") || month.equals("Nov.") || month.equals("Nov") || month.equals("11")) day = 30;
                else if (month.equals("December") || month.equals("Dec.") || month.equals("Dec") || month.equals("12")) day = 31;

                if (day != -1) {
                    System.out.println("The number of days: " + day);
                    break; 
                }
            } else {
                keyboard.nextLine(); 
            }
            
            System.out.println("Invalid month/year. Please try again.");
        }
        keyboard.close();
    }
}