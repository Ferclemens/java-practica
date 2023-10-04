package caballero;
/*
 * Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
 */
public class ArbolitoDigital {
    public static void main(String[] args) {
        double tasa = 25000.0;
        double bitcoin = 1.2;
        double equivalente = bitcoin * tasa;
        System.out.println(String.format("%s bitcoins equivalen a %s dolares a una tasa de cambio de %s dolares por bitcoin", bitcoin, equivalente, tasa));
    }
}
