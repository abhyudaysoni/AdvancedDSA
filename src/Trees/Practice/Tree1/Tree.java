package Trees.Practice.Tree1;

public class Tree {
    private Node root;

    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            root.insert(val);
        }
    }


    public void displayPreOrderTraversal() {
        if (root != null) {
            root.preOrderTraversal();
        }
    }

    public void displayInOrderTraversal() {
        if (root != null) {
            root.inOrderTraversal();
        }
    }

    public void displayPostOrderTraversal() {
        if (root != null) {
            root.postOrderTraversal();
        }
    }
}
