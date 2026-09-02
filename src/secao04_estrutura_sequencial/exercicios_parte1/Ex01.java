package secao04_estrutura_sequencial.exercicios_parte1;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        int x, y, soma;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        soma = x + y;

        System.out.println(soma);

        sc.close();
    }
}
