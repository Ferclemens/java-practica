package maestro;
/*
 * Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla.
 */
public class EnergiaCinetica {
    public static void main(String[] args) {
       double masa = 60;
       double velocidad = 40.0; //km por hora
       double energia = (masa * Math.pow(velocidad, 2)) / 2;
        
       System.out.printf("la energia cinética de un cuerpo con %s kg de masa equivale a %s julios", masa, energia);
    }
}
