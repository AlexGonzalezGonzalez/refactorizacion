/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author agonzalezgonzalez
 */
public class calcularFactorial {

    private int numero;
    private int factorial;
    private int numRepet;

    /**
     * BAscicamente esta clase se encarga de calcular el factorial del numero 8,
     * es decir, multiplicar 8 por todos los numeros enteros entre 7 y 1.
     *
     * @param numero Es el numero que le vamos a hacer el factorial.
     * @param factorial Es el resultado de hace el facturial a la varialble.
     * numero.
     * @param numRepet Es el numero de repeticiones, es decir, el numero de
     * veces que multiplicaremos.
     */
    public void calcularFactorial(int numero, int factorial, int numRepet) {
        
        numero = 8;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (numRepet = numero; numRepet >= 1; numRepet--) {
                factorial = factorial * numRepet;
            }
        }
        System.out.println(factorial);
    }

    public int getNumero() {
        return numero;
    }

    public int getNumRepet() {
        return numRepet;
    }

    public int getFactorial() {
        return factorial;
    }
}
