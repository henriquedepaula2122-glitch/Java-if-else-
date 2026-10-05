// Ex3 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais");
        } else {
            int diferenca;
            if (numero1 > numero2) {
                diferenca = numero1 - numero2;
            } else {
                diferenca = numero2 - numero1;
            }
            System.out.println("A diferença é: " + diferenca);
        }
    }
}