package com.takeUForward;

public class DLLNode {

     public int value;
    public DLLNode next;
    public DLLNode prev;


    public DLLNode(int value) {
        this.value = value;
    }

    public DLLNode(int value, DLLNode next, DLLNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

}
