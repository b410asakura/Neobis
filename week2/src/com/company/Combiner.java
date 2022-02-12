package com.company;

import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (N > 0) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
                stringBuilder.append(str1.charAt(i));
                stringBuilder.append(str2.charAt(i));
            }
            if (str1.length() < str2.length()) stringBuilder.append(str2.substring(str1.length()));
            else if (str1.length() > str2.length()) stringBuilder.append(str1.substring(str2.length()));
            System.out.println(stringBuilder);
            stringBuilder.delete(0, stringBuilder.length());
            N--;
        }
    }
}
