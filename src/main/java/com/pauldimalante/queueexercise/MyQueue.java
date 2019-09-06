package com.pauldimalante.queueexercise;

import java.util.NoSuchElementException;

public class MyQueue {
    private MyNode myNode = new MyNode();
    private MyNode head = new MyNode();

    void enqueue(Object object) {
        MyNode newNode = new MyNode(object);

        if(this.myNode.getData()==null) {
            this.myNode.setData(object);
        } else {
            this.myNode.setNextNode(newNode);
        }

        if(this.head.getData()==null) {
            this.head = newNode;
        } else if(this.head.getNextNode()==null) {
            this.head.setNextNode(newNode);
        }

        this.myNode = newNode;
    }

    Object dequeue() throws NoSuchElementException {
        try {
            Object object = this.front();
            this.head = this.head.getNextNode();
            return object;
        } catch (NoSuchElementException e) {
            throw e;
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    Object front() throws NoSuchElementException {
        Object object = this.head.getData();
        if(object==null) {
            throw new NoSuchElementException("queue is empty");
        }
        return object;
    }

    Object rear() throws NoSuchElementException {
        Object object = this.myNode.getData();
        if (object==null) {
            throw new NoSuchElementException("queue is empty");
        }
        return object;
    }
}

