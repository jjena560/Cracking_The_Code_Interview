import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class CheckSubtree {
    Node root1, root2;

    boolean isSubTree(Node root, Node subTree) {
        if (root == null) {
            return false;
        } else if (isSameTree(root, subTree)) {
            return true;
        } else {
            return isSubTree(root.left, subTree) || isSubTree(root.right, subTree);
        }
    }

    boolean isSameTree(Node s, Node t) {
        if (s == null || t == null) {
            return s == null && t == null;
        } else if (s.data == t.data) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        CheckSubtree tree = new CheckSubtree();
        tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4);
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);

        tree.root2 = new Node(10);
        tree.root2.right = new Node(6);
        tree.root2.left = new Node(40); // change 40 to 4 and it will be a subtree
        tree.root2.left.right = new Node(30);

        if (tree.isSubTree(tree.root1, tree.root2))
            System.out.println("Tree 2 is subtree of Tree 1 ");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");
    }
}