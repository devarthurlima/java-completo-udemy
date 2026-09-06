package secao06_estruturas_repetitivas.exercicios_for;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x , i;

        x = sc.nextInt();

        for (i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
