package org.example;

import java.util.List;

public class Main {

    public boolean hasCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(slowNode.next != null && fastNode.next != null)
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode.equals(fastNode)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode testNode4 = new ListNode(-4);
        ListNode testNode3 = new ListNode(0, testNode4);
        ListNode testNode2 = new ListNode(2, testNode3);
        ListNode testNode1 = new ListNode(3, testNode2);
        testNode4.next = testNode1;

//        ListNode testNode4 = new ListNode(1);
//        ListNode testNode3 = new ListNode(2, testNode4);
//        testNode4.next = testNode3;

//        ListNode testNode4 = new ListNode(1);

//        ListNode testNode3 = new ListNode(3);
//        ListNode testNode2 = new ListNode(2, testNode3);
//        ListNode testNode1 = new ListNode(1, testNode2);
//        ListNode testNode4 = new ListNode();

        Main test = new Main();
        System.out.println(test.hasCycle(testNode4));
    }
}