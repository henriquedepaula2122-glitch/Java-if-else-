import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        String categoria;

        if (idade >= 5 && idade <= 7) {
            categoria = "infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "juvenil B";
        } else if (idade >= 18) {
            categoria = "Sênior";
        } else {
            categoria = "Inválida";
        }

        System.out.println("\nCategoria\t\tIdade");
        System.out.println("---------------------------------");
        System.out.println("infantil A\t\t5 - 7 anos");
        System.out.println("infantil B\t\t8 - 10 anos");
        System.out.println("juvenil A\t\t11 - 13 anos");
        System.out.println("juvenil B\t\t14 - 17 anos");
        System.out.println("Sênior\t\t\t18 anos ou mais");
        System.out.println("---------------------------------");

        System.out.println("\nCategoria do nadador: " + categoria);
    }
}