
/**
 * Vivienda unifamiliar.
*/

import java.util.ArrayList;
import java.time.LocalDate;

public class Unifamiliar extends Residencial
{
    //

    /**
     * Constructor
     */
    public Unifamiliar(String str1)
    {
        IDtipoTarea = 1;
        nombreUnicoTarea = str1;
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        DNIcliente = "";
        DNIarquitecto = "";
        DNIcontable = "";
        DNIaparejador = "";
        fechaEntrega = LocalDate.of(1000, 01, 01);
        coste = 0;
        dirección = "";
        supfTerreno = 0;
        supfEdificio = 0;
        numPlantas = 0;
        numHabitaciones = 0;
        numBaños = 0;
        historicoCert = new ArrayList<Certificado>();
        realizado = false;
    }
}
