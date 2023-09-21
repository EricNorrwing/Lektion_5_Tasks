package com.ericnorrwing.lektion_5_tasks;

import java.util.Scanner;

public class inputScanner {

    static Scanner scanner = new Scanner(System.in);

    public static String setName(){
        System.out.println("Please specify your name");
        return scanner.nextLine();

    }


    //I dont know why this one functions without the ! operator. I will have to do more reserach
    //during the lab.
    //As of now, if run with !scanner.hasNextInt() it throws an exception if u dont feed an int,
    //but does however NOT do that if you remove the !, but the behaviour is then the opposite of desired.
    public static int setValue() {

        System.out.println("Please write an arbitrary number");
        int temp = 0;
        
        
        while (scanner.hasNextInt()){
            temp = scanner.nextInt();
        }

        return temp;
    }




    public static String setString(){
        System.out.println("Please specify a String(): ");
        return scanner.nextLine();

    }
}
