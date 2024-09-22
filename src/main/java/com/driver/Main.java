package com.driver;

// Task 1: Create a class A
class A {
    // Method that returns a string
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B that extends class A
class B extends A {
    // Task 4: Override the meth method in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call meth method
        B obj = new B();

        // Task 3: Call meth method of class A (before overriding)
        System.out.println(obj.meth());  // This will now invoke the overridden method in class B

        // Task 5: Call the overridden meth method from the object of class B
        System.out.println(obj.meth());  // This will print the overridden method's output
    }
}