/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author MAGDIEL
 */
public class SegundoProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        opc=Integer.parseInt(JOptionPane.showInputDialog(" Elija una opcion \n1-Jugar\n2-Salir "));
        switch (opc) {
            case 1:
                Cargar_Juego cargar = new Cargar_Juego();
                cargar.ingreso_minas();
                
                break;
            case 2:

                break;

            default:
                System.out.println("No es una Opción");
                break;
        }
    }
}
