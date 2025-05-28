package org.example;

public class Main {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {

        Main test = new Main();

        TreeNode nodeTop = new TreeNode(2);
        TreeNode nodeLeft = new TreeNode(1);
        TreeNode nodeRight = new TreeNode(3);

        TreeNode emptyNode = new TreeNode();

        nodeTop.left = nodeLeft;
        nodeTop.right = nodeRight;
        System.out.println(nodeTop.left.val);
        System.out.println(test.invertTree(nodeTop).left.val);
        System.out.println(emptyNode.val);
    }
}