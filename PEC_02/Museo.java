/**
 * Museo.
 */

import java.util.ArrayList;
import java.time.LocalDate;

public class Museo extends NoResidencial
{
    //
    
    /**
     * Constructor
     */
    public Museo(String str1)
    {
        IDtipoTarea = 3;
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
        finalidadObra = "";
        historicoCert = new ArrayList<Certificado>();
        realizado = false;
    }
}
