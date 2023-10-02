package iniciado;

/*
 * Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
    luego haga la potencia de ese número al cuadrado y al cubo.
 */

public class Potencia {
    public static void main(String[] args) {
        int num1 = 2;
        var cuadrado = num1 * num1;
        var cubo = num1 * num1 * num1;

        System.out.println(String.format("El cuadrado del numero es %s", cuadrado));
        System.out.println(String.format("El cubo del numero es %s", cubo));
    }
}
