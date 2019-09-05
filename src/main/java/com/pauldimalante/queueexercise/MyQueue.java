package com.pauldimalante.queueexercise;

import java.util.NoSuchElementException;

public class MyQueue {
    private Object myQueue[] = new Object[100];
    private int rearPos = -1;
    private int frontPos = 0;

    void enqueue(Object object) {
        this.rearPos++;
        this.myQueue[this.rearPos] = object;
    }

    Object dequeue () throws NoSuchElementException {
        if(this.rearPos<0) throw new NoSuchElementException("queue is empty");
        Object object = null;
        object = this.myQueue[this.frontPos];
        this.myQueue[this.frontPos] = null;
        this.frontPos++;
        return object;
    }

    Object front() throws NoSuchElementException {
        Object object = null;
        if(this.rearPos<0) throw new NoSuchElementException("queue is empty");;
        object = this.myQueue[this.frontPos];
        return object;
    }

    Object rear() throws NoSuchElementException {
        Object object = null;
        if(this.rearPos<0) throw new NoSuchElementException("queue is empty");;
        object = this.myQueue[this.rearPos];
        return object;
    }
}
