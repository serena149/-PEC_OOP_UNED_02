
/**
 * Rehabilitacion
 */

import java.time.LocalDate;
import java.time.Period;

public class Rehabilitacion extends Proyecto
{
    //Variables especificas de rehabilitación: 
    public String dirección;
    public float supf;

    /**
     * Constructor
     */
    public Rehabilitacion(String str1)
    {
        //variables heredadas de Tarea
        IDtipoTarea = 5;
        nombreUnicoTarea = str1; 
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        fechaEntrega = LocalDate.of(1000, 01, 01);
        DNIcliente = "";
        DNIarquitecto = "";
        DNIcontable = "";
        DNIaparejador = "";
        coste = 0f;
        realizado = false;        
        
        //Variables heredadas de proyecto:
        fechaInicio = LocalDate.of(1000, 01, 01);
        duracionPrevista = Period.of(0, 0, 0);
        duracionObra = Period.of(0, 0, 0);
        fechaFinObra = LocalDate.of(1000, 01, 01);    
        
        //variables propias de la clase:
        dirección = "";
        supf = 0f;
    }
}
