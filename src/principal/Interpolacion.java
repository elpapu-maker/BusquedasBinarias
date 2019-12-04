/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Development
 */
public class Interpolacion {
    public static int BusquedaInterpolacion(int[] numeroEntero, int ElementoBuscado) {
    int Primero = 0;
    int ultimo = (numeroEntero.length - 1);
    while ((Primero <= ultimo) && (ElementoBuscado >= numeroEntero[Primero]) &&
           (ElementoBuscado <= numeroEntero[ultimo])) {
        // using interpolation formulae to find the best probable position for this element to exist
        int n = Primero + (((ultimo-Primero) /
          (numeroEntero[ultimo]-numeroEntero[Primero]))*
                        (ElementoBuscado - numeroEntero[Primero]));
        if (numeroEntero[n] == ElementoBuscado)
            return n;
        if (numeroEntero[n] < ElementoBuscado)
            Primero = n + 1;
        else
            ultimo = n - 1;
    }
    return -1;
}

}
