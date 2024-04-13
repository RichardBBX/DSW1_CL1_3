package pe.edu.cibertec.appventascibertec.controller;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular el factorial del número
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Mostrar el factorial del número
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
