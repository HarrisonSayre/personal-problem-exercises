package org.example;

import java.util.*;

public class Main {

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> levelNodes = new LinkedList<>();
        levelNodes.offer(root);

        List<List<Integer>> levels = new ArrayList<>();

        while(!levelNodes.isEmpty()){

            List<Integer> currentLevel = new ArrayList<>();

            for(int i = levelNodes.size(); i > 0; i--)
            {
                TreeNode currentNode = levelNodes.poll();
                if(currentNode != null)
                {
                    currentLevel.add(currentNode.val);
                    levelNodes.offer(currentNode.left);
                    levelNodes.offer(currentNode.right);
                }
            }
            if(!currentLevel.isEmpty())
            {
                levels.add(currentLevel);
            }
        }
        return levels;
    }

    public static void main(String[] args) {

        Main test = new Main();
        TreeNode nodeTop = new TreeNode(3);
        TreeNode nodeLeftMiddle = new TreeNode(9);
        TreeNode nodeRightMiddle = new TreeNode(20);
        nodeTop.left = nodeLeftMiddle;
        nodeTop.right = nodeRightMiddle;

        TreeNode nodeBottomLeft = new TreeNode(15);
        TreeNode nodeBottomRight = new TreeNode(7);
        nodeRightMiddle.left = nodeBottomLeft;
        nodeRightMiddle.right = nodeBottomRight;

        List<List<Integer>> levelList = test.levelOrder(nodeTop);
        for (List<Integer> integers : levelList) {
            System.out.println(integers);
        }
    }
}