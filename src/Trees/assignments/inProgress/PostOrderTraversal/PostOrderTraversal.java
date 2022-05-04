package Trees.assignments.inProgress.PostOrderTraversal;

import java.util.Scanner;

public class PostOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree intTree = new Tree();
        int nodes = sc.nextInt();
        for (int i = 0; i < nodes; i++) {
            int leftVal = sc.nextInt();
            int rightVal = sc.nextInt();
            intTree.insert(leftVal);
            intTree.insert(rightVal);
        }
        intTree.displayPostOrderTraversal();
    }
}
