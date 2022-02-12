package com.company;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNum = scanner.nextInt();
        int PA, PB;
        double G1, G2;
        int year = 0;
        for (int i = 0; i < testNum; i++) {
            PA = scanner.nextInt();
            PB = scanner.nextInt();
            G1 = scanner.nextDouble();
            G2 = scanner.nextDouble();

            while (PA <= PB) {
                PA += PA * G1 / 100;
                PB += PB * G2 / 100;
                year++;
                if (year > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (year <= 100)
                System.out.println(year + " anos.");
            year = 0;
        }
    }
}
