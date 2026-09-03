package secao06_estruturas_repetitivas.exercicios_while;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha, tentativa;

        senha = 2002;

        tentativa = sc.nextInt();

        while (tentativa != senha) {
            System.out.println("Senha Inválida");
            tentativa = sc.nextInt();
        }

        System.out.println("Senha Válida");

        sc.close();
    }

}
