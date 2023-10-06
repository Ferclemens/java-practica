package maestro;
/*
 * Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
 */
public class Hipotenusa {
    public static void main(String[] args) {
        double cateto1 = 6.0;
        double cateto2 = 8.0;
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("la hipotenusa de un triángulo cuyos catetos tiene un valor de %s y %s cm respectivamente equivale a %s cm", cateto1, cateto2, hipotenusa);
    }
}
