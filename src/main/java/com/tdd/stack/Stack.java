package com.tdd.stack;

import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private List<T> itemList = new ArrayList<>();

    int size() {
        return itemList.size();
    }

    void push(final T item) {
        itemList.add(item);
    }

    T pop() {
        T removedItem = itemList.get(itemList.size() - 1);
        itemList.remove(itemList.size() - 1);
        return removedItem;
    }

    T peek() {
        return itemList.get(itemList.size() - 1);
    }

    boolean isEmpty() {
        return itemList.size() == 0;
    }
}
