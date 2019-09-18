package Examples;

import javax.swing.*;
import java.util.Scanner;

public class AgeInsultGenerator {

    public static void main(String[] args){

        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age >>> ");
        age = input.nextInt();

        if(age < 12){
            System.out.println(" You are just a kid, go away");
        }
        else if(age >= 12 || age < 19){
            System.out.println("You are old enough to know better, hopefully");
        }
        else if(age >= 19 || age < 25){
            System.out.println("Get a job you bum");
        }
        else if(age >= 25 && age <= 35){
            System.out.print("Getting a bit old for your parents basement arent you?");
        }
        else if(age >= 35 && age <= 45){
            System.out.println("Hows your midlife crisis?");
        }
        else if(age >= 45 && age <= 55){
            System.out.println("How do you still have student loans?");
        }
        else if(age >= 55){
            System.out.println("Quiet boomer...");
        }
    }

}
