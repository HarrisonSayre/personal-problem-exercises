package org.example;


public class Main {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int depth = 1;
        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);
        if(leftdepth >= rightdepth){
            depth += leftdepth;
        }
        else depth+= rightdepth;

        return depth;
    }

    public static void main(String[] args) {
        Main test = new Main();
        TreeNode nodeTop = new TreeNode(1);
        TreeNode nodeLeft = new TreeNode(9);
        TreeNode nodeRight = new TreeNode(20);
        TreeNode nodeBottomRightLeft = new TreeNode(15);
        TreeNode nodeBottomRightRight = new TreeNode(7);
        nodeTop.left = nodeLeft;
        nodeTop.right = nodeRight;
        nodeRight.left = nodeBottomRightLeft;
        nodeRight.right = nodeBottomRightRight;
        System.out.println(test.maxDepth(nodeTop));
        }
    }