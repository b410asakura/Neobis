package com.company;

import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();

        int result = (endHour * 60 + endMinute) - (startHour * 60 + startMinute);

        if(result <= 0) result += 24 * 60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",
                result / 60, result % 60);
    }
}
