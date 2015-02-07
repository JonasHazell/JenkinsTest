package com.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    private Adder adder;

    @Before
    public void setUp() throws Exception {
        adder = new Adder();
    }

    @Test
    public void testAdder() throws Exception {
        int result = adder.add(1, 2);

        assertEquals(3, result);
    }
}