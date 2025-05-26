package org.example;

import java.util.HashMap;

public class LRUCache {

    private int capacity;
    private ListNode leastRecent;
    private ListNode mostRecent;

    private HashMap<Integer, ListNode> cacheMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<Integer, ListNode>();
        this.leastRecent = new ListNode();
        this.mostRecent = new ListNode();

        //confused
        this.leastRecent.next = this.mostRecent;
        this.mostRecent.prev = this.leastRecent;

    }

    public int get(int key) {
        if(this.cacheMap.containsKey(key))
        {
            delete(cacheMap.get(key));
            insert(cacheMap.get(key));
            return cacheMap.get(key).val;
        }
        return -1;
    }

    public void delete(ListNode toBeDeleted) {
        ListNode prev = toBeDeleted.prev;
        ListNode next = toBeDeleted.next;
        next.prev = prev;
        prev.next = next;
    }

    public void insert(ListNode toBeInserted){
        ListNode prev = mostRecent.prev;
        prev.next = toBeInserted;
        toBeInserted.prev = prev;
        toBeInserted.next = mostRecent;
        mostRecent.prev = toBeInserted;
    }

    public void put(int key, int value) {

        if(cacheMap.containsKey(key)){
            delete(cacheMap.get(key));
        }

        ListNode newNode = new ListNode(value, key);
        cacheMap.put(key, newNode);
        insert(newNode);

        if(cacheMap.size() > capacity){
            ListNode leastNode = leastRecent.next;
            delete(leastNode);
            cacheMap.remove(leastNode.key);
        }
    }
}

