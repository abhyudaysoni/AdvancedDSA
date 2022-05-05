package Trees.assignments.completed;

import java.io.IOException;
import java.util.Scanner;

public class InOrderTraversal {
    static int[] left = new int[100001];
    static int[] right = new int[100001];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        for (int i = 1; i <= nodes; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }
        inOrderTraversal(1);
    }

    static void inOrderTraversal(int n) {
        if (left[n] != -1) {
            inOrderTraversal(left[n]);
        }
        System.out.print(n + " ");
        if (right[n] != -1) {
            inOrderTraversal(right[n]);
        }
    }
}
