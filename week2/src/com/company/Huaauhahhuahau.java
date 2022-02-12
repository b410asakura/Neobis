package com.company;

import java.util.Scanner;

public class Huaauhahhuahau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] wovelsList = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder wovelsString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < wovelsList.length; j++) {
                if (input.charAt(i) == wovelsList[j]) wovelsString.append(input.charAt(i));
            }
        }
        if(wovelsString.toString().equals(wovelsString.reverse().toString())) System.out.println("S");
        else System.out.println("N");

    }
}
