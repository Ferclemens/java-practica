package iniciado;

/*
 *  Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
    y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
    -   No se puede usar "" en el char porque estan reservadas para cadenas de texto.
        En caso de caracteres individuales se utiliza comillas simples '' 
 */

public class Caracteres {
    public static void main(String[] args) {
        char ch1 = 'F';
        char ch2 = 'e';
        char ch3 = 'r';

        System.out.println(""+ch1+ch2+ch3);
    }
}
