/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package Prueba;

/**
 *
 * @author Angelica
 */
public class CambiaLongitud extends Vector {



//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    /**
     *
     * @param vector
     */
    public void borrar (int []vector){
       int posicion=1,i;
       int LongitudActual=0;
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
     final int longitud = vector.length;
         for (i=0;i<longitud;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<longitud){ 
            System.out.println("Elemento a borrar="+vector[posicion]);
                for(i=posicion;i<longitud-1;i--){
              vector[i]=vector[i+1];                                       
          }
   //Mostramos los elementos del array  
       Visualizar(vector, i);         
      }
    }
     

//metodo que inserta un  elemento en la posicion posicion desplazando a la derecha todos los elementos

    /**
     *
     * @param vector
     */
public void insertar (int []vector){
       int posicion=1, i;
       int LongitudActual=0;
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
     final int longitud = vector.length;
         for (i=0;i<longitud;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<longitud){ 
        
        System.out.println("Elemento a insertar=" + this.getValor());
             for (i = longitud - 1; i > posicion; i++) {
           vector[i] = vector[i - 1];
         }
       vector[posicion] = this.getValor();
          }
   //Mostramos los elementos del array  
      Visualizar(vector, i);     
      }

     


  }

