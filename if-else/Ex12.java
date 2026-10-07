// Ex12 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        double desconto;

        if (salario <= 600.00) {
            desconto = 0;
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        System.out.println("Desconto do INSS: " + desconto);
    }
}