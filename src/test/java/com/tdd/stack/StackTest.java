package com.tdd.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class StackTest {
    private Stack<Integer> myIntegerStack;

    @Before
    public void setUp() throws Exception {
        myIntegerStack = new Stack<>();
    }

    @Test
    public void shouldReturnSizeAsZeroOnEmptyStack() throws Exception {
        assertThat(myIntegerStack.size(), is(0));
    }

    @Test
    public void shouldPushOneItemAndCheckSize() throws Exception {
        myIntegerStack.push(20);
        assertThat(myIntegerStack.size(), is(1));
    }

    @Test
    public void shouldPopTheLastItemAndCheckSize() throws Exception {
        myIntegerStack.push(10);
        assertThat(myIntegerStack.pop(), is(10));
        assertThat(myIntegerStack.size(), is(0));
    }

    @Test
    public void shouldReturnLastItemAndRetain() throws Exception {
        myIntegerStack.push(10);
        assertThat(myIntegerStack.peek(), is(10));
        assertThat(myIntegerStack.size(), is(1));
    }

    @Test
    public void shouldReturnTrueOnEmptyStack() throws Exception {
        assertTrue(myIntegerStack.isEmpty());
    }

    @Test
    public void shouldReturnFalseOnNonEmptyStack() throws Exception {
        myIntegerStack.push(30);
        assertFalse(myIntegerStack.isEmpty());
    }

    @Test
    public void shouldWorkForMultipleIntegerValues() throws Exception {
        assertTrue(myIntegerStack.isEmpty());

        myIntegerStack.push(10);
        myIntegerStack.push(20);
        myIntegerStack.push(30);

        assertThat(myIntegerStack.size(), is(3));
        assertThat(myIntegerStack.peek(), is(30));
        assertFalse(myIntegerStack.isEmpty());

        myIntegerStack.pop();

        assertThat(myIntegerStack.size(), is(2));
        assertThat(myIntegerStack.peek(), is(20));
        assertFalse(myIntegerStack.isEmpty());
    }

    @Test
    public void shouldWorkForMultipleStringValues() throws Exception {
        Stack<String> myStringStack = new Stack<>();

        assertTrue(myStringStack.isEmpty());

        myStringStack.push("Apple");
        myStringStack.push("Banana");
        myStringStack.push("Carrot");

        assertThat(myStringStack.size(), is(3));
        assertThat(myStringStack.peek(), is("Carrot"));
        assertFalse(myStringStack.isEmpty());

        myStringStack.pop();

        assertThat(myStringStack.size(), is(2));
        assertThat(myStringStack.peek(), is("Banana"));
        assertFalse(myStringStack.isEmpty());
    }
}
