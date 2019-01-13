package com.nixsolutions.autoschool.bugayov.task2_2.welcome;

public class Hello {

    private String name;
    public void setupName(String name){
        this.name = name;
    }
    public void welcome() {
        System.out.printf("Hello, %s%n", name);
    }
    public void byeBye(){
        System.out.printf("Bye, %s%n", name);
    }
}
