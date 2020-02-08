package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static void String getStringInput(String prompt)
    {
        Scanner username = new Scanner(System.in);
        println (prompt);
        String user = username.nextLine();
        System.out.println("Hello " + user + " !");

    }

    public static void Integer getIntegerInput(String prompt)
    {
        Scanner number = new Scanner(System.in);
        println (prompt);
        Integer num = number.nextint();
        System.out.println("Hello " + user + " !");



    }




    //public static Integer getIntegerInput(String prompt) {
        //return null;
    }

    //public static Double getDoubleInput(String prompt) {
        //return null;
    //}
//}
