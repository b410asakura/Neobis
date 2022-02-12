package com.company;

import java.util.Scanner;

public class FlaviousJosephusLegend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int caseNumber = 1;
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.printf("Case %d: %d\n", caseNumber, josephus(n, k));
            caseNumber++;
        }

    }

    static int josephus(int n, int k) {
        int res = 0;
        for (int i = 1; i <= n; i++)
            res = (res + k) % i;
        return res + 1;

    }
}
