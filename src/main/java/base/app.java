package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is the length of your ceiling? ");
        int length = newScan.nextInt();

        System.out.print("What is the width of your ceiling? ");
        int width = newScan.nextInt();

        //Calculations
        int area = length * width;
        double doubleGall = (double)area/350;
        int numGall = (int)Math.ceil(doubleGall);

        //Output
        System.out.println("You will need to purchase " + numGall + " gallons of paint to cover " + area + " square feet.");

    }

}
