package Trees.assignments.inProgress.PostOrderTraversal;

public class Node {
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
