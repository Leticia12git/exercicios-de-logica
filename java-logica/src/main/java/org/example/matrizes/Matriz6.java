package org.example.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] inteiros = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inteiros[i][j] = sc.nextDouble();

            }
        }

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        double soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inteiros[i][j] > 0.0) {
                    soma = soma + inteiros[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%.1f ", inteiros[linha][j]);
        }
        System.out.println();


        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", inteiros[i][coluna]);
        }

        System.out.println();


        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", inteiros[i][i]);
        }
        System.out.println();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inteiros[i][j] < 0.0) {
                    inteiros[i][j] = inteiros[i][j] * inteiros[i][j];
                }
            }
        }
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.1f ", inteiros[i][j]);
            }
        }
        System.out.println();
        sc.close();
    }
}



