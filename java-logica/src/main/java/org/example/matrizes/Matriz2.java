package org.example.matrizes;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] quadrado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                quadrado[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            double soma = 0.0;
            for (int j = 0; j < n; j++) {
                soma = soma + quadrado[i][j];
            }
                System.out.println(soma);

            }

        sc.close();
    }

}

