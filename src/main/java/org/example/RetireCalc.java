package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;
import java.util.Calendar;

public class RetireCalc
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);//import scanner

        //Gets user age
        System.out.print( "What is your current age? " );
        String age = input.nextLine();
        int intAge = Integer.parseInt(age); //string to int

        //Gets user desired retirement age
        System.out.print("At what age would you like to retire? ");
        String retire = input.nextLine();
        int intRetire = Integer.parseInt(retire);

        //Calculations
        int remainingYears = intRetire - intAge;
        System.out.print("You have "+remainingYears+" years left until you can retire." +"\n");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = year + remainingYears;

        //Print calc
        System.out.print("It's "+year+" so you can retire in "+retireYear+".");
    }
}
