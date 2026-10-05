// Ex9 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = scanner.nextDouble();

        double limite = salarioBruto * 0.30;

        if (prestacao <= limite) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }
    }
}



