package org.example.proposto;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da base: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0)) ;

        System.out.printf("AREA = %.4f%n ",area);
        System.out.printf("PERIMETRO =  %.4f%n ",perimetro);
        System.out.printf("DIAGONAL =  %.4f%n ",diagonal);

        sc.close();
    }
}
