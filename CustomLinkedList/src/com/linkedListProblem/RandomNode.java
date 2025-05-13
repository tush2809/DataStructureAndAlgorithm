package com.linkedListProblem;

public class RandomNode {
    int data;

    RandomNode next;

    RandomNode random;


    RandomNode() {
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    RandomNode(int x) {
        this.data = x;
        this.next = null;
        this.random = null;
    }

    RandomNode(int x, RandomNode nextNode, RandomNode randomNode) {
        this.data = x;
        this.next = nextNode;
        this.random = randomNode;
    }
}
