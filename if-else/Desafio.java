// Desafio 
// Eliminar primeiro que não pode votar, depois verificar se é obrigatório ou facultativo

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("É brasileiro? (S/N): ");
        char brasileiro = Character.toUpperCase(sc.next().charAt(0));
        System.out.print("Possui título de eleitor? (S/N): ");
        char titulo = Character.toUpperCase(sc.next().charAt(0));
        System.out.print("É alfabetizado? (S/N): ");
        char alfabetizado = Character.toUpperCase(sc.next().charAt(0));
        System.out.print("É conscrito (serviço militar obrigatório)? (S/N): ");
        char conscrito = Character.toUpperCase(sc.next().charAt(0));

        if (brasileiro == 'N') {
            System.out.println("Não pode votar: apenas brasileiros votam.");
        } else if (conscrito == 'S') {
            System.out.println("Não pode votar: conscritos não votam durante o serviço militar.");
        } else if (idade < 16) {
            System.out.println("Não pode votar: idade mínima é 16 anos.");
        } else if (titulo == 'N') {
            System.out.println("Ainda não está apto: precisa fazer o alistamento eleitoral (título de eleitor).");
        } else if (idade >= 18 && idade <= 70 && alfabetizado == 'S') {
            System.out.println("Apto a votar: voto OBRIGATÓRIO.");
        } else {
            System.out.println("Apto a votar: voto FACULTATIVO.");
        }

        sc.close();
    }
}