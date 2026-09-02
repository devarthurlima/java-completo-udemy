package secao04_estrutura_sequencial.exercicios_parte1;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        double A,B,C,ATriaguloRetangulo,ACirculo,ATrapezio,AQuadrado,ARetangulo,pi;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        pi = 3.14159;

        ATriaguloRetangulo = A * C / 2;
        ACirculo = pi * Math.pow(C, 2);
        ATrapezio = (A + B) / 2.0 * C;
        AQuadrado = B * B;
        ARetangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n", ATriaguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", ACirculo);
		System.out.printf("TRAPEZIO: %.3f%n", ATrapezio);
		System.out.printf("QUADRADO: %.3f%n", AQuadrado);
		System.out.printf("RETANGULO: %.3f%n", ARetangulo);

        sc.close();
    }
}
