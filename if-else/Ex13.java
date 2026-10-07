// Ex13 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado;

        if (operacao == '+') {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '-') {
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '*') {
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '/') {
            if (numero2 <= 0) {
                System.out.println("Impossível dividir!!");
            } else {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Sinal Inválido");
        }
    }
}