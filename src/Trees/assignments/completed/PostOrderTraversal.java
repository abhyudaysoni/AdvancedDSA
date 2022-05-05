package Trees.assignments.completed;

import java.io.IOException;
import java.util.Scanner;

public class PostOrderTraversal {
    static int[] left = new int[100001];
    static int[] right = new int[100001];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        for (int i = 1; i <= nodes; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }
        postOrderTraversal(1);
    }

    static void postOrderTraversal(int n) {
        if (left[n] != -1) {
            postOrderTraversal(left[n]);
        }
        if (right[n] != -1) {
            postOrderTraversal(right[n]);
        }
        System.out.print(n + " ");
    }
}
