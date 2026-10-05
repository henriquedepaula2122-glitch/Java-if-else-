// Ex2 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;   

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: "); 
        int Idade = scanner.nextInt();
        if (Idade > 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}