package tree;

import java.util.LinkedList;
import java.util.Queue;

public class start {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // preorder traversal
    public void preorder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inOrder traversal Left → Root → Right
    public void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder: Left → Right → Root
    public void postFix(Node root) {
        if (root == null) {
            return;
        }
        postFix(root.left);
        postFix(root.right);
        System.out.print(root.data + " ");
    }

    // BST Deletion
    // Deletion ke 3 cases hote hain:
    // 1. Leaf Node: Jis node ka koi child nahi hota.
    // 2. One Child: Jis node ka sirf aik child hota hai.
    // 3. Two Children: Jis node ke dono children hote hain.
    public int FindMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.data) {
            root.left = delete(root.left, value);
        } else if (value > root.data) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            // one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // two child
            root.data = FindMin(root.right);
            root.right = delete(root.right, root.data);

        }
        return root;
    }

    boolean search(Node root, int value) {

        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

        if (value < root.data) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    public void levelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            Node curr = q.remove();

            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {

        start tree = new start();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.println("Search 40: " +
                tree.search(tree.root, 40));

        System.out.println("Minimum: " +
                tree.FindMin(tree.root));

        System.out.println("Maximum: " +
                tree.findMax(tree.root));

        tree.root = tree.delete(tree.root, 30);

        System.out.print("After Delete: ");
        tree.inorder(tree.root);
    }
}
