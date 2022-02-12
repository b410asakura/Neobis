package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] sides = {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()};
        Arrays.sort(sides, Collections.reverseOrder());
        double A = sides[0];
        double B = sides[1];
        double C = sides[2];
        if(A >= B + C) System.out.println("NAO FORMA TRIANGULO");
        else{
            if(Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) System.out.println("TRIANGULO RETANGULO");
            if(Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) System.out.println("TRIANGULO OBTUSANGULO");
            if(Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) System.out.println("TRIANGULO ACUTANGULO");
            if(A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
            if(A == B && B != C
                    || B == C && C != A
                    || C == A && A != C) System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
