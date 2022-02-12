package com.company;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            float input = scanner.nextFloat();
            System.out.println("NOTAS:");
            System.out.printf("%d nota(s) de R$ 100,00\n", (int)input / 100);
            System.out.printf("%d nota(s) de R$ 50,00\n", (int)input % 100 / 50);
            System.out.printf("%d nota(s) de R$ 20,00\n", (int)input % 100 % 50 / 20);
            System.out.printf("%d nota(s) de R$ 10,00\n", (int)input % 100 % 50 % 20 / 10);
            System.out.printf("%d nota(s) de R$ 5,00\n", (int)input % 100 % 50 % 20 % 10 / 5);
            System.out.printf("%d nota(s) de R$ 2,00\n", (int)input % 100 % 50 % 20 % 10 % 5 / 2);
            System.out.println("MOEDAS:");
            System.out.printf("%d moeda(s) de R$ 1.00\n", (int)input % 100 % 50 % 20 % 10 % 5 % 2);
            System.out.printf("%d moeda(s) de R$ 0.50\n", (int)(Math.ceil(100 * (input - (int)input)) / 50));
            System.out.printf("%d moeda(s) de R$ 0.25\n", (int)(Math.ceil(100 * (input - (int)input)) % 50 / 25));
            System.out.printf("%d moeda(s) de R$ 0.10\n", (int)(Math.ceil(100 * (input - (int)input)) % 50 % 25 / 10));
            System.out.printf("%d moeda(s) de R$ 0.05\n", (int)(Math.ceil(100 * (input - (int)input)) % 50 % 25 % 10 / 5));
            System.out.printf("%d moeda(s) de R$ 0.01\n", (int)(Math.ceil(100 * (input - (int)input)) % 50 % 25 % 10 % 5));
    }
}
