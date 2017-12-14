package factorial;

public class Factorial {
    /**
     * El buen main.
     * El que instancia objetos de otras clases
     * Y muestra el resultado de hacer el factorial de 8 calculado en la otra clase.
     * @param args 
     */

    public static void main(String[] args) {
        calcularFactorial cf = new calcularFactorial();
        cf.calcularFactorial(cf.getNumero(), cf.getFactorial(), cf.getNumRepet());

        System.out.println(cf.getFactorial());

    }

}
