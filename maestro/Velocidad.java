package maestro;

/*
 * Cálculo de la velocidad final:
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
Muestre el resultado por pantalla.
 */

public class Velocidad {
    public static void main(String[] args) {
        double velocidadInicial = 10.5;
        double aceleracion = 4.0;
        double tiempo = 20;
        double velocidadFinal = velocidadInicial + (aceleracion * tiempo);

        System.out.printf("La velocidad final de un objeto con una velocidad inicial de %s m/s, una aceleración de %s m/s, durante %s segundos es igual a %s metros por segundo", velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
