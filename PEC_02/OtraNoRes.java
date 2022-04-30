/**
 * Otra construcción no residencial.
*/

import java.util.ArrayList;
import java.time.LocalDate;

public class OtraNoRes extends NoResidencial
{
    //

    /**
     * Constructor
    */
    public OtraNoRes(String str1)
    {
        IDtipoTarea = 4;
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
