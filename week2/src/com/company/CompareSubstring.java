package com.company;

import java.util.Scanner;

public class CompareSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ((scanner.hasNext())){
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            int longest = 0;
            for (int i = 1; i <= input1.length(); i++) {
                for (int j = 0; j <= input1.length() - i; j++) {
                    if(input2.contains(input1.substring(j, j + i))){
                        longest = i;
                        break;
                    }
                }
            }
            System.out.println(longest);
        }
    }
}
