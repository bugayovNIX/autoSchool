package com.nixsolutions.autoschool.bugaiov.task1.task1_1;

import com.welcome.Hello;

public class Main2 {

    /**
     * This class contains a method that reads console input and
     * uses methods of imported classes to perform greating operations
     */

    public static void main(String[] args) {
        HelloWorld userInput = new HelloWorld();
        Hello welcomeBye = new Hello();
        System.out.print("Enter your name: ");
        welcomeBye.setupName(userInput.userNmaeInput());
        welcomeBye.welcome();
        System.out.println("Hello, world!");
        welcomeBye.byeBye();
    }
}
