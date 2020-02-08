package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        Features f = new Features();

        Console.println("Welcome to my calculator!");

        String s = Console.getStringInput(" Please enter your name?");

        int display = 0;
        Console.println("Current number is :" + display);

        Integer i = Console.getIntegerInput("Please enter a number:");

        for (int u = 0; u < 10000; u++)
        {


            String op = Console.getOperationInput("Enter an operation : +, - , *, /, ^2, ^y, inverse, sqrt, invert, c, end : ");

            if (op.equals("+")) {
                Integer i1 = Console.getIntegerInput("Please next number:");
                Console.println("New Value is: " + f.add(i, i1));



            } else if (op.equals("-")) {
                Integer i1 = Console.getIntegerInput("Please next number:");
                Console.println("New Value is:" + f.subtract(i, i1));
            } else if (op.equals("*")) {
                Integer i1 = Console.getIntegerInput("Please next number:");
                Console.println("New Value is:" + f.multiply(i, i1));
            } else if (op.equals("/"))
            {
                    Integer i1 = Console.getIntegerInput("Please next number:");
                        Console.println("New Value is:" + f.divide(i, i1));

            } else if (op.equals("^y")) {
                Integer i1 = Console.getIntegerInput("Please next number:");
                Console.println("New Value is:" + f.exponent(i, i1));
            } else if (op.equals("/")) {
                Integer i1 = Console.getIntegerInput("Please next number:");
                Console.println("New Value is:" + f.divide(i, i1));
            } else if (op.equals("^2")) {
                Console.println("New Value is:" + f.square(i));
            } else if (op.equals("sqrt")) {
                Console.println("New Value is:" + f.root(i));
            } else if (op.equals("inverse")) {
                Console.println("New Value is:" + f.inverse(i));
            } else if (op.equals("invert")) {
                Console.println("New Value is:" + f.invert(i));
            } else if (op.equals("c")) {
                Console.println("New Value is:" + f.clear());
            } else if (op.equals("end"))
            {
                  u = 1000000;
                }
             else {
                Console.println("Err");
            }


            //Scanner username = new Scanner(System.in);
            //String user = username.nextLine();
            //System.out.print("Hello " + user + " !");


            //Integer i = Console.getIntegerInput("Enter a number");
            //Scanner number = new Scanner(System.in);
            //int


            //String s = Console.getStringInput("Enter a string");
            //Integer i = Console.getIntegerInput("Enter an integer");
            //Double d = Console.getDoubleInput("Enter a double.");

            //Console.println("Hello" + s);
            //Console.println("The user input %s as a integer", i);
            //Console.println("The user input %s as a d", d);
        }
    }
}
