package org.example.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] notaSemestre1 = new double[n];
        double[] notaSemestre2 = new double[n];

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
            notaSemestre1[i] = sc.nextDouble();
            notaSemestre2[i] = sc.nextDouble();

        }
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            double media = (notaSemestre1[i] + notaSemestre2[i]) / 2.0;

            if (media >= 6.0) {
                System.out.println(nomes[i]);

            }

        }
        sc.close();
    }
}
