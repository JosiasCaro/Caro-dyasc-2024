package ar.edu.untref.dyasc;

public class Ejecutable {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, proporcione exactamente un argumento: el número de iteraciones.");
            return;
        }
        try {
            int iteraciones = Integer.parseInt(args[0]);
            Fibonacci fibonacci = new Fibonacci();
            String resultado = fibonacci.calcularFibonacci(iteraciones);
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            System.out.println("El argumento proporcionado no es un número válido.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
