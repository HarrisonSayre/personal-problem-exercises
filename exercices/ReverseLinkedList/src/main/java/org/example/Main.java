package org.example;

public class Main {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseListIterative(ListNode head) {
        ListNode prevHead = null;
        ListNode currentHead = head;

        while(currentHead != null){
            ListNode temp = currentHead.next;
            prevHead = currentHead;
            currentHead = temp;
        }

        return prevHead;
    }

    public ListNode reverseListRecursive(ListNode head) {
        ListNode currentHead = head;

        if(head == null){
            return null;
        }

        if(head.next != null){
            currentHead = reverseListRecursive(head.next);
            head.next.next = head;
        }

        head.next = null;
        return currentHead;
    }


    public static void main(String[] args) {
        Main test = new Main();
    }
}