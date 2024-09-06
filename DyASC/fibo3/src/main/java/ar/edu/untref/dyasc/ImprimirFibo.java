package ar.edu.untref.dyasc;

import java.io.FileWriter;
import java.io.IOException;

public class ImprimirFibo {

    private boolean primera = true;

    //Imprime la serie de fibonacci como Sumatoria o como Lista
    public void imprimirFibo(int[] fib, boolean vertical, boolean inverso, String modo) {
        if (modo.equals("s")) {
            imprimirSumatoria(fib, vertical);
        } else {
            impprimirLista(fib, inverso, vertical);
        }
    }

    //Imprime la serie de fibonacci en la consola en forma de serie
    private void impprimirLista(int[] fib, boolean inverso, boolean vertical) {
        System.out.print("fibo<" + fib.length + ">: ");
        if (inverso) {
            imprimirInverso(fib, vertical);
        } else {
            imprimirDirecto(fib, vertical);
        }
    }

    //Imprime la serie de fibonacci sobre un archivo como Sumatoria o como Lista
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

    //Imprime la sumatoria sobre el archivo y si es vertical coloca la suma por debajo de fibo<n>
    private void imprimirSumatoriaEnArchivo(int[] fib, boolean vertical, FileWriter writer) throws IOException {
        int sumatoria = sumatoria(fib);
        if(vertical) {
            writer.write("fibo<" + fib.length + ">s: \n" + sumatoria + "\n");
        } else {
            writer.write("fibo<" + fib.length + ">s: " + sumatoria + "\n");
        }
    }

    //Imprime la sumatoria en consola y si es vertical coloca la suma por debajo de fibo<n>
    private void imprimirSumatoria(int[] fib, boolean vertical) {
        int sumatoria = sumatoria(fib);
        if(vertical) {
            System.out.println("fibo<" + fib.length + ">s: \n" + sumatoria);
        } else {
            System.out.println("fibo<" + fib.length + ">s: " + sumatoria);
        }
    }

    //Realiza la sumatoria de los elementos de la lista fib
    private int sumatoria(int[] fib) {
        int sumatoria = 0;
        for (int num : fib) {
            sumatoria += num;
        }
        return sumatoria;
    }

    // Imprime la lista fib desde el fib.lenght hasta el primero
    private void imprimirInverso(int[] fib, boolean vertical) {
            for (int i = fib.length - 1; i >= 0; i--) {
                imprimirConDireccion(fib[i], vertical);
            }
    } 

    // Imprime la lista fib desde el primero hasta fib.lenght 
    private void imprimirDirecto(int[] fib, boolean vertical) {
        // Comienza mostrando el primer numero guardado en el array 
        for (int i = 0; i < fib.length; i++) {
            imprimirConDireccion(fib[i], vertical);
        }
    } 

    //Imprime el numero de manera vertical u horizontal dependiendo del valor booleano de vertical
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

    //Imprime el numero de manera vertical
    private void imprimirVertical(int numero) {
        if(primera) {
            System.out.println();
            primera = false;
        } 
        System.out.println(numero);
    }

    //Imprime el numero de manera horizontal
    private void imprimirHorizontal(int numero) {
        System.out.print(numero + " ");
    }

    //Imprime la serie de fibonacci sobre un archivo de forma inversa
    private void imprimirInversoEnArchivo(int[] fib, boolean vertical, FileWriter writer) throws IOException {
        for (int i = fib.length - 1; i >= 0; i--) {
            imprimirConDireccionEnArchivo(fib[i], vertical, writer);
        }
    }

    //Imprime la serie de fibonacci sobre un archivo
    private void imprimirDirectoEnArchivo(int[] fib, boolean vertical, FileWriter writer) throws IOException {
        for (int i = 0; i < fib.length; i++) {
            imprimirConDireccionEnArchivo(fib[i], vertical, writer);
        }
    }

    //Imprime la serie de fibonacci sobre un archivo de forma vertical u horizontal
    private void imprimirConDireccionEnArchivo(int numero, boolean vertical, FileWriter writer) throws IOException {
        if (vertical) {
            //Si la secuencia es vertical agrega un salto de linea en primera instacia
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
