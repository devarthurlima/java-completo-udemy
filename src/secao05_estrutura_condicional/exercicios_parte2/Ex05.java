package secao05_estrutura_condicional.exercicios_parte2;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        int codigo, quantidade;
        double valor;
        Scanner sc = new Scanner(System.in);

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1) {
            valor = quantidade * 4;

        } else if (codigo == 2) {
            valor = quantidade * 4.5;

        } else if (codigo == 3) {
            valor = quantidade * 5;

        } else if (codigo == 4) {
            valor = quantidade * 2;

        } else {
            valor = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", valor);

        sc.close();
    }
}
