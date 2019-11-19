package com.test.jacoco.test;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

        import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	assertEquals(0, hw.Method3(6, -1, 1));
        assertEquals(0, hw.Method3(6, 1, 1));
    	assertEquals(0, hw.Method3(1, -1, 1));
        assertEquals(0, hw.Method3(1, -1, -1));
        assertEquals(0, hw.Method3(6, 1, -1));
    	assertEquals(0, hw.Method3(1, -1, -1));
        assertEquals(0, hw.Method3(1, -1, -3));
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        assertEquals(0, hw.Method4(0, 0, 0, 0, 0));
        assertEquals(0, hw.Method4(1, 1, 0, 0, 0));
        assertEquals(0, hw.Method4(5, 0, 0, 0, 0));

        boolean thrown = false;
        try {
            hw.Method4(1, 0, 0, 0, 0);
        } catch (ArithmeticException e) {
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try {
            hw.Method4(1, 0, 0, 1, 0);
        } catch (ArithmeticException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testBug() {
        HelloWorld hw = new HelloWorld();
        assertTrue(hw.bug(5));
        assertFalse(hw.bug(-5));
    }

    @Test
    public void testIsTriangle() {
        HelloWorld hw = new HelloWorld();
        assertTrue(hw.isTriangle(3, 2, 2));
        assertFalse(hw.isTriangle(-1, 3, 3));
        assertFalse(hw.isTriangle(1, 1, 3));
    }

    @Test
    public void testMiniCalculator() {
        HelloWorld hw = new HelloWorld();
        final double delta = 1e-6;
        assertEquals(2, hw.miniCalculator(1, 1, '+'), delta);
        assertEquals(3, hw.miniCalculator(1, 3, '*'), delta);
        assertEquals(3, hw.miniCalculator(5, 2, '-'), delta);
        assertEquals(2, hw.miniCalculator(4, 2, '/'), delta);

        boolean thrown = false;
        try {
            hw.miniCalculator(1, 0, '%');
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testIsBirthday() {
        HelloWorld hw = new HelloWorld();
        assertFalse(hw.isBirthday(1980, 1, 1));
        assertTrue(hw.isBirthday(1990, 1, 1));
        assertTrue(hw.isBirthday(2009, 10, 1));
        assertTrue(hw.isBirthday(2019, 10, 1));
        assertFalse(hw.isBirthday(2029, 10, 1));

        assertFalse(hw.isBirthday(2011, -1, -1));
    }
}
