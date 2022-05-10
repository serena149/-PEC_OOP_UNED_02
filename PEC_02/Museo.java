/**
 * Museo.
 */

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Museo extends NoResidencial
{
    /**
     * Constructor
     */
    public Museo(String str1)
    {
        //variables heredadas de Tarea
        IDtipoTarea = 3;
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
        
        //Variables heredadas de NoResidencial
        dirección = "";
        supfTerreno = 0f;
        supfEdificio = 0f;
        finalidadObra = "";
        historicoCert = new ArrayList<Certificado>();
    }
}
