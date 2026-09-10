package secao08_introducao_poo.exercicios_fixacao.exercicio_02.application;

import java.util.Locale;
import java.util.Scanner;

import secao08_introducao_poo.exercicios_fixacao.exercicio_02.entities.Employee;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp =  new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp.toString());
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: "+ emp.toString());

        sc.close();
    }
}
