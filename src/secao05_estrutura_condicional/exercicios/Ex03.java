package secao05_estrutura_condicional.exercicios;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        int A,B;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Múltiplos");
        }else{
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }
}
