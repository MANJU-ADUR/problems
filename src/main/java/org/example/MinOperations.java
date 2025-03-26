package org.example;

public class MinOperations {
    public static int count(int n1, int n2, int x) {
        int small = Math.min(n1, n2);
        int greater = Math.max(n1, n2);

        int diff = greater - small;
        if (x % 2 == 0 && diff % 2 != 0) {
            return -1;
        }
        if (x % 2 != 0 && diff % 2 == 0) {
            return -1;
        }
        int c = 0;
        while (small < greater) {
            System.out.println("small " + small);
            small += x;
            c++;
            if (small == greater) {
                return c;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(count(6, 8, 2));
    }
}
