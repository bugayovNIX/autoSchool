package com.nixsolutions.autoschool.bugaiov.task1.task1_1;

import java.util.Scanner;

public class HelloWorld {

    public String userNmaeInput() {
        String userInput;
        Scanner readFromConsole = new Scanner(System.in);
        userInput = readFromConsole.nextLine();
        return userInput;
    }

    /*
    public static void main(String[] args) {
        HelloWorld hW = new HelloWorld();
        String userName;
        System.out.println("Hello, world!");
        System.out.print("Enter your name: ");
        userName = hW.userNmaeInput();
        System.out.printf("Hello, %s", userName);
    }
    */
}
