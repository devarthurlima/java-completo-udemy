package secao06_estruturas_repetitivas.exercicios_for;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= N; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}
