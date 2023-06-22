package com.example.package2;

import com.example.package1.Class1;
import com.example.package1.Class2;

/**
 * Klasa testowa TestClass.
 */
public class TestClass {
    /**
     * Metoda główna programu.
     *
     * @param args Argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        // Utworzenie obiektów klas Class1 i Class2
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        // Wywołanie metod lub wykonanie innych operacji, które powiązują klasy ze sobą
        int result1 = class1.doSomething(5);
        String result2 = class2.doSomethingElse("Hello");

        // Wyświetlenie wyników
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
    }
}
