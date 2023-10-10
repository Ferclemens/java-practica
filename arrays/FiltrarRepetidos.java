package arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 * Escribe un programa que tome un arreglo de enteros y cree un arreglo con elementos únicos.

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
 */
public class FiltrarRepetidos {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 1, 2, 2, 3, 4, 5};
        int longitud = myArray.length;

        //comprobamos si el array es vacio o no tiene elementos para comparar (1 solo elemento)
        if(longitud <= 1){
            System.out.println("el array es de longitud menor o igual a 1.");
        }
        int[] newArray = new int[longitud];
        int unicos = 0;
        for(int i = 0; i < longitud; i++){
            for(int j = 1; j < longitud; j++){
                if(myArray[i] != myArray[j]){
                    newArray[i] = myArray[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
