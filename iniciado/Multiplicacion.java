package iniciado;
/*
 * Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
    guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
    memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
    real? ¿Por qué?
    - El resultado es del tipo real porque Java al comparar los tipos (entero y real) en la suma prioriza el tipo double (real)
 */
public class Multiplicacion {
    public static void main(String[] args) {
        double numReal1 = 2.5;
        double numReal2 = 4.3;
        int num1 = 3;
        int num2 = 5;

        var resultadoReales = numReal1 * numReal2;
        var resultadoEnteros = num1 * num2;

        var sumaResultados = resultadoEnteros + resultadoReales;

        System.out.println(sumaResultados);
        //obtenemos el tipo de dato del resultado con el método getClass().getSimpleName()
        System.out.println(((Object)sumaResultados).getClass().getSimpleName());
    }
}
