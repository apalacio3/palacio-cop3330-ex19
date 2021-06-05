/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BmiCalc
{
    public static void main(String[] args)
    {
        double bmi = calculateBMI();
        DecimalFormat d = new DecimalFormat("#.#");
        String output = null;

        if(bmi > 18.5 && bmi < 25)
        {
            output = "Your BMI is " + d.format(bmi) + ".\n"
                    + "You are within the ideal weight range.";
        }
        else if(bmi < 18.5)
        {
            output = "Your BMI is " + d.format(bmi) + ".\n"
                    + "You are underweight. You should see your doctor.";
        }
        else if(bmi > 25)
        {
            output = "Your BMI is " + d.format(bmi) + ".\n"
                    + "You are overweight. You should see your doctor.";
        }

        System.out.println(output);
    }

    public static double calculateBMI()
    {
        Scanner input = new Scanner(System.in);
        double weight;
        double height;

        while(true)
        {
            System.out.print("What is your weight?\nEnter the value in pounds (lbs). ");
            String a = input.nextLine();

            if(Pattern.matches("[^a-zA-Z]+", a))
            {
                weight = Double.parseDouble(a);
                break;
            }
        }

        while (true)
        {
            System.out.print("What is your height?\nEnter the value in inches (in). " );
            String b = input.nextLine();

            if(Pattern.matches("[^a-zA-Z]+", b))
            {
                height = Double.parseDouble(b);
                break;
            }
        }

        return (weight / (height * height)) * 703;
    }
}
