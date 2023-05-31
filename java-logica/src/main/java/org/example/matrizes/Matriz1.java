package org.example.matrizes;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] numeros = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (numeros[i][j] < 0) {
                    System.out.println(numeros[i][j]);
                }
            }
        }
        sc.close();
    }
}