package caballero;
/*
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */
public class ArbolitoDolar {
    public static void main(String[] args) {
        double tasa = 850.0;
        int dolares = 100;
        double equivalente = dolares * tasa;
        System.out.println(String.format("%s USD equivale a %s $ARG a una tasa de cambio de %s por dolar t.t", dolares, equivalente, tasa));
    }
}
