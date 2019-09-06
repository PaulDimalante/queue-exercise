package com.pauldimalante.queueexercise;

public class MyNode {
    private Object data;
    private MyNode nextNode;

    MyNode() {}

    MyNode(Object data) {
        this.data = data;
    }

    MyNode add(Object data) {
        MyNode newNode = new MyNode(data);
        this.nextNode = newNode;
        return newNode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public MyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNode nextNode) {
        this.nextNode = nextNode;
    }
}
