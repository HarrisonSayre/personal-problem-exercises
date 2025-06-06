package org.example;

public class Main {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }

    public static void main(String[] args) {

        Main test = new Main();

        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);

        TreeNode node0 = new TreeNode(0);
        TreeNode node4 = new TreeNode(4);

        node4.left = node3;
        node4.right = node5;

        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);

        TreeNode node2 = new TreeNode(2);
        node2.left = node0;
        node2.right = node4;

        TreeNode node8 = new TreeNode(8);
        node8.left = node7;
        node8.right = node9;

        TreeNode node6 = new TreeNode(6);
        node6.left = node2;
        node6.right =node8;

        System.out.println(test.lowestCommonAncestor(node6, node2, node4).val);

    }
}