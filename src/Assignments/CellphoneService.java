package Assignments;

import java.util.Scanner;

public class CellphoneService {

    public static void main (String[] args){
        int minsUsed;
        int textSent;
        int gbUsed;
        String result = null;

        // plan A <500 minutes 49$
        // plan B <500 minutes >1 text 55$
        //plan C >500 minutes 100 max texts  61$
        //plan D > 500 minutes> 100 texts 0 data 70$
        // plan E >500 minutes >100 2 gb data 79$
        //                if data > 2 price = 87$

        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes are you going to use? >>> ");
        minsUsed = input.nextInt();

        System.out.println("How many texts are you going to use? >>> ");
        textSent = input.nextInt();

        System.out.println("How much data are you going to use? >>> ");
        gbUsed = input.nextInt();



        if (minsUsed < 500 && textSent == 0 && gbUsed == 0) {
            result = "Plan A";
        }
        else if(minsUsed < 500 && textSent >= 1 && textSent <= 99 && gbUsed == 0 ){
            result = "Plan B";
        }
        else if(minsUsed > 500 && textSent >= 1 && textSent <= 99 && gbUsed == 0 ){
            result = "Plan C";
        }
        else if(minsUsed > 500 && textSent > 100 && gbUsed == 0 ) {
            result = "Plan D";
        }

        else if (minsUsed > 500 && textSent > 100 && gbUsed >= 1){
            if (gbUsed < 2){
                result = "plan E $79";
                }
                else if (gbUsed >= 2){
                result = "plan F $87";
            }

            }
        System.out.println("The plan we recommend for you is" + result);
        }
    }

