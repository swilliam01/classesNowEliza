package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input ="";
        System.out.println("Good day. What is your problem? ");
        do {
            System.out.println("Enter your response here or Q to quit :");
            input = keyboard.nextLine();
            if (!input.equalsIgnoreCase("q")){
                System.out.println(input);
            }

//            if(input.equalsIgnoreCase("i am feeling great")){
//                break;
//            }

        }while (!input.equalsIgnoreCase("q") && !input.equalsIgnoreCase("i am feeling great"));


    }
}
