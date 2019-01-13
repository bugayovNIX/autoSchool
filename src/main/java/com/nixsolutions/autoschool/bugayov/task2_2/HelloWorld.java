package com.nixsolutions.autoschool.bugayov.task2_2;

import java.util.Scanner;

class HelloWorld {

    String userNameInput() {
        String userInput;
        try (Scanner readFromConsole = new Scanner(System.in)) {
            userInput = readFromConsole.nextLine();
        }
        return userInput;
    }

    /*
    public static void main(String[] args) {
        HelloWorld hW = new HelloWorld();
        String userName;
        System.out.println("Hello, world!");
        System.out.print("Enter your name: ");
        userName = hW.userNameInput();
        System.out.printf("Hello, %s", userName);
    }
    */
}
