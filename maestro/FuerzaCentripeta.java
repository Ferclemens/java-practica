package maestro;
/*
 * Cálculo de la fuerza centrípeta:
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
de la trayectoria.
Muestre el resultado por pantalla.
 */
public class FuerzaCentripeta {
    public static void main(String[] args) {
        double masa = 200.0;
        double velocidad = 10.5;
        double radio = 2.0;
        double fuerzaCentripeta = (masa * Math.pow(velocidad, 2)) / radio;
        
        System.out.printf("La fuerza centrípeta de un objeto de %s gramos de masa, una velocidad angular de %s metros por segundo y una trayectoria de %s metros (radio), es de %s julios.", masa, velocidad, radio, fuerzaCentripeta);
    }
}
