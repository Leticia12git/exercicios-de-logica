package org.example.proposto;

import java.util.Scanner;

/**
 *     Leia a hora inicial e a hora final de um jogo.
 *     A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
 *     tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */


public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracaoDoJogo;

        if (horaInicial < horaFinal){
            duracaoDoJogo = horaInicial - horaFinal;
        }
        else{
            duracaoDoJogo = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracaoDoJogo + " HORA(S)");

        sc.close();
    }
}
