package maestro;
/*
 * Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve.
 */
public class ConvertorGrados {
    public static void main(String[] args) {
        double celsius = 23.8;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%s grados Celsius equivale a %s grados Fahrenheit.", celsius, fahrenheit);
    }
}
