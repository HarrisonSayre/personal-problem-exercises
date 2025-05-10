package org.example;


public class Main {

    public ListNode reverseListIterative(ListNode head) {
        ListNode prevHead = null;

        ListNode temp;
        for(ListNode currentHead = head; currentHead != null; currentHead = temp) {
            temp = currentHead.next;
            prevHead = currentHead;
        }

        return prevHead;
    }

    public ListNode reverseListRecursive(ListNode head) {
        ListNode currentHead = head;
        if (head == null) {
            return null;
        } else {
            if (head.next != null) {
                currentHead = this.reverseListRecursive(head.next);
                head.next.next = head;
            }

            head.next = null;
            return currentHead;
        }
    }


    public static void main(String[] args) {
        ListNode testNode3 = new ListNode(3);
        ListNode testNode2 = new ListNode(2, testNode3);
        ListNode testNode1 = new ListNode(1, testNode2);

        ListNode testNode4 = new ListNode();

        Main test = new Main();
        System.out.println(test.reverseListIterative(testNode1).val);
        System.out.println(test.reverseListRecursive(testNode1).val);
        System.out.println(test.reverseListIterative(testNode4).val);

    }
}
