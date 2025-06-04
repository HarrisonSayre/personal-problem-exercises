package org.example;

public class Main {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null && p == q){
            return true;
        }
        else if(q != null && p!= null && q.val == p.val){
            boolean checkLeft = isSameTree(p.left, q.left);
            boolean checkRight = isSameTree(p.right, q.right);
            return checkLeft && checkRight;
        }
        return false;
    }

    public static void main(String[] args) {

        Main test = new Main();
        TreeNode nodeTopP = new TreeNode(1);
        TreeNode nodeLeftP = new TreeNode(2);
        TreeNode nodeRightP = new TreeNode(3);
        nodeTopP.left = nodeLeftP;
        nodeTopP.right = nodeRightP;

        TreeNode nodeTopQ = new TreeNode(1);
        TreeNode nodeLeftQ = new TreeNode(2);
        TreeNode nodeRightQ = new TreeNode(3);
        nodeTopQ.left = nodeLeftQ;
        nodeTopQ.right = nodeRightQ;

        System.out.println(test.isSameTree(nodeTopP, nodeTopQ));

        }
    }