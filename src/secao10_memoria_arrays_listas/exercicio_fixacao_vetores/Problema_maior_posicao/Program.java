package secao10_memoria_arrays_listas.exercicio_fixacao_vetores.Problema_maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posMaior;
        double maior;

        System.out.print("Quantos números você vao digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        maior = vetor[0];
        posMaior = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

        sc.close();

    }
}
