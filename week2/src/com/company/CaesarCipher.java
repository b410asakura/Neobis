package com.company;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            int shift = scanner.nextInt();
            char[] output = new char[str.length()];
            for (int j = 0; j < str.length(); j++) {
                if (((int) str.charAt(j) - shift) >= 65) output[j] = (char) ((int) str.charAt(j) - shift);
                else output[j] = (char) (26 + (int) str.charAt(j) - shift);
                System.out.print(output[j]);
            }
            System.out.println();
        }
    }
}
