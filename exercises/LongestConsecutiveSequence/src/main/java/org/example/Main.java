package org.example;



import java.util.HashSet;

public class Main {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sequences = new HashSet<>();
        int longest = 0;

        for(int num : nums) {
            sequences.add(num);
        }

        for(int num:sequences){
            if(!sequences.contains(num-1)){
                int entries = 1;
                while(sequences.contains(num+entries)){
                    entries++;
                }
                if(entries > longest) {
                    longest = entries;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int[] testArray1 = new int[]{100,4,200,1,3,2,200,5};
        int[] testArray2 = new int[]{0,3,7,2,5,8,4,6,0,1};
        int[] testArray3 = new int[]{1,0,1,2};
        int[] testArray4 = new int[]{2,0,5};
        int[] testArray5 = new int[]{101,6,100,102,1,2,3,15,4,5};
        System.out.println(test.longestConsecutive(testArray5));
    }
}