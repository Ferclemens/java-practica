package iniciado;
/*
 * Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
    sumen, determine si el primer número es divisible por el segundo número y muestre
    el resultado.
 */

public class Divisibilidad {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int suma = num1 + num2;

        if(num1 % num2 == 0){
            System.out.println("Resultado: "+ suma +" | "+ num1 + " y "+ num2 + " son divisibles");
        } else {
            System.out.println("Resultado: "+ suma +" | "+ num1 + " y "+ num2 + " NO son divisibles");
        }
    }
}
