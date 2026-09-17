package secao10_memoria_arrays_listas.exercicio_fixacao_vetores.problema_mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maioridade, posicaomaior;

        System.out.print("Quantas pessoas voce vai digitar?");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maioridade = idades[0];
        posicaomaior = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maioridade) {
                maioridade = idades[i];
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);

        sc.close();
    }
}
