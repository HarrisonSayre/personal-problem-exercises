package org.example;

import java.util.HashMap;

public class Main {

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node start = head;

        HashMap<Node, Node> listToCopy = new HashMap();
        listToCopy.put(null, null);

        while(start != null)
        {
            Node copyNode = new Node(start.val);
            listToCopy.put(start,copyNode);
            start = start.next;
        }

        Node start2 = head;
        while(start2 !=null){
            listToCopy.get(start2).next = listToCopy.get(start2.next);
            listToCopy.get(start2).random = listToCopy.get(start2.random);
            start2 = start2.next;
        }

        return listToCopy.get(head);
    }

    public static void main(String[] args) {
        Node node4 = new Node(1);
        Node node3 = new Node(10);
        Node node2 = new Node(11);
        Node node1 = new Node(13);
        Node node0 = new Node(7);
        node4.next = null;
        node3.next = node4;
        node2.next = node3;
        node1.next = node2;
        node0.next = node1;
        node4.random = node0;
        node3.random = node2;
        node2.random = node4;
        node1.random = node0;
        node0.random = null;


//        Node node1 = new Node(2);
//        Node node0 = new Node(1);
//        node1.next = null;
//        node0.next = node1;
//        node1.random = node1;
//        node0.random = node1;
//

//        Node node2 = new Node(3);
//        Node node1 = new Node(3);
//        Node node0 = new Node(3);
//        node2.next = null;
//        node1.next = node2;
//        node0.next = node1;
//        node2.random = null;
//        node1.random = node0;
//        node0.random = null;

        Main test = new Main();

//        System.out.println(test.copyRandomList(node0).next.random.val);
        System.out.println(test.copyRandomList(node0).next.random.val);

    }
}