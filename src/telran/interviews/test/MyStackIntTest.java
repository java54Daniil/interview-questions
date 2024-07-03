package telran.interviews.test;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

import telran.interviews.MyStackInt;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackIntTest {

    @Test
    public void testPush() {
        MyStackInt stack = new MyStackInt();
        stack.push(10);
        assertEquals(10, stack.peek());
        stack.push(20);
        assertEquals(20, stack.peek());
        stack.push(5);
        assertEquals(20, stack.getMaxElement());
    }

    @Test
    public void testPop() {
        MyStackInt stack = new MyStackInt();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.peek());
        assertEquals(10, stack.getMaxElement());
    }
    @Test
    public void testIsEmpty() {
        MyStackInt stack = new MyStackInt();
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
    }


}
