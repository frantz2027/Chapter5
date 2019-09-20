package Examples;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String day;
        String result;
        System.out.println("Enter a day of the week");
        day = input.next();

        switch(day)
        {
            case "Monday":
                result ="Reserve room for friday meeting";
                break;
            case "Tuesday":
                result ="Prepare powerpoint slides";
                break;
            case "Wednesday":
                result ="Send out meeting reminders";
                break;
            case "Thursday":
                result ="Getting ready for football friday";
                break;
            case "Friday":
                result ="Wear spirit wear for game SPACE THEME";
                break;
            default:
                result ="Invalid";
                break;


        }


    }
}
