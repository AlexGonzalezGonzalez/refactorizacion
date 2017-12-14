/*
 * Este programa calcula tu edad en diferentes unidadesde tiempo.
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezgonzalez
 */
public class calcularEdad {
      
       public void calcularEdad(){
     /** Declaramos las variables
     * @param nombre Este es el nombre de la persona.
     * @param edad Esta variable es el mensaje que se mostrara cuando se pida la edad.
     * @param años Es la edad en años
     * @param meses Es la edad en meses.
     * @param dias Esta es la edad en dias.
     * @param horas Esta es la edad en horas.
     */
        String nombre;
        String edad;
        int meses;
        int dias;
        int horas;
        int años; 
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
        años = Integer.parseInt(edad);
        meses = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);
        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "D\u00edas: " + dias, "Numero de d\u00edas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
