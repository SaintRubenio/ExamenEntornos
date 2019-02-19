package PersonalCentro;

import java.util.List;

public class DatosProfesor extends DatosPersona{
    //Declaración variables
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    
    //Constructor
    public DatosProfesor(String numeroDeTelefono){
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
