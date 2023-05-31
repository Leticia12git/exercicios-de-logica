package org.example.vetores;

import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i <= n; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
        sc.close();
    }
}
