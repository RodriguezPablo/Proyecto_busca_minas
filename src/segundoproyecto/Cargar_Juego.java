/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoproyecto;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author MAGDIEL
 */
public class Cargar_Juego {

    String[][] matriz_minas;//Matriz que guarda las minas
    int cont;

    /**
     *Metodo para ingresar el parametro del tablero 
     */
    public void ingreso_minas() {
        int tamañoTablero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño que quire que tenga el tablero"));//Variable que guarda el tamaño del tablero que el usuario quiere por medio de un JOptionPane
        matriz_minas = new String[tamañoTablero][tamañoTablero];
           llena_matriz_minas(tamañoTablero);
    }
//Primeramente se llenan la matriz con las minas
    private void llena_matriz_minas(int tam) {
        for (int i = 0; i < matriz_minas.length; i++) {
            for (int j = 0; j < matriz_minas.length; j++) {
                //System.out.println(random(tam));
                if (random(tam) == i) {
                    matriz_minas[i][j] = "*";
                }
            }
        }
        
        imprimir_matriz();
        llena_numero_matriz_minas();
        
    }
    //Luego se llenan los campos que no tinenen minas, con los números correspondientes a la cantidad de minas cerca
    //de ellos
    private void llena_numero_matriz_minas(){
        for (int i = 0; i < matriz_minas.length; i++) {
            for (int j = 0; j < matriz_minas.length; j++) {
                //System.out.println(random(tam));
                if (null== matriz_minas[i][j]) {
                    //if(null!= matriz_minas[i][j+1]){
                        if("*".equals( matriz_minas[i][j+1])){
                            cont++;
                            if("*".equals( matriz_minas[i+1][j+1])){
                                cont++;
                                if("*".equals( matriz_minas[i+1][j+1])){
                                    cont++;
                                }
                            }else if("*".equals( matriz_minas[i+1][j])){
                                cont++;
                            }
                        }else if("*".equals( matriz_minas[i+1][j+1])){
                            cont++;
                            if("*".equals( matriz_minas[i+1][j])){
                                cont++;
                            }
                        }else if("*".equals( matriz_minas[i+1][j+1])){
                            cont++;
                            if("*".equals( matriz_minas[i+1][j])){
                                cont++;
                            }
                        }
                    }
                
                //}
                if (null== matriz_minas[i][j]) {
                    matriz_minas[i][j]=String.valueOf(cont);
                }
            }
        }
    }
    
    private void imprimir_matriz(){
        //Impresion de prueba
        for (int i = 0; i < matriz_minas.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz_minas.length; j++) {
                System.out.print(matriz_minas[i][j]+" ");
            }
        }
    }
/**
 * Metodo que muestra las minas
 */
    private void muestra_matriz_minas() {
        for (int i = 0; i < matriz_minas.length; i++) {
            for (int j = 0; j < matriz_minas.length; j++) {

            }
        }
    }
/**
 * Metodo que genera aleatoriamente las minas 
 * @param tamaño
 * @return 
 */
    private int random(int tamaño) {        
        return  (int) (Math.random () * (tamaño - 0) + 0); 
    }
}
