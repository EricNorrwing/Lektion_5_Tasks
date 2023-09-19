package com.ericnorrwing.lektion_5_tasks;

import java.util.Scanner;

public class inputScanner {

    static Scanner scanner = new Scanner(System.in);

    public static String setName(){
        System.out.println("Please specify your name");
        return scanner.nextLine();

    }

    public static int setValue(){
        System.out.println("Please write an arbitrary number");
        return scanner.nextInt();

    }

    public static String setString(){
        System.out.println("Please specify a String(): ");
        return scanner.nextLine();

    }
}
