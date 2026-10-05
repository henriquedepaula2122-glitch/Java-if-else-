// Ex5 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 0 a 100: ");
        int numero = scanner.nextInt();

        if (numero >= 50 && numero <= 100) {
            System.out.println("O número está dentro do intervalo.");
        } else {
            System.out.println("O número não está dentro do intervalo.");
        }

    }

}
