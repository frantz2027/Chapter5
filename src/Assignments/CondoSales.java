package Assignments;

import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int entry;
        int price;
        System.out.println("Enter a number 1 for park view 2 for golf course view and 3 for lake view");
        entry = input.nextInt();

        if (entry == 1)
            price = 150000
            System.out.println("You selected the park view condo with a price of $150,000");

        else if(entry == 2)
            price = 170000
            System.out.println("You selected the golf course view condo with a price of $170,000");

        else if(entry == 3)
            price = 210000
            System.out.println("You selected the lake view condo with a price of $210,000");

        else if(entry /= 1 || 2 || 3 )
                    else if(entry == 2)
            System.out.println("Input invalid ");

    }
}
