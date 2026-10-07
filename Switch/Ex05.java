// Guilherme Duarte de Barros - Exercício 05 - Switch - Henrique de Paula RA: 12526216401

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Informe o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Informe a opção (M, S, P ou D): ");
        char opcao = Character.toUpperCase(sc.next().charAt(0));

        switch (opcao) {
            case 'M':
                System.out.printf("Média: %.2f%n", (n1 + n2) / 2);
                break;
            case 'S':
                double diferenca = Math.max(n1, n2) - Math.min(n1, n2);
                System.out.printf("Diferença do maior pelo menor: %.2f%n", diferenca);
                break;
            case 'P':
                System.out.printf("Produto: %.2f%n", n1 * n2);
                break;
            case 'D':
                if (n2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    System.out.printf("Divisão do primeiro pelo segundo: %.2f%n", n1 / n2);
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}