package org.example;

import java.util.List;

public class Main {

    public void reorderList(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head.next;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        ListNode secondHalf = slowNode.next;
        ListNode prevHead = slowNode.next;
        prevHead = null;

        System.out.println(secondHalf.val);

        ListNode temp;
        while(secondHalf != null){
            temp = secondHalf.next;
            secondHalf.next = prevHead;
            prevHead = secondHalf;
            secondHalf = temp;
        }


        ListNode start = head;
        ListNode secondStart = prevHead;
        ListNode temp1;
        ListNode temp2;
        while(secondStart != null){
            temp1 = start.next;
            temp2 = secondStart.next;
            start.next = secondStart;
            secondStart.next = temp1;
            start = temp1;
            secondStart = temp2;
        }
    }

    public static void main(String[] args) {
        ListNode testNode4 = new ListNode(4);
        ListNode testNode3 = new ListNode(3, testNode4);
        ListNode testNode2 = new ListNode(2, testNode3);
        ListNode testNode1 = new ListNode(1, testNode2);
        Main test = new Main();
        test.reorderList(testNode1);
    }
}