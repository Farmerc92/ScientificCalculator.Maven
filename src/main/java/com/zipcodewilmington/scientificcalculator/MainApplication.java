package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        int display = 0;

        Features f = new Features();

        Console.println("Welcome to my calculator!");

        String s = Console.getStringInput(" Please enter your name?");
        Integer i = Console.getIntegerInput( "Please enter a number:");
        String op = Console.getOperationInput("Enter an operation : +, - , *, /, ^2, ^y, 1/x, sqrt : ");

        if (op.equals("+"))
        {
            Integer i1 = Console.getIntegerInput( "Please next number:");
            Console.println(f.add(i,i1));
        }
        else if (op.equals("-"))
        {
            Integer i1 = Console.getIntegerInput( "Please next number:");
            Console.println(f.subtract(i,i1));
        }
        else if (op.equals("*"))
        {
            Integer i1 = Console.getIntegerInput( "Please next number:");
            Console.println(f.multiply(i,i1));
        }
        else if (op.equals("/"))
        {
            Integer i1 = Console.getIntegerInput( "Please next number:");
            Console.println(f.divide(i,i1));
        }
        else if (op.equals("^y"))
        {
            Integer i1 = Console.getIntegerInput( "Please next number:");
            Console.println(f.exponent(i,i1));
        }
        else if (op.equals("/"))
        {
            Integer i1 = Console.getIntegerInput( "Please next number:");
            Console.println(f.divide(i,i1));
        }
        else if (op.equals("^2"))
        {
            Console.println(f.square(i,i1));
        }
        else if (op.equals("sqrt"))
        {
            Console.println(f.root(i,i1));
        }
        else if (op.equals("inverse"))
        {
            Console.println(f.inverse(i,i1));
        }
        else if (op.equals("invert"))
        {
            Console.println(f.invert(i,i1));
        }
        else if (op.equals("c"))
        {
            Console.println(clear());
        }
        else
        {
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
