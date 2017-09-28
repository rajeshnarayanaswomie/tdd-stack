package com.tdd.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class StackTest {
    private Stack myStack;

    @Before
    public void setUp() throws Exception {
        myStack = new Stack();
    }

    @Test
    public void shouldReturnSizeAsZeroOnEmptyStack() throws Exception {
        assertThat(myStack.size(), is(0));
    }

    @Test
    public void shouldPushOneItemAndCheckSize() throws Exception {
        myStack.push(20);
        assertThat(myStack.size(), is(1));
    }

    @Test
    public void shouldPopTheLastItemAndCheckSize() throws Exception {
        myStack.push(10);
        assertThat(myStack.pop(), is(10));
        assertThat(myStack.size(), is(0));
    }

    @Test
    public void shouldReturnLastItemAndRetain() throws Exception {
        myStack.push(10);
        assertThat(myStack.peek(), is(10));
        assertThat(myStack.size(), is(1));
    }

    @Test
    public void shouldReturnTrueOnEmptyStack() throws Exception {
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void shouldReturnFalseOnNonEmptyStack() throws Exception {
        myStack.push(30);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void shouldWorkForMultipleValues() throws Exception {
        assertTrue(myStack.isEmpty());

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        assertThat(myStack.size(), is(3));
        assertThat(myStack.peek(), is(30));
        assertFalse(myStack.isEmpty());

        myStack.pop();

        assertThat(myStack.size(), is(2));
        assertThat(myStack.peek(), is(20));
        assertFalse(myStack.isEmpty());
    }
}
