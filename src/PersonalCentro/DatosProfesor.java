package PersonalCentro;

import java.util.List;
/**
 * Permite crear un profesor
 * @author Alumno
 * @version: 1.0
 */
public class DatosProfesor extends DatosPersona{
    /**
     * Declaración variables
     * @param: str nombre del profesor
     * @param: edad edad del profesor
     * @param: numeroDeTelefono número del profesor
     */
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;
    
    /**
     * Constructor
     * @param numeroDeTelefono 
     */
    public DatosProfesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    
    /**
     * Obtener información personal: nombre, edad, teléfono
     */
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
    }
    
    /**
     * Obtener información personal + prestamos
     */
    public void printTodaLaInformacion(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
        for(prestamo p: prestamos){
            System.out.println(p);
        }
    }
}
