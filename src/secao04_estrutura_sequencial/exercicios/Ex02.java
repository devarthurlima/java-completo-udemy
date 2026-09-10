package secao04_estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            double A, pi, R;

            Scanner sc = new Scanner(System.in);
            R = sc.nextDouble();

            pi = 3.14159;

            A = pi * Math.pow(R, 2.0);

            System.out.printf("A = %.4f%n",A);

            sc.close();
        }
}
