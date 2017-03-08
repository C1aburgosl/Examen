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
public class Vector {
     private int valor;   
      
    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void Visualizar(int []vector,int i){
         System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");   
      }
}
