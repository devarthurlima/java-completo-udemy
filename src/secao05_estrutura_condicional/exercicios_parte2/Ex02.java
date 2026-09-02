package secao05_estrutura_condicional.exercicios_parte2;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if (x % 2 == 0 ) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

        sc.close();
    }
}
