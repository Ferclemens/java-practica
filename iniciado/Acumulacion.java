package iniciado;

/*
 * Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
    de quince multiplicaciones entre dos números enteros divididos por el número de la
    multiplicación. Por ejemplo:
    Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
    El resultado mostrarlo por pantalla.
 */

public class Acumulacion {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        double acumulacion = 0;

        acumulacion = (num1 * num2/1) + (num1 * num2/2) + (num1 * num2/3) + (num1 * num2/4) + (num1 * num2/5) + (num1 * num2/6) + (num1 * num2/7) + (num1 * num2/8) + (num1 * num2/9) + (num1 * num2/10) + (num1 * num2/11) + (num1 * num2/12) + (num1 * num2/13) + (num1 * num2/14) + (num1 * num2/15);

        System.out.println("El resultado es: " + acumulacion);
    }
}
