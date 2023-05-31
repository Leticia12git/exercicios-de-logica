package org.example.vetores;

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i=0; i<n; i++) {
        numeros[i] = sc.nextInt();
    }
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " ");
            }
        }
        System.out.println();

        int quantidade = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] %2 == 0){
                quantidade++;
            }
        }
        System.out.println(quantidade);
        sc.close();
    }

}

