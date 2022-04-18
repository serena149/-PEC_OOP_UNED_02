
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
        nombreUnicoTarea = str1;
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        DNIcliente = "";
        DNIarquitecto = "";
        DNIcontable = "";
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
