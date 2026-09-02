package secao04_estrutura_sequencial.exercicios_parte1;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int peca1, peca2, numPeca1, numPeca2;
        double valorPeca1,valorPeca2,valorTotal;

        Scanner sc = new Scanner(System.in);
        peca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        peca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorTotal = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.printf("Valor a pagar: R$%.2f%n",valorTotal);

        sc.close();
    }
}
