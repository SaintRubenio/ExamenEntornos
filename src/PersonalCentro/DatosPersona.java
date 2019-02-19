package PersonalCentro;
/**
 * Permite crear una persona cualquiera
 * @author Alumno
 * @version: 1.0
 */
public class DatosPersona {
    /**
     * Declaracion de variables.
     * @param numeroDeTelefono número de la persona
     */
    String numeroDeTelefono;
    
    /**
     * Constructor
     * @param numeroDeTelefono 
     */
    public DatosPersona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    /**
     * Getter
     * @return numeroDeTelefono
     */
    public String GetNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    
    /**
     * Setter
     * @param numeroDeTelefono 
     */
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
