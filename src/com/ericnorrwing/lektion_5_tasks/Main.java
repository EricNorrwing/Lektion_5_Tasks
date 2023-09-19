package com.ericnorrwing.lektion_5_tasks;

public class Main {
    public static void main(String[] args) {

        //Task #1
        System.out.println("Player #1: " + inputScanner.setName());

        //Task #2
        int loopAmount = inputScanner.setValue();
        for(int i = 0;i < loopAmount; i++){
            System.out.println("Loop counter: " + (i+1) + " WEEEEEEEE");
        }

        //Task #3
        /*
        do{
            System.out.println("Just put in any value, nothing matters and the loop is sad");
            inputScanner.setValue();
        } while(true);
        */

        //Task 4
        //re-using "setName" because im lazy, if you feed "stop" it will stop.
        //it will ask for your name though so its very rude to answer stop
        boolean isPlaying = true;
        do{
            if (inputScanner.setName().equals("stop")){
                isPlaying = false;
            }


        }while(isPlaying);

        

    }
}
