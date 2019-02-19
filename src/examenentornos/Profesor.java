/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenentornos;

import java.util.List;

/**
 *
 * @author Alumno
 */
public class Profesor extends Persona{
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
    }
    public void printTodaLaInformacion(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
        for(prestamo p: prestamos){
            System.out.println(p);
        }
    }
}
