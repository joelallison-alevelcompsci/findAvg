package com.joelallison;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);
    double numberTotal = 0;
    int amountOfNumbers = 5;

    for (int i = 1; i <= amountOfNumbers; i++){
        System.out.println(i + " Please enter a number:");
        numberTotal += userInput.nextDouble();
    }

    System.out.println("Average is " + (numberTotal / amountOfNumbers));

    }
}
