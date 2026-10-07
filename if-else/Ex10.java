// Ex10 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os números são iguais");
        } else {
            int maior = numero1;

            if (numero2 > maior) {
                maior = numero2;
            }
            if (numero3 > maior) {
                maior = numero3;
            }

            System.out.println("O maior número é: " + maior);
        }
    }
}