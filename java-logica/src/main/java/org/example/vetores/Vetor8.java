package org.example.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] sexo = new char[n];

        for (int i = 0; i < n; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);

        }

        double menorAltura = altura[0];
        for (int i = 1; i < n; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];

            }
        }
        System.out.printf("Menor altura =  %.2f%n", menorAltura);
        double maiorAltura = altura[0];
        for (int i = 1; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.printf("Media das alturas das mulheres = ", maiorAltura);

        double somaMulheres = 0.0;
        int contMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'F') {
                somaMulheres = somaMulheres + altura[i];
                contMulheres++;
            }
        }
        if (contMulheres == 0) {
            System.out.println("Nao ha nenhum mulher dentre as pessoas ");
        } else {
            double media = somaMulheres / contMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n:", media);
        }

        int contHomens = 0;
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'M'){
                contHomens++;
            }
            System.out.println("Numero de homens = "+ contHomens);
        }
        sc.close();
    }
}
