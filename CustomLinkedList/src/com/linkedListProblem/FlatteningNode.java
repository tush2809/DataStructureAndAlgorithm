package com.linkedListProblem;

public class FlatteningNode {

    int data;
    FlatteningNode next;
    FlatteningNode child;
    FlatteningNode() {
        data = 0;
        next = null;
        child = null;
    }

    FlatteningNode(int x) {
        data = x;
        next = null;
        child = null;
    }

    FlatteningNode(int x, FlatteningNode nextNode, FlatteningNode childNode) {
        data = x;
        next = nextNode;
        child = childNode;
    }
}
