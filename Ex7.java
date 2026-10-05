// Ex7 Guilherme Duarte de Barro - RA: 12526216401 Henrique de Paula

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite anos de serviço: ");
        int anosServico = scanner.nextInt();
        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        if (anosServico >= 5) {
            double aumento = salario * 0.20;
            double novoSalario = salario + aumento;
            System.out.println("Parabéns! Você recebeu um aumento de 20%.");
            System.out.println("Seu novo salário é: " + formatter.format(novoSalario));
        } else {
            double aumento = salario * 0.10;
            double novoSalario = salario + aumento;
            System.out.println("Parabéns! Você recebeu um aumento de 10%.");
            System.out.println("Seu novo salário é: " + formatter.format(novoSalario));
        }
    }
}