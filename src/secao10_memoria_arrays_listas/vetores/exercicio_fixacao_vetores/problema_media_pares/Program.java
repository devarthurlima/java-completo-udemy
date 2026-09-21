package secao10_memoria_arrays_listas.vetores.exercicio_fixacao_vetores.problema_media_pares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, somaPares = 0, nPares = 0;
        double mediaPares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares = somaPares + vetor[i];
                nPares++;
            }
        }
        if (nPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares = (double) somaPares / nPares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }
        sc.close();
    }
}
