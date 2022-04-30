/**
 * Tarea
 */

import java.time.LocalDate;

public class Tarea
{
    // Variables para alta de la tarea:
    public int IDtipoTarea;
    public LocalDate fechaSolicitud;
    public String DNIcliente;
    public String nombreUnicoTarea;
    public String DNIarquitecto;
    //Variables tras asignación/contratación:
    public String DNIcontable;
    public String DNIaparejador;
    LocalDate fechaEntrega;
    //Variable tras valoración por contable:
    public float coste;
    
    boolean realizado;

    
    /**
     * Constructor for objects of class Tarea
     */
    public Tarea()
    {
        
    }
}
