// Ex1 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args ) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    if (numero > 20) {
        double metade = numero / 2.0;
        System.out.println("O número é maior que 20. A metade dele é: " + metade);
    } else {
        System.out.println("O número é menor ou igual a 20.");      
    } 
    }
}
