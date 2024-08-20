package ar.edu.untref.dyasc;

public class Fibonacci {

    public String calcularFibonacci(int iteraciones) {
        int numeroUno = 0;
        int numeroDos = 1;
        int resultado = 0;
        if( iteraciones < 0) {
            throw new Error("No puede realizarse el calulo de un numero menor a 0");
        }
        if( iteraciones == 0) {
            String salida = String.format("fibo<%d>: %d", iteraciones, numeroUno);
            return salida;
        } 
        else {
            try {
                String salida = String.format("fibo<%d>: %d %d", iteraciones, numeroUno, numeroDos);
                for(int i = 2; i < iteraciones; i++) {
                    resultado = numeroUno + numeroDos;
                    numeroUno = numeroDos;
                    numeroDos = resultado;
                    salida += " " + resultado;
                }
                return salida;
            } catch (Exception e) {
                throw new Error("Ocurrio un fallo: " + e);
            }
        }
    }
}
