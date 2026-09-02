package secao04_estrutura_sequencial.exercicios_parte1;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double area, preco, largura, comprimento, precoQuadrado;

        Scanner sc = new Scanner(System.in);
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        area = largura * comprimento;
        precoQuadrado = sc.nextDouble();
        preco = area * precoQuadrado;

        System.out.printf("Área = %.2f%n", area);
        System.out.printf("Preço = %.2f%n", preco);

        sc.close();
    }
}
