package padawan;
/*
 * Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode?
No puedo usar "" en el char porque las dobre comillas son reservadas para cadenas de strings en Java, para un solo
caracter (char) se usan comillas simples ('')
Unicode es un sistema de codificación de caracteres de texto en forma de números, aceptado mundialmente.
 */
public class Caracteres {
    public static void main(String[] args) {
        String letra1 = "\u0046";
        String letra2 = "\u0045";
        String letra3 = "\u0052";
        System.out.println(letra1+letra2+letra3);
        
    }
}
