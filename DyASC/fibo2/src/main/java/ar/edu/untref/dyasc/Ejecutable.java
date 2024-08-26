package ar.edu.untref.dyasc;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        if (args.length > 0 && args[0].startsWith("-o=")) {
            String option = args[0].substring(3);
            if (option.length() != 2) {
                System.out.println("Opciones no validas.");
                return;
            }
            char orientation = option.charAt(0);
            char direction = option.charAt(1);
            if (!("hv".contains("" + orientation)) || !("di".contains("" + direction))) {
                System.out.println("Opciones no validas.");
                return;
            }
            boolean vertical = option.charAt(0) == 'v';
            boolean inverso = option.charAt(1) == 'i';
            int n = Integer.parseInt(args[1]);
            fibo.calcularFibonacci(n, vertical, inverso);
        } else {
            int n = Integer.parseInt(args[0]);
            fibo.calcularFibonacci(n, false, false);
        }
    }
}
