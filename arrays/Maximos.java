package arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 * Dado un array, escribe un programa que tome el primer y el segundo mejor valor y lo devuelva en un nuevo arreglo.

      myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
     firstSecond(myArray) // {90, 87}

 */
public class Maximos {
    public static void main(String[] args) {
        Integer[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        //ordenamos el array con los metodos sort() de java.util y reverseOrder() de util.Collections
        Arrays.sort(myArray, Collections.reverseOrder());
        
        int[] mayores = {myArray[0], myArray[1]};
        System.out.println("nuevo arreglo de los 2 mayores = " + Arrays.toString(mayores));
    }
}
