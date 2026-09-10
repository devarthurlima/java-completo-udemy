package secao04_estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int number, horasTrab;
        double salary, salaryHora; 

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        horasTrab = sc.nextInt();
        salaryHora = sc.nextDouble();

        salary = horasTrab * salaryHora;

        System.out.println("Number = " + number);
        System.out.printf("Salary = U$ %.2f%n",salary);

        sc.close();
    }
}
