// Ex4 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
 
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
 
        if (numero1 > numero2) {
            System.out.println(numero1);
            System.out.println(numero2);
        } else {
            System.out.println(numero2);
            System.out.println(numero1);
        }
    }
}
