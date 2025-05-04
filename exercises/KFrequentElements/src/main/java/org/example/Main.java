package org.example;

import java.util.*;

public class Main {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();
        int[] mostFrequent = new int[k];
        PriorityQueue<int[]> sortingHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> occurrence : frequency.entrySet()) {
            sortingHeap.offer(new int[]{occurrence.getValue(), occurrence.getKey()});
            if(sortingHeap.size() > k){
                sortingHeap.poll();
            }
        }

        for(int i = 0; i < k; i++){
            mostFrequent[i] = Objects.requireNonNull(sortingHeap.poll())[1];
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int[] filler = new int[]{1,1,7,1,2,7,2,3,7,7};
        System.out.println(Arrays.toString(test.topKFrequent(filler, 2)));
    }
}