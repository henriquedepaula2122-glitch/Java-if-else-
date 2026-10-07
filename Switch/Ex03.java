// Guilherme Duarte de Barros - Exercício 03 - Switch - Henrique de Paula RA: 12526216401

import java.util.Scanner;

public class Ex03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o período (M, V ou N): ");
        char periodo = Character.toUpperCase(sc.next().charAt(0));

        switch (periodo) {
            case 'M':
                System.out.println("Bom dia");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Período inválido");
        }

        sc.close();
    }
}