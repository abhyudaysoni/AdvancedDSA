package Trees.assignments.completed;

public class MinimumInBST {
    public static void main(String[] args) {

    }

    static int minValue(Node node) {
        if (node != null) {
            return minElement(node);
        } else {
            return -1;
        }
    }

    static public int minElement(Node node) {
        if (node.left == null) {
            return node.data;
        } else {
            return minElement(node.left);
        }
    }

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
