class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int data) {
        val = data;
        left = right = null;
    }
}

public class CheckBST {
    TreeNode root;

    public boolean checkBST(TreeNode root) {
        // the two nulls are for the min and max values
        return isBST(root, null, null);
    }

    boolean isBST(TreeNode root, Integer max, Integer min) {
        if (root == null) {
            return true;
        }
        if (max != null && root.data >= max || min != null && root.data <= min) {
            return false;
        }

        return isBST(root.left, root.data, min) && isBST(root.right, max, root.data);
    }

    public static void main(String args[]) {
        CheckBST tree = new CheckBST();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);

        if (tree.checkBST(tree.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

}
