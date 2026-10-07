// Ex6 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}
