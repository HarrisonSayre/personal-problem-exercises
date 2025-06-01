package org.example;

public class Main {

    public int searchSubTree(TreeNode root, int[] vertices){

        if(root == null){
            return 0;
        }
        int depth = 1;
        int leftdepth = searchSubTree(root.left, vertices);
        int rightdepth = searchSubTree(root.right, vertices);

        int lowerTrees = leftdepth+rightdepth;

        if (leftdepth >= rightdepth) {
            depth += leftdepth;
        } else {
            depth += rightdepth;
        }

        if(vertices[0] < lowerTrees){
            vertices[0] = lowerTrees;
        }

        return depth;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] vertices = new int[1];
        System.out.println(vertices[0]);
        searchSubTree(root, vertices);
        return vertices[0];
    }

    public static void main(String[] args) {

        Main test = new Main();
        TreeNode nodeTop = new TreeNode(1);
        TreeNode nodeLeft = new TreeNode(2);
        TreeNode nodeRight = new TreeNode(3);
        TreeNode nodeBottomLeft = new TreeNode(4);
        TreeNode nodeBottomRight = new TreeNode(5);
        nodeTop.left = nodeLeft;
        nodeTop.right = nodeRight;
        nodeLeft.left = nodeBottomLeft;
        nodeLeft.right = nodeBottomRight;
        System.out.println(test.diameterOfBinaryTree(nodeTop));
    }
}