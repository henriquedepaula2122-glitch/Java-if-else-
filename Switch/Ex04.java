// Guilherme Duarte de Barros - Exercício 04 - Switch - Henrique de Paula RA: 12526216401

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o plano de trabalho (A, B ou C): ");
        char plano = Character.toUpperCase(sc.next().charAt(0));
        System.out.print("Informe o salário atual: ");
        double salario = sc.nextDouble();

        double novoSalario;

        switch (plano) {
            case 'A':
                novoSalario = salario * 1.10;
                System.out.printf("Novo salário: %.2f%n", novoSalario);
                break;
            case 'B':
                novoSalario = salario * 1.15;
                System.out.printf("Novo salário: %.2f%n", novoSalario);
                break;
            case 'C':
                novoSalario = salario * 1.20;
                System.out.printf("Novo salário: %.2f%n", novoSalario);
                break;
            default:
                System.out.println("Plano inválido");
        }

        sc.close();
    }
}