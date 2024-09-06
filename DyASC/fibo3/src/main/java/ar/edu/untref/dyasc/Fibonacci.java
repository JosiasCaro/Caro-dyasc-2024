package ar.edu.untref.dyasc;

public class Fibonacci {

    private int[] fib;

    public int[] calcularFibonacci(int iteraciones) {
        if( iteraciones < 0) {
            throw new Error("No puede realizarse el calulo de un numero menor a 0");
        }
        else {
                // Se crea una lista con la longitud que especifico en iteraciones
                this.fib = new int[iteraciones];
                //Si iteraciones es mayor a 0 agrega en la posicion fib[0] en numero 0
                if (iteraciones > 0) this.fib[0] = 0;
                //Si iteraciones es mayor a 1 agrega en la posicion fib[1] en numero 1
                if (iteraciones > 1) this.fib[1] = 1;
                //Calcula la secuencia de fibonacci de longitud igual a iteraciones 
                for (int i = 2; i < iteraciones; i++) {
                    this.fib[i] = this.fib[i - 1] + this.fib[i - 2];
                }
                return this.fib;
        }
    }
}
