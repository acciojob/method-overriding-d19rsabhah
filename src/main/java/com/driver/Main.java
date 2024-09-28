package com.driver;

public class Main {
    public static class A {
        // Method that returns a string
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        // Task 4: Override meth method in class B
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {

        B obj = new B();

        System.out.println(obj.meth());  // This will print the overridden method's output
    }
}