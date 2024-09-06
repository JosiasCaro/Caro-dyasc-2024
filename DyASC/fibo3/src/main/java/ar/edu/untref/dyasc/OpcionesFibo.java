package ar.edu.untref.dyasc;

import java.io.FileWriter;
import java.io.IOException;

public class OpcionesFibo {
    private boolean inverso = false;
    private boolean vertical = false;
    private String modo = "l";
    private boolean salida = false;
    private String salidaNombre = "";

    private void modificarSecuencia(int[] fibo) {
        ImprimirFibo imprimir = new ImprimirFibo();
        if (salida) {
            try (FileWriter writer = new FileWriter(salidaNombre)) {
                imprimir.imprimirFiboEnArchivo(fibo, this.vertical, this.inverso, writer, modo);
                System.out.println("fibo<" + fibo.length +">: guardado en " + salidaNombre);
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            imprimir.imprimirFibo(fibo, this.vertical, this.inverso, modo);
        }
    }

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
                this.salida = true;
                this.salidaNombre = argumento.substring(3);
            }
        }
        modificarSecuencia(fibo);
    }

    private void comprobarParametrosDireccion(String orientacion, String direccion) {
            validarDireccion(direccion);
            validarOrientacion(orientacion);
            /*En caso de que no haya ninguna de las opciones correspondientes lanza un error.*/
            if (!(this.inverso || this.vertical || direccion.contains("d") || orientacion.contains("h"))) {
                throw new Error("Opciones no validas.");
            }
    }
    
    private void validarDireccion(String direccion){
        if (direccion.contains("i") ) {    
            this.inverso = true;
        }
    }

    
    private void validarOrientacion(String orientacion){
        if (orientacion.contains("v") ) {    
            this.vertical = true;
        }
    }

    /*Compruebo si estoy en un argumento numerico.*/
    public boolean esUnNumero(String argumento) {
        try {
            Integer.valueOf(argumento);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
