package ar.edu.untref.dyasc;

import java.io.FileWriter;
import java.io.IOException;

public class OpcionesFibo {
    private boolean inverso = false;
    private boolean vertical = false;
    private String modo = "l";
    private boolean escribir = false;
    private String nombreArchivo = "";

    //Hace la impresion en consola o archivo dependiendo del valor que toma el atributo escribir
    private void modificarSecuencia(int[] fibo) {
        ImprimirFibo imprimir = new ImprimirFibo();
        if (escribir) {
            try (FileWriter writer = new FileWriter(nombreArchivo)) {
                imprimir.imprimirFiboEnArchivo(fibo, this.vertical, this.inverso, writer, modo);
                System.out.println("fibo<" + fibo.length +">: guardado en " + nombreArchivo);
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            imprimir.imprimirFibo(fibo, this.vertical, this.inverso, modo);
        }
    }

    //Comprueba el uso de los distintos parametros recibidos por consola como lo son -o, -f, -m
    public void OpcionesFibonacci(String[] argumentos, int[] fibo) {
        for (String argumento : argumentos) {
            if (argumento.startsWith("-o=")) {
                String opcion = argumento.substring(3);
                String orientacion = String.valueOf(opcion.charAt(0));
                String direccion = String.valueOf(opcion.charAt(1));
                comprobarParametrosDireccion(orientacion, direccion);
            }
            if (argumento.startsWith("-m=")) {
                this.modo = argumento.substring(3);
            }
            if (argumento.startsWith("-f=")) {
                this.escribir = true;
                this.nombreArchivo = argumento.substring(3);
            }
        }
        modificarSecuencia(fibo);
    }

    //Valida que los parametros orientacion y direccion recibidos por consola 
    private void comprobarParametrosDireccion(String orientacion, String direccion) {
            validarDireccion(direccion);
            validarOrientacion(orientacion);
            /*En caso de que no haya ninguna de las opciones correspondientes lanza un error.*/
            if (!(this.inverso || this.vertical || direccion.contains("d") || orientacion.contains("h"))) {
                throw new Error("Opciones no validas.");
            }
    }
    
    //Si el valor de la direccion es i modifica el valor booleano del atributo invervo
    private void validarDireccion(String direccion){
        if (direccion.contains("i") ) {    
            this.inverso = true;
        }
    }

    //Si el valor de la orientacion es v modifica el valor booleano del atributo vertical
    private void validarOrientacion(String orientacion){
        if (orientacion.contains("v") ) {    
            this.vertical = true;
        }
    }

    //Valido si el parametro es un valor numerico
    public boolean validarNumero(String argumento) {
        try {
            Integer.valueOf(argumento);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
