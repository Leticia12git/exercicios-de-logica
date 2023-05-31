package org.example.proposto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60){
            System.out.printf("REPROVADO");
        }else if (notaFinal >= 60){
            System.out.printf("APROVADO");
        }
        sc.close();
    }
}
