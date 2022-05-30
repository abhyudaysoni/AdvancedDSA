package Trees.practice.Tree1;

public class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
    }

    public void preOrderTraversal() {
        System.out.print(data + " ");
        if (leftChild != null) {
            leftChild.preOrderTraversal();
        }
        if (rightChild != null) {
            rightChild.preOrderTraversal();
        }
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

    public boolean search(int val) {
        if (val == data) {
            return true;
        } else if (val < data) {
            if (leftChild != null) {
                return leftChild.search(val);
            }
        } else {
            if (rightChild != null) {
                return rightChild.search(val);
            }
        }
        return false;
    }

    public int maxElement() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.maxElement();
        }
    }

    public int minElement() {
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.minElement();
        }
    }

    public int heightOfTree() {
        if (leftChild == null || rightChild == null) {
            return 0;
        } else {
            int lh = leftChild.heightOfTree();
            int rh = rightChild.heightOfTree();
            if (lh > rh) {
                return lh + 1;
            } else
                return rh + 1;
        }
    }

    public int diameterOfTree() {
        if (leftChild == null || rightChild == null) {
            return 0;
        } else {
            int lh = leftChild.heightOfTree();
            int rh = rightChild.heightOfTree();
            int ld = leftChild.diameterOfTree();
            int rd = rightChild.diameterOfTree();
            return Math.max(lh + rh + 1, Math.max(ld, rd));
        }
    }
}
