import java.util.Scanner;

/**
 * Esta clase proporciona métodos para realizar operaciones matemáticas simples utilizando la clase Math de Java.
 */
public class miniCalculadoraEjemplo {

    /**
     * Calcula el valor absoluto de un número de tipo double.
     *
     * @param numero El número del cual se calculará el valor absoluto.
     * @return El valor absoluto del número proporcionado.
     */
    public static double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    /**
     * Calcula el cuadrado de un número de tipo double.
     *
     * @param numero El número del cual se calculará el cuadrado.
     * @return El cuadrado del número proporcionado.
     */
    public static double raizCuadrada(double numero) {
        return Math.pow(numero, 2);
    }

    /**
     * Método principal para solicitar un número al usuario y realizar operaciones.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Calcular valor absoluto");
        System.out.println("2. Calcular cuadrado");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                double valorAbsoluto = valorAbsoluto(numero);
                System.out.println("Valor absoluto de " + numero + " es " + valorAbsoluto);
                break;
            case 2:
                double cuadrado = raizCuadrada(numero);
                System.out.println("El cuadrado de " + numero + " es " + cuadrado);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
