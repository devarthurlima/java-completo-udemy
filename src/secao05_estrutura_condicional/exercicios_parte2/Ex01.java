package secao05_estrutura_condicional.exercicios_parte2;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
      int x;
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
      
      if (x < 0) {
        System.out.println("Negativo");
      } else{
        System.out.println("Não Negativo");
      }
      

      sc.close();
    }
}
