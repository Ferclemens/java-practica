package padawan;

/*
 * Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla
 */
public class ConversorKg {
    public static void main(String[] args) {
        double pesoEnLibras = 132.27;
        
        //constante: 1 libra = 1 kg
        double constante = 0.453592;

        double pesoEnKg = pesoEnLibras * constante;
        System.out.println("su peso en kgs es: " + pesoEnKg);
    }
}
