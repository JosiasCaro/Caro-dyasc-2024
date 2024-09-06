package ar.edu.untref.dyasc;

import java.io.FileWriter;
import java.io.IOException;

public class ImprimirFibo {

    private boolean primera = true;

    public void imprimirFibo(int[] fib, boolean vertical, boolean inverso, String modo) {
        if (modo.equals("s")) {
            imprimirSumatoria(fib, vertical);
        } else {
            impprimirLista(fib, inverso, vertical);
        }
    }

    private void impprimirLista(int[] fib, boolean inverso, boolean vertical) {
        System.out.print("fibo<" + fib.length + ">: ");
        if (inverso) {
            imprimirInverso(fib, vertical);
        } else {
            imprimirDirecto(fib, vertical);
        }
    }

    public void imprimirFiboEnArchivo(int[] fib, boolean vertical, boolean inverso, FileWriter writer, String modo) throws IOException {
        if (modo.equals("s")) {
            imprimirSumatoriaEnArchivo(fib, vertical, writer);
        } else {
            writer.write("fibo<" + fib.length + ">: ");
            if (inverso) {
                imprimirInversoEnArchivo(fib, vertical, writer);
            } else {
                imprimirDirectoEnArchivo(fib, vertical, writer);
            }
        }
    }

    private void imprimirSumatoriaEnArchivo(int[] fib, boolean vertical, FileWriter writer) throws IOException {
        int sumatoria = sumatoria(fib);
        if(vertical) {
            writer.write("fibo<" + fib.length + ">s: \n" + sumatoria + "\n");
        } else {
            writer.write("fibo<" + fib.length + ">s: " + sumatoria + "\n");
        }
    }

    private void imprimirSumatoria(int[] fib, boolean vertical) {
        int sumatoria = sumatoria(fib);
        if(vertical) {
            System.out.println("fibo<" + fib.length + ">s: \n" + sumatoria);
        } else {
            System.out.println("fibo<" + fib.length + ">s: " + sumatoria);
        }
    }

    private int sumatoria(int[] fib) {
        int sumatoria = 0;
        for (int num : fib) {
            sumatoria += num;
        }
        return sumatoria;
    }

    private void imprimirInverso(int[] fib, boolean vertical) {
            for (int i = fib.length - 1; i >= 0; i--) {
                imprimirConDireccion(fib[i], vertical);
            }
    } 

    private void imprimirDirecto(int[] fib, boolean vertical) {
        // Comienza mostrando el primer numero guardado en el array 
        for (int i = 0; i < fib.length; i++) {
            imprimirConDireccion(fib[i], vertical);
        }
    } 

    private void imprimirConDireccion(int numero, boolean vertical) {
        // Si la impresion es vertical imprime el numero y deja un salto de linea
        if (vertical) {
            imprimirVertical(numero);
        } 
        // En caso contrario imprime el numero y deja un salto de espacio entre el siguiente numero
        else {
            imprimirHorizontal(numero);
        }
    }


    private void imprimirVertical(int numero) {
        if(primera) {
            System.out.println();
            primera = false;
        } 
        System.out.println(numero);
    }

    private void imprimirHorizontal(int numero) {
        System.out.print(numero + " ");
    }

    private void imprimirInversoEnArchivo(int[] fib, boolean vertical, FileWriter writer) throws IOException {
        for (int i = fib.length - 1; i >= 0; i--) {
            imprimirConDireccionEnArchivo(fib[i], vertical, writer);
        }
    }

    private void imprimirDirectoEnArchivo(int[] fib, boolean vertical, FileWriter writer) throws IOException {
        for (int i = 0; i < fib.length; i++) {
            imprimirConDireccionEnArchivo(fib[i], vertical, writer);
        }
    }

    private void imprimirConDireccionEnArchivo(int numero, boolean vertical, FileWriter writer) throws IOException {
        if (vertical) {
            if(primera) {
                writer.write("\n");
                primera = false;
            }
            writer.write(numero + "\n");
        } else {
            writer.write(numero + " ");
        }
    }

}
