/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencias;

import asistencias.entidades_graficas.JFrame_Principal;

/**
 *
 * @author brall
 */
public class Asistencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Incio la ventana principal de gestor de cita
        JFrame_Principal framePrincipal =new JFrame_Principal();  //llamar la ventana princal
        framePrincipal.setLocationRelativeTo(null); //Para centrar en la ventana 
        framePrincipal.setVisible(true); //Hacer visible el formulario

    }
    
}
