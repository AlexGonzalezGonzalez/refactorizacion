/**
 * Examen Refactorizacion
 * Este proyecto sirve para calcular el tiempo vivido en diferentes unidades de tiempo.
 *
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezgonzalez
 */
public class LoVivido {

    /**
     *Este es el buen main
     * 
     * @param args etc
     */
    public static void main(String[] args) {
        calcularEdad ce = new calcularEdad();
        ce.calcularEdad(ce.edad,ce.nombre,ce.años,ce.dias,ce.horas,ce.meses);
    }
}
