/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author CT7-PC26
 */
public class BusquedaLineal {
public  static int busquedaSecuencial(int []arreglo,int dato){
  int posicion = -1;
   for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
    posicion = i;//Si es verdadero guardamos la posicion
    break;//Para el ciclo
   }
  }
  return posicion;  
 }
}