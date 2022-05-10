
/**
 * Vivienda unifamiliar.
*/

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Unifamiliar extends Residencial
{
    /**
     * Constructor
     */
    public Unifamiliar(String str1)
    {
        //variables heredadas de Tarea
        IDtipoTarea = 1;
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
        
        //Variables heredadas de Residencial
        dirección = "";
        supfTerreno = 0f;
        supfEdificio = 0f;
        numPlantas = 0;
        numHabitaciones = 0;
        numBaños = 0;
        historicoCert = new ArrayList<Certificado>();
    }
}
