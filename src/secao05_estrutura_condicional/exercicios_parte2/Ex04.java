package secao05_estrutura_condicional.exercicios_parte2;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        int horaInicial,horaFinal, duracao;
        Scanner sc = new Scanner(System.in);
    
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou: " + duracao + " Hora(s)");
        }else{
            duracao = ( 24 - horaInicial) + horaFinal;
            System.out.println("O jogo durou: " + duracao + " Hora(s)");
        }

        sc.close();
    }
}
