
/**
 * Proyecto
 */

import java.time.LocalDate;
import java.time.Period;

public class Proyecto
{
    //Variables para alta del proyecto:
    LocalDate fechaSolicitud;
    LocalDate fechaEntrega;
    Period duracionObra;
    Cliente cliente;
    //Variables tras contratación del proyecto:
    LocalDate fechaInicio;
    Period duracionPrevista;
    Arquitecto arqAsignado;
    Contable contAsignado;
    //Variables tras terminar obra:
    LocalDate fechaFinObra;
    //Variable tras valoración por contable:
    float coste;
        
    /**
    * Constructor
     */
    public Proyecto()
    {
        //
        
    }
}
