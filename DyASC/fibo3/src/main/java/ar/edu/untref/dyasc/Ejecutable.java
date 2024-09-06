package ar.edu.untref.dyasc;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        OpcionesFibo opciones = new OpcionesFibo();
        Fibonacci fibo = new Fibonacci();
        int n;
        int[] secuencia;

        if (args.length > 1 && opciones.esUnNumero(args[1])) {
            n = Integer.parseInt(args[1]);
        } else if (args.length > 1 && opciones.esUnNumero(args[2])){
            n = Integer.parseInt(args[2]);
        } else {
            n = Integer.parseInt(args[3]);
        }
        secuencia = fibo.calcularFibonacci(n);
        opciones.OpcionesFibonacci(args, secuencia);
    }
    
}
