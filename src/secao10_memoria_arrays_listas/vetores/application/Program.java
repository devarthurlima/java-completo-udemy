package secao10_memoria_arrays_listas.vetores.application;

import java.util.Locale;
import java.util.Scanner;

import secao10_memoria_arrays_listas.vetores.entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Product[] vect = new Product[n];
        for (int i = 0; i < vect.length; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sc.nextLine();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}
