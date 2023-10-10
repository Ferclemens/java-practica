package arrays;
/*
 * Dado un array en 2D calcula la suma de los elementos en diagonal

        myArray2D= { 
{1,2,3},
{4,5,6},
{7,8,9} 
     };


 */
public class SumaDiagonal {
    public static void main(String[] args) {
        int myArray2D[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int suma = 0;
        //iteramos el array y sumamos solo los elementos que coincidan su posición i == j (diagonal)
        for(int i = 0; i < myArray2D.length; i++){
            for(int j = 0; j < myArray2D.length; j++){
                if(i == j){
                    suma += myArray2D[i][j];
                }
            }
        }
        System.out.println("la suma de las diagonales es: " + suma);
    }
}
