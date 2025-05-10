package org.example;


public class Main {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode();
        ListNode temp = start;

        while(list1 != null && list2 !=null)
        {
            if(list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 == null){
            temp.next = list2;
        }
        else{
            temp.next = list1;
        }

        return start.next;
    }

    public static void main(String[] args) {

        ListNode testNode3 = new ListNode(4);
        ListNode testNode2 = new ListNode(2, testNode3);
        ListNode testNode1 = new ListNode(1, testNode2);

        ListNode testNode8 = new ListNode(8);
        ListNode testNode7 = new ListNode(7, testNode8);
        ListNode testNode6 = new ListNode(4, testNode7);
        ListNode testNode5 = new ListNode(3, testNode6);
        ListNode testNode4 = new ListNode(1, testNode5);

        Main test = new Main();
        System.out.println(test.mergeTwoLists(testNode1, testNode4).val);
        }
    }