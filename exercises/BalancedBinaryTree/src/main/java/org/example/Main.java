package org.example;

public class Main {

    public int searchSubTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int height = 1;
            int leftHeight = this.searchSubTree(root.left);
            int rightHeight = this.searchSubTree(root.right);

            if(leftHeight == -1 || rightHeight == -1)
            {
                return -1;
            }

            leftHeight = Math.abs(leftHeight);
            rightHeight = Math.abs(rightHeight);

            if(Math.abs(leftHeight-rightHeight) > 1){
                return -1;
            }

            if(leftHeight>rightHeight){
                return height+leftHeight;
            }
            return height+rightHeight;
        }
    }

    public boolean isBalanced(TreeNode root) {
        int height = searchSubTree(root);
        return height != -1;
    }

    public static void main(String[] args) {

        Main test = new Main();

        TreeNode nodeTop = new TreeNode(1);
        TreeNode nodeLeft = new TreeNode(2);
        TreeNode nodeRight = new TreeNode(3);
        TreeNode nodeBottomLeft = new TreeNode(4);
        TreeNode nodeBottomRight = new TreeNode(5);
        TreeNode NodeBottomRightRight = new TreeNode(6);
        nodeTop.left = nodeLeft;
        nodeTop.right = nodeRight;
        nodeLeft.left = nodeBottomLeft;
        nodeLeft.right = nodeBottomRight;
        nodeBottomRight.right = NodeBottomRightRight;

        TreeNode rootOnly = new TreeNode();

        System.out.println(test.isBalanced(nodeTop));
        System.out.println(test.isBalanced(rootOnly));

    }
}