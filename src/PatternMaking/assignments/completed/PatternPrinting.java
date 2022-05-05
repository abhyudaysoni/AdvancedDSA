package PatternMaking.assignments.completed;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern(sc.nextInt());
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
