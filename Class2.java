package com.example.package2;

import com.example.package1.Class1;

public class Class2 {
    public void displayMessage() {
        Class1 class1 = new Class1();
        class1.displayMessage();
        System.out.println("Привіт з Class2!");
    }
}