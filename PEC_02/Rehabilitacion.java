
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
        IDtipoTarea = 5;
        nombreUnicoTarea = str1; 
        DNIaparejador = "";
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        fechaInicio = LocalDate.of(1000, 01, 01);
        duracionPrevista = Period.of(0, 0, 0);
        duracionObra = Period.of(0, 0, 0);
        fechaFinObra = LocalDate.of(1000, 01, 01);
        fechaEntrega = LocalDate.of(1000, 01, 01);
        dirección = "";
        supf = 0;
        coste = 0;
        DNIcliente = "";
        DNIarquitecto = "";
        realizado = false;        
    }
}
