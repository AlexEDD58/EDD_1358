/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd1358listas;

import listas.ListaLigadaADT;
import listas.Nodo;

/**
 *
 * @author Cabrera
 */
public class EDD1358Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Probando impl de Lista Ligada");
        ListaLigadaADT<Integer> lista = new ListaLigadaADT();
        lista.agregarAlFinal(10);
        lista.transversal();
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(40);
        lista.transversal();
        lista.agregarAlInicio(100);
        lista.transversal();
        lista.agregarDespuesDe(42, 3);
        lista.transversal();
        lista.eliminar(2);
        lista.transversal();
        
    }
    
}
