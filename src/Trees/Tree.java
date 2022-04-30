package Trees;

public class Tree {
    private Node root;

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(22);
        intTree.insert(29);
        intTree.insert(21);
        intTree.insert(37);
        intTree.insert(28);
        intTree.insert(31);
        intTree.displayInOrderTraversal();
    }

    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            root.insert(val);
        }
    }

    public void displayInOrderTraversal() {
        if (root != null) {
            root.inOrderTraversal();
        }
    }

    public class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node(int data) {
            this.data = data;
        }

        public void inOrderTraversal() {
            if (leftChild != null) {
                leftChild.inOrderTraversal();
            }
            System.out.print(data + " ");
            if (rightChild != null) {
                rightChild.inOrderTraversal();
            }
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

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }

}
