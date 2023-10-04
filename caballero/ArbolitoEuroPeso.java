package caballero;
/*
 * Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
 */
public class ArbolitoEuroPeso {
    public static void main(String[] args) {
        double tasa = 0.027;
        int pesos = 100;
        double equivalente = pesos * tasa;
        System.out.println(String.format("%s pesos equivale a %s euros a una tasa de cambio de %s pesos por euro", pesos, equivalente, tasa));
    }
}
