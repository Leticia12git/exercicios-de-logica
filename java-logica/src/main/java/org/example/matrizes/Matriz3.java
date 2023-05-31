package org.example.matrizes;

import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] quadrada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                quadrada[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            int maior = quadrada[i][0];
            for (int j = 1; j < n; j++) {
                if (quadrada[i][j] > maior) {
                    maior = quadrada[i][j];

                }
            }
            System.out.println(maior);

        }
        sc.close();
    }

}

