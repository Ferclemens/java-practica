package arrays;

import java.util.Arrays;

/*
 Escribe un programa que tome un array y cree otro array que contenga solo los elementos del medio, es decir, eliminando el primer y último elemento.


        myArray = [1, 2, 3, 4]
        middle(myArray)  # [2,3]
 */
public class RecortarExtremos {
    public static void main(String[] args) {
        int[] myArray = {1, 345, 2, 2, 3, 4, 5, 6, 7, 8, 9, 54, 29, 1};
        //si el array es nulo o de una dimension menor a 2 elementos, no itera y crea un array por defecto. (evitar error) 
        if(myArray == null || myArray.length <= 2){
            int res[] = new int[1];
            System.out.println("el arreglo es nulo o menor o igual a 2 elementos");
        } else {
            int res[] = new int[myArray.length-2];

            final int PRIMERA_POSICION = 0;
            final int ULTIMA_POSICION = myArray.length -1;

            //iteramos el array saltando el primer elemento (posicion 0) y el ultimo elemento (posicion array.length -1)
            for(int i = 0; i < myArray.length; i++){
                if(i != PRIMERA_POSICION && i != ULTIMA_POSICION) {
                    res[i-1] = myArray[i];
                }
            }
            for(int i = 0; i < res.length; i++){
                System.out.printf("posición %s = %s\n", i, res[i]);
            }
            System.out.println("Array completo: " + Arrays.toString(res));

        }
    }
}