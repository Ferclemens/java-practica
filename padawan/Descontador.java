package padawan;
/*
 * Descontador: Se le solicita que guarde un número en un espacio de memoria y
discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
usar para hacerlo?
 */
public class Descontador {
    public static void main(String[] args) {
        int contador = 0;
        int limite = 20;
        int iteraciones = 0;
        //decrementamos en 1 con -- en num e iteraciones
        for(int num = 21;iteraciones <= limite; num--){
            iteraciones++;
            contador = num;
            System.out.println(contador);
        }
    }
}
