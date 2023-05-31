package org.example.matrizes;

import java.util.Scanner;

public class Matriz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] ordem = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ordem[i][j] = sc.nextInt();
            }
        }
        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                soma = soma + ordem[i][j];
            }
        }
        System.out.println(soma);
        sc.close();
    }

}
