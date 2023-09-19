package com.ericnorrwing.lektion_5_tasks;

import java.util.Scanner;

public class inputScanner {

    static Scanner scanner = new Scanner(System.in);

    public static String setName(){
        System.out.println("Please specify your name");
        return scanner.nextLine();

    }
}
