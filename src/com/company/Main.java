package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);

        //Get player's name
        System.out.println("Hello!");
        System.out.println("What is your name?");
        String playerName = playerInput.nextLine();

        //Greeting with player's name
        System.out.println("Hello " + playerName + "! Glad to meet you!");
    }
}
