package org.example;

public class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    int key;

    ListNode() {
    }

    ListNode(int val, int key) {
        this.val = val;
        this.key = key;
        this.next = null;
        this.prev = null;
    }

    ListNode(int val, int key, ListNode next, ListNode prev) {
        this.val = val;
        this.key = key;
        this.next = next;
        this.prev = prev;

    }
}