/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author alumno
 */
public class NoCambiaLongitud extends Vector{
   

    //metodo que modifica el contenido de la posicion posicion de un array con el valor pasado
    public void modificar(int[] vector, CambiaLongitud cambiaLongitud) {
        int i;
        int posicion = 1;
        int LongitudActual = 0;
        //Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        //Modificamos el array
        if (posicion < longitud) {
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = cambiaLongitud.getValor();
        }
        //Mostramos los elementos del array
        cambiaLongitud.Visualizar(vector, i);
    }
}
