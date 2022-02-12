package com.company;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt();
        char character = scanner.next().charAt(0);
        float[][] matrix = new float[12][12];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextFloat();
            }
        }
        float sum = 0;
        int count = 0;
        for (float[] floats : matrix) {
            sum = sum + floats[column];
            count++;
        }
        if(character == 'S') System.out.printf("%.1f\n", sum);
        else if(character == 'M') System.out.printf("%.1f\n", sum / count);

    }
}
