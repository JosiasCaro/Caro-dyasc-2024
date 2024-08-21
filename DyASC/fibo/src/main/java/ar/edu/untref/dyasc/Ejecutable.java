package ar.edu.untref.dyasc;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de iteraciones para la secuencia de Fibonacci: ");
        try {
            int iteraciones = scanner.nextInt();

            Fibonacci fibonacci = new Fibonacci();
            String resultado = fibonacci.calcularFibonacci(iteraciones);
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número válido.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
