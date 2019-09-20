package Debugging;

import java.util.Scanner;
public class FixDebuggingFive3
{
    public static void main (String args[])
    {

        final int LOW = 111;
        final int HIGH = 9;
        final int CUTOFF = 500;
        calculateOutPut(LOW, HIGH, CUTOFF);
    }
    public static void calculateOutPut(final int LOW, final int HIGH, final int CUTOFF)
    {
        Scanner input = new Scanner(System.in);
        int item;
        String output;

        System.out.println("Please enter item number");
        item = input.nextInt();
        if(item < LOW) output = "Item number too low";
        else
        if(item > HIGH)
            output = "Item number too high";
        else
        if(item > CUTOFF)
            output = "Valid - in Automotive Department";
        else
            output = "Valid - Item in Housewares Department";
        System.out.println(output);
    }
}

