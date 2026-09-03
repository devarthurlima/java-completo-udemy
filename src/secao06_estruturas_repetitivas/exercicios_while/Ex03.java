package secao06_estruturas_repetitivas.exercicios_while;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool, gasolina, diesel, tipo;

        alcool = 0; /* = 1 */
        gasolina = 0; /* = 2 */ 
        diesel = 0; /* = 3 */

        tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if(tipo == 2){
                gasolina = gasolina + 1;
            }
            else if(tipo == 3){
                diesel = diesel + 1;
            }
            tipo = sc.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    
        sc.close();
    }
}
