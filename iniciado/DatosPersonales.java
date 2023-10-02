package iniciado;

/*
 * Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
    y apellido, luego guarde su edad e imprimalos por pantalla.
    El mensaje debe tener el siguiente formato:
    “Mi nombre es “ {Nombre}
    “Mi edad es” {Edad}
*/
public class DatosPersonales {
    public static void main(String[] args) {
        String nombreCompleto = "Fernando O. Clemens";
        int edad = 33;
        System.out.println(String.format("Mi nombre es: %s\nMi edad es: %s años", nombreCompleto, edad));
    }
}
