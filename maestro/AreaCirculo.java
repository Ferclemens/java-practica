package maestro;
/*
 * Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.
area = pi * r2
*/
public class AreaCirculo{
    public static void main(String[] args) {
        double pi = 3.14;
        double radio = 40000.0;

        double area = pi * (radio * radio);
        System.out.printf("El area de un circulo de %s cm de radio es %s cm", radio, area);
    }
}