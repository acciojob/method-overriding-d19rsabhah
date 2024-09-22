//package com.driver.test;
//
//import static org.junit.Assert.*;
//import org.junit.jupiter.api.Test;
//
//public class TestCases {
//
//}
package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.driver.A;
import com.driver.B;

public class TestCases {

    @Test
    public void testMethInClassA() {
        A a = new A();
        assertEquals("Invoking method from class A", a.meth());
    }

    @Test
    public void testMethInClassB() {
        B b = new B();
        assertEquals("Method is overridden in Extended class B", b.meth());
    }
}
