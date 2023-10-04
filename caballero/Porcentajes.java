package caballero;

/*
 * Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número.
 */

public class Porcentajes {
    public static void main(String[] args) {
        int num1 = 200;
        double num2 = 20.0;

        double porcentaje = (num2 * 100)/ num1;
        System.out.println(String.format("%s es el %s porciento de %s", num2, porcentaje, num1));
    }
}
