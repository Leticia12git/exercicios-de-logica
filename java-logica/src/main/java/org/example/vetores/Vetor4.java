package org.example.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] reais = new double[n];


        for (int i = 0; i < n; i++) {
            reais[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + reais[i];

        }
        double media = soma / n;
        System.out.printf("%.3f%n", media);

        for (int i = 0; i < n; i++) {
            if (reais[i] < media) {
                System.out.printf("%.1f%n", reais[i]);
            }

        }
        sc.close();
    }
}
