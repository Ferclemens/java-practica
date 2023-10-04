package caballero;
/*
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.
 */
public class ArbolitoLibras {
    public static void main(String[] args) {
        double tasa = 1.40;
        int libras = 100;
        double equivalente = libras * tasa;
        System.out.println(String.format("%s libras esterlinas equivale a %s dolares a una tasa de cambio de %s libras por dolar", libras, equivalente, tasa));
    }
}
