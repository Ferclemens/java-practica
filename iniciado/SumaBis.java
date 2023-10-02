package iniciado;

/*
 * Suma de dos números bis: Se les solicita que guarden dos números enteros y los
    sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
    indique si se trata de un número par o impar.
    El mensaje debe tener el siguiente formato:
    “El resultado es “ {Resultado} “y es” {paridad} 
 */

public class SumaBis {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 11;
        int resultadoSuma = num1 + num2;

        if(resultadoSuma % 2 == 0){
            System.out.println("El resultado es " + resultadoSuma + " y es par");
        } else {
            System.out.println("El resultado es " + resultadoSuma + " y es impar");
        }
    }
}
