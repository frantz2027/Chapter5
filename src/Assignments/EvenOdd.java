package Assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numEntered ;
        System.out.println("enter a number");
        numEntered = input.nextInt();
        String result;
        if(numEntered % 2 == 0)
            result = "even";
        else
            result = "odd";

        System.out.println(result);
    }
}
