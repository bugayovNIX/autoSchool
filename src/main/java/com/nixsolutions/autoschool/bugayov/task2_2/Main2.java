package com.nixsolutions.autoschool.bugayov.task2_2;

import com.nixsolutions.autoschool.bugayov.task2_2.welcome.Hello;

public class Main2 {

     // This class uses methods of imported classes
     // to read console input and perform greeting operations

    public static void main(String[] args) {
        HelloWorld userInput = new HelloWorld();
        Hello welcomeBye = new Hello();
        System.out.print("Enter your name: ");
        welcomeBye.setupName(userInput.userNameInput());
        welcomeBye.welcome();
        System.out.println("Hello, world!");
        welcomeBye.byeBye();
    }
}
