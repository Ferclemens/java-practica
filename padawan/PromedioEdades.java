package padawan;
/*
 * Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
 */
public class PromedioEdades {
    public static void main(String[] args) {
        int edad1 = 20;
        String nombre1 = "Juliana";
        int edad2 = 33;
        String nombre2 = "Ruben";
        double promedio = (edad1 + edad2) / 2;
        System.out.println(String.format("%s tiene %s\n%s tiene %s\nEl promedio de sus edades es %s", nombre1, edad1, nombre2, edad2,promedio));
    }
}
