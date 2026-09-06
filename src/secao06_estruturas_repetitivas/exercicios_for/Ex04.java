package secao06_estruturas_repetitivas.exercicios_for;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (y == 0) {
                System.out.println("Divisão Impossível");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n",div);
            }
        }

        sc.close();
    }
}
