package maestro;
/*
 * Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.
Muestre el resultado por pantalla.
 */
public class MediaAritmetica {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = 5;
        int num4 = 7;
        int num5 = 10;
        int num6 = 3;

        double sumaTotal = num1 + num2 + num3 + num4 + num5 + num6;
        int recuento = 6;
        double media = sumaTotal / recuento;

        System.out.printf("la media aritmetica de %s es %s", sumaTotal, media);
    }
}
