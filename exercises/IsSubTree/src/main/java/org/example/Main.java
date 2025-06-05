package org.example;

public class Main {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == q) {
            return true;
        } else if (q != null && p != null && q.val == p.val) {
            boolean checkLeft = this.isSameTree(p.left, q.left);
            boolean checkRight = this.isSameTree(p.right, q.right);
            return checkLeft && checkRight;
        } else {
            return false;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) {
            return true;
        }
        if(root == null){
            return false;
        }
        if(isSameTree(root, subRoot)){
            return true;
        }
        boolean boolLeftSubTree = isSubtree(root.left, subRoot);
        boolean boolRightSubTree = isSubtree(root.right, subRoot);
        return boolLeftSubTree || boolRightSubTree;
    }

    public static void main(String[] args) {

        Main test = new Main();
        TreeNode nodeTopP = new TreeNode(3);
        TreeNode nodeLeftP = new TreeNode(4);
        TreeNode nodeRightP = new TreeNode(5);
        nodeTopP.left = nodeLeftP;
        nodeTopP.right = nodeRightP;

        TreeNode nodeLeftPLeft = new TreeNode(1);
        TreeNode nodeLeftPRight = new TreeNode(2);
        nodeLeftP.left = nodeLeftPLeft;
        nodeLeftP.right = nodeLeftPRight;

        TreeNode nodeLeftPRightRight = new TreeNode(0);
        //nodeLeftPRight.right = nodeLeftPRightRight;

        TreeNode nodeTopQ = new TreeNode(4);
        TreeNode nodeLeftQ = new TreeNode(1);
        TreeNode nodeRightQ = new TreeNode(2);
        nodeTopQ.left = nodeLeftQ;
        nodeTopQ.right = nodeRightQ;

        System.out.println(test.isSubtree(nodeTopP, nodeTopQ));
    }
}