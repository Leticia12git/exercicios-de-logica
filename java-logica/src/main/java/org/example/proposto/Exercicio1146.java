package org.example.proposto;

import java.util.Scanner;

public class Exercicio1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {

            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.print(x);
            x = sc.nextInt();
        }
        sc.close();
    }


}

