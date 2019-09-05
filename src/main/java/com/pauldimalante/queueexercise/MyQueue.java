package com.pauldimalante.queueexercise;

public class MyQueue {
    private Object myQueue[] = new Object[100];
    private int count = -1;

    void Enqueue(Object object) {
        this.count++;
        this.myQueue[this.count] = object;
    }

    Object Dequeue () {
        if(this.count<0) return null;
        Object object = null;
        object = this.myQueue[this.count];
        this.myQueue[this.count] = null;
        this.count--;
        return object;
    }

    Object Front() {
        Object object = null;
        if(this.count<0) return null;
        object = this.myQueue[this.count];
        return object;
    }

    Object Rear() {
        Object object = null;
        if(this.count<0) return null;
        object = this.myQueue[0];
        return object;
    }
}
