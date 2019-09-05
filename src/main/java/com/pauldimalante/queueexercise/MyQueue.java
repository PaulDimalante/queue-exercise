package com.pauldimalante.queueexercise;

public class MyQueue {
    private Object myQueue[] = new Object[100];
    private int rearPos = -1;
    private int frontPos = 0;

    void Enqueue(Object object) {
        this.rearPos++;
        this.myQueue[this.rearPos] = object;
    }

    Object Dequeue () {
        if(this.rearPos<0) return null;
        Object object = null;
        object = this.myQueue[this.frontPos];
        this.myQueue[this.frontPos] = null;
        this.frontPos++;
        return object;
    }

    Object Front() {
        Object object = null;
        if(this.rearPos<0) return null;
        object = this.myQueue[this.frontPos];
        return object;
    }

    Object Rear() {
        Object object = null;
        if(this.rearPos<0) return null;
        object = this.myQueue[this.rearPos];
        return object;
    }
}
