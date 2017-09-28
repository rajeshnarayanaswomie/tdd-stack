package com.tdd.stack;

import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private int head = 0;
    private List<T> itemList = new ArrayList<>();

    int size() {
        return head;
    }

    void push(final T item) {
        itemList.add(item);
        head++;
    }

    T pop() {
        T removedItem = itemList.get(head - 1);
        itemList.remove(head - 1);
        head--;
        return removedItem;
    }

    T peek() {
        return itemList.get(head - 1);
    }

    boolean isEmpty() {
        return itemList.size() == 0;
    }
}
