package com.driver.test;

import static org.junit.Assert.*;

import com.driver.Main;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void testprintHelloWorld2() {
        Main.B obj = new Main.B();
        assertEquals("Method is overridden in Extended class B", obj.meth());
    }
}


