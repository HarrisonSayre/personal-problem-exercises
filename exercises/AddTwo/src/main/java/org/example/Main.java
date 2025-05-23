package org.example;

import java.util.List;

public class Main {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carryNum = 0;
        int digit1;
        int digit2;
        int sum;

        ListNode returner = new ListNode();
        ListNode cur = returner;

        while (l1 != null || l2 != null || carryNum != 0) {

            if (l1 == null) {
                digit1 = 0;
            } else {
                digit1 = l1.val;
            }
            if (l2 == null) {
                digit2 = 0;
            } else {
                digit2 = l2.val;
            }

            sum = digit1 + digit2 + carryNum;
            carryNum = sum / 10;
            sum = sum % 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            cur.next = new ListNode(sum);
            cur = cur.next;

        }

        return returner.next;
    }

    public static void main(String[] args) {

        Main test = new Main();

//        ListNode l2 = new ListNode(3);
//        ListNode l1 = new ListNode(4, l2);
//        ListNode l0 = new ListNode(2, l1);
//
//        ListNode k2 = new ListNode(4);
//        ListNode k1 = new ListNode(6, k2);
//        ListNode k0 = new ListNode(5, k1);

//        ListNode l0 = new ListNode(0);
//        ListNode k0 = new ListNode(0);


        ListNode l6 = new ListNode(9);
        ListNode l5 = new ListNode(9, l6);
        ListNode l4 = new ListNode(9, l5);
        ListNode l3 = new ListNode(9, l4);
        ListNode l2 = new ListNode(9,l3);
        ListNode l1 = new ListNode(9, l2);
        ListNode l0 = new ListNode(9, l1);

        ListNode k3 = new ListNode(9);
        ListNode k2 = new ListNode(9, k3);
        ListNode k1 = new ListNode(9, k2);
        ListNode k0 = new ListNode(9, k1);

        ListNode result = test.addTwoNumbers(l0, k0);
        while(result != null){
            System.out.print(result.val);
            result = result.next;
        }
    }
}