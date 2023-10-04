package caballero;
/*
 * Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
 */
public class ArbolitoEuro {
    public static void main(String[] args) {
        double tasa = 1.20;
        int dolares = 100;
        double equivalente = dolares * tasa;
        System.out.println(String.format("%s euros equivale a %s dolares a una tasa de cambio de %s por dolar", dolares, equivalente, tasa));
    }
}
