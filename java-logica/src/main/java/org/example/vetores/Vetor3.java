package org.example.vetores;

import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];

        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i] + " ");
        }

        System.out.println();
        sc.close();

    }

}

