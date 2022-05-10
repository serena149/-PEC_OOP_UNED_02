
/**
 * Contable
 */

public class Contable extends Empleado
{
    //No hay de momento campos propios de Contable
    
    /**
     * Constructor
     */
    public Contable(String nif)
    {
        //Se inicializan las variables heredadas de Persona
        DNIoNIE = nif;
        IDtipo = 4; 
        
        nombre = "";
        ape1 = "";
        ape2 = "";
    }

    /**
     * Visualización de datos de los clientes asignados (proyectos, certificados y ejecución de obras contratadas).
     */
    public void mostrarClientesCont()
    {
        //Placeholder        
    }
    
    /**
     * Actualización de proyectos arquitectónicos y certificados para registrar presupuestos y/o costes.
     */
    public void registrarPresu()
    {
        //Placeholder
    }
}
