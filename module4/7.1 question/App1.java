import java.util.Scanner;

public class App1 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        TreeNode root = null;
        while ((num = scanner.nextInt()) != 0) {
            root = insert(root, num);
        }
        if (isBalanced(root)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val == root.val) {
            return root;
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}