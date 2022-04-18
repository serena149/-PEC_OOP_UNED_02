
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.time.LocalDate;

public class Tarea
{
    // Variables para alta de la tarea:
    public LocalDate fechaSolicitud;
    public String DNIcliente;
    public String nombreUnicoTarea;
    public String DNIarquitecto;
    //Variables tras asignación/contratación:
    public String DNIcontable;
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
