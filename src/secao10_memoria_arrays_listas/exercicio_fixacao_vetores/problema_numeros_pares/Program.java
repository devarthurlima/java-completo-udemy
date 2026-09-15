package secao10_memoria_arrays_listas.exercicio_fixacao_vetores.problema_numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdPares;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        qtdPares = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);
                qtdPares++;
            }
        }

        System.out.printf("\n\nQuantidade de Pares = %d\n", qtdPares);

        sc.close();
    }
}
