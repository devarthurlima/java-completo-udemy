package secao05_estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        float x,y;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else {
            System.out.println("Q4");
        }
        sc.close();
    }


}
