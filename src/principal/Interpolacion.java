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
    public static int interpolationSearch(int[] integers, int elementToSearch) {
    int startIndex = 0;
    int lastIndex = (integers.length - 1);
    while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
           (elementToSearch <= integers[lastIndex])) {
        // using interpolation formulae to find the best probable position for this element to exist
        int pos = startIndex + (((lastIndex-startIndex) /
          (integers[lastIndex]-integers[startIndex]))*
                        (elementToSearch - integers[startIndex]));
        if (integers[pos] == elementToSearch)
            return pos;
        if (integers[pos] < elementToSearch)
            startIndex = pos + 1;
        else
            lastIndex = pos - 1;
    }
    return -1;
}

    static int Busqueda(int[] vector, int dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
