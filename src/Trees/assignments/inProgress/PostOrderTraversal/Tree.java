package Trees.assignments.inProgress.PostOrderTraversal;

public class Tree {
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
