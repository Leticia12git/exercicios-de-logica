package org.example.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] inteiros = new double[n];

        for (int i = 0; i < n; i++) {
            inteiros[i] = sc.nextDouble();
        }
        double soma = 0.0;
        int quantidade = 0;
        for (int i = 0; i < n; i++) {
            if (inteiros[i] % 2 == 0) {
                soma = soma + inteiros[i];
                quantidade++;
            }
        }
            if (quantidade == 0) {
                System.out.println("Nao existe nenhum numero par");
            }

            else {
                double media = soma / quantidade;
                System.out.printf("%.2f%n", media);
            }

            sc.close();
        }
    }
