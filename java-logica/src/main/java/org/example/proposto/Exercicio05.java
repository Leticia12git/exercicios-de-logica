package org.example.proposto;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        double idade1 = sc.nextDouble();
        System.out.print("Digite outro nome: ");
        sc.nextLine();
        String nome2 = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        double idade2 = sc.nextDouble();

        double media = (idade1 + idade2) / 2;

        System.out.printf("A idade media de %s e %s é de %.1f%n anos",nome1, nome2, media);

        sc.close();
    }
}
