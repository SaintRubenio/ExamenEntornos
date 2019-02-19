package examenentornos;

import java.util.List;

public class Profesor extends Persona{
    //Declaración variables
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    
    //Constructor
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    
    //Obtener información personal: nombre, edad, teléfono
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
    }
    
    //Obtener información personal + prestamos
    public void printTodaLaInformacion(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
        for(prestamo p: prestamos){
            System.out.println(p);
        }
    }
}
