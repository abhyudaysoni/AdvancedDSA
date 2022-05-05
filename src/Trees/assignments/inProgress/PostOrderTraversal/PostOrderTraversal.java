package Trees.assignments.inProgress.PostOrderTraversal;

import java.util.Scanner;

public class PostOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree intTree = new Tree();
        int nodes = sc.nextInt();
        for (int i = 0; i < nodes; i++) {
            intTree.insert(sc.nextInt());
            intTree.insert(sc.nextInt());
        }
        intTree.displayPostOrderTraversal();
    }

    public static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node(int data) {
            this.data = data;
        }

        public void postOrderTraversal() {
            if (leftChild != null) {
                leftChild.postOrderTraversal();
            }
            if (rightChild != null) {
                rightChild.postOrderTraversal();
            }
            System.out.print(data + " ");
        }

        public void insert(int val) {
            if (val == data) {
                return;
            }
            if (val < data) {
                if (leftChild == null) {
                    leftChild = new Node(val);
                } else {
                    leftChild.insert(val);
                }
            } else {
                if (rightChild == null) {
                    rightChild = new Node(val);
                } else {
                    rightChild.insert(val);
                }
            }
        }
    }

    public static class Tree {
        private Node root;

        public void insert(int val) {
            if (root == null) {
                root = new Node(1);
            } else {
                root.insert(val);
            }
        }

        public void displayPostOrderTraversal() {
            if (root != null) {
                root.postOrderTraversal();
            }
        }
    }
}
