package com.company;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int InterWin = 0, GremioWin = 0, draw = 0;
        int countGrenais = 0;

        while(true){
            int InterGoals = scanner.nextInt();
            int GremioGoals = scanner.nextInt();
            if (InterGoals > GremioGoals) InterWin++;
            else if (InterGoals < GremioGoals) GremioWin++;
            else draw++;
            countGrenais++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            int again = scanner.nextInt();
            if(again == 2) break;
        }
        System.out.println(countGrenais + " grenais");
        System.out.println("Inter:" + InterWin);
        System.out.println("Gremio:" + GremioWin);
        System.out.println("Empates:" + draw);
        if (InterWin > GremioWin) System.out.println("Inter venceu mais");
        else if (InterWin < GremioWin) System.out.println("Gremio venceu mais");
        else System.out.print("Não houve vencedor");
    }
}
