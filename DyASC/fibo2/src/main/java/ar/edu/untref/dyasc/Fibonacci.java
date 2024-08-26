package ar.edu.untref.dyasc;

public class Fibonacci {

    public void calcularFibonacci(int iteraciones, boolean vertical, boolean inverso) {
        if( iteraciones < 0) {
            throw new Error("No puede realizarse el calulo de un numero menor a 0");
        }
        else {
            try {
                // Se crea una lista con la longitud que especifico en iteraciones
                int[] fib = new int[iteraciones];

                //Si iteraciones es mayor a 0 agrega en la posicion fib[0] en numero 0
                if (iteraciones > 0) fib[0] = 0;
                //Si iteraciones es mayor a 1 agrega en la posicion fib[1] en numero 1
                if (iteraciones > 1) fib[1] = 1;
        
                //Calcula la secuencia de fibonacci de longitud igual a iteraciones 
                for (int i = 2; i < iteraciones; i++) {
                    fib[i] = fib[i - 1] + fib[i - 2];
                }
                
                // Si se pide que la secuencia se imprima de manera inversa
                if (inverso) {
                    // imprime fib<Iteraciones>
                    System.out.print("fibo<" + iteraciones + ">: ");

                    // Comienza mostrando el ultimo numero guardado en el array 
                    for (int i = iteraciones - 1; i >= 0; i--) {
                        
                        // Si la impresion es vertical imprime el numero y deja un salto de linea
                        if (vertical) {
                            System.out.println(fib[i]);
                        } 
                        // En caso contrario imprime el numero y deja un salto de espacio entre el siguiente numero
                        else {
                            System.out.print(fib[i] + " ");
                        }
                    }
                } 
                // Si la impresion no es inversa imprime fib<Iteraciones>
                else {
                    System.out.print("fibo<" + iteraciones + ">: ");
                    // Comienza mostrando el primer numero guardado en el array 
                    for (int i = 0; i < iteraciones; i++) {
                        // Si la impresion es vertical imprime el numero y deja un salto de linea
                        if (vertical) {
                            System.out.println(fib[i]);
                        } 
                        // En caso contrario imprime el numero y deja un salto de espacio entre el siguiente numero
                        else {
                            System.out.print(fib[i] + " ");
                        }
                    }
                }
                
                if (!vertical && !inverso) {
                    System.out.println();
                }

            } catch (Exception e) {
                throw new Error("Ocurrio un fallo: " + e);
            }
        }
    }
}
