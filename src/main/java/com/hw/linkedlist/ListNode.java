package com.hw.linkedlist;

public class ListNode <T>{
    ListNode <T> next;
    Object data;

    public ListNode(Object data) {
        next = null;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode nextValue) {
        next = nextValue;
    }
}

