package com.tdd.stack;

import java.util.ArrayList;
import java.util.List;

class Stack {
    private int head = 0;
    private List<Integer> itemList = new ArrayList<>();

    int size() {
        return head;
    }

    void push(final Integer item) {
        itemList.add(item);
        head++;
    }

    int pop() {
        Integer removedItem = itemList.get(head - 1);
        itemList.remove(head - 1);
        head--;
        return removedItem;
    }

    int peek() {
        return itemList.get(head - 1);
    }

    boolean isEmpty() {
        return itemList.size() == 0;
    }
}
