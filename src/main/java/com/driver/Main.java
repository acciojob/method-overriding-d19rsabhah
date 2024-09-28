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
        // Task 3: Create an object of class B and call meth method
        //A obj1 = new A();
        B obj = new B();

        // Task 3: Call meth method of class A (before overriding)
       // System.out.println(obj1.meth());  // This will now invoke the overridden method in class B

        // Task 5: Call the overridden meth method from the object of class B
        System.out.println(obj.meth());  // This will print the overridden method's output
    }
}