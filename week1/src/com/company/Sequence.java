package com.company;

public class Sequence {
    public static void main(String[] args) {
        double i = 0, j = 1;
        int count = 0;
        while (count <= 10) {
            if (count % 5 == 0) {
                System.out.printf("I=%d J=%d\n", (int) (Math.ceil(i)), (int) (j + i));
                System.out.printf("I=%d J=%d\n", (int) (Math.ceil(i)), (int) (j + i + 1));
                System.out.printf("I=%d J=%d\n", (int) (Math.ceil(i)), (int) (j + i + 2));
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, j + i);
                System.out.printf("I=%.1f J=%.1f\n", i, j + i + 1);
                System.out.printf("I=%.1f J=%.1f\n", i, j + i + 2);
            }
            i += 0.2;
            count++;
        }
    }
}
