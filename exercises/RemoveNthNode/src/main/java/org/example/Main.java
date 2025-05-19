package org.example;

public class Main {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int listLength = 0;
        ListNode currentHead = head;

        while(currentHead != null){
            listLength++;
            currentHead = currentHead.next;
        }

        int targetIndex = listLength - n;

        if(targetIndex == 0){
            return head.next;
        }

        ListNode currentHead2 = head;

        int i = 0 ;

        while(i < targetIndex-1){
            currentHead2 = currentHead2.next;
            i++;
        }

        currentHead2.next = currentHead2.next.next;

        return head;
    }

    public static void main(String[] args) {

        ListNode testNode5 = new ListNode(5);
        ListNode testNode4 = new ListNode(4, testNode5);
        ListNode testNode3 = new ListNode(3, testNode4);
        ListNode testNode2 = new ListNode(2, testNode3);
        ListNode testNode1 = new ListNode(1, testNode2);

//        ListNode testNode2 = new ListNode(2);
//        ListNode testNode1 = new ListNode(1, testNode2);

//        ListNode testNode1 = new ListNode(1);

        Main test = new Main();
        test.removeNthFromEnd(testNode1, 2);
    }
}