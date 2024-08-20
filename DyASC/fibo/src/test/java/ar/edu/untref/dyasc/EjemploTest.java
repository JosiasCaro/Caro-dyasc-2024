package ar.edu.untref.dyasc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EjemploTest {

    @Test
    public void calcularaFibonacciParaOchoNumeros() {
        Fibonacci fibonacci = new Fibonacci();
        String resultadoEsperado = "fibo<8>: 0 1 1 2 3 5 8 13";

        String resultado = fibonacci.calcularFibonacci(8);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void calcularaFibonacciParaCincoNumeros() {
        Fibonacci fibonacci = new Fibonacci();
        String resultadoEsperado = "fibo<5>: 0 1 1 2 3";

        String resultado = fibonacci.calcularFibonacci(5);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void calcularaFibonacciParaCero() {
        Fibonacci fibonacci = new Fibonacci();
        String resultadoEsperado = "fibo<0>: 0";

        String resultado = fibonacci.calcularFibonacci(0);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void calcularaFibonacciParaUno() {
        Fibonacci fibonacci = new Fibonacci();
        String resultadoEsperado = "fibo<1>: 0 1";

        String resultado = fibonacci.calcularFibonacci(1);

        assertEquals(resultadoEsperado, resultado);
    }

}
