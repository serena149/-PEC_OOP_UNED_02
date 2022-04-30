
/**
 * Informe Pericial
*/

import java.time.LocalDate;

public class Pericial extends Certificado
{
    //Variables para la emisión
    public LocalDate fechaEmision;
    
    /**
     * Constructor
     */
    public Pericial(String str1)
    {
        IDtipoTarea = 9;
        nombreUnicoTarea = str1;
        DNIcliente = "";
        DNIarquitecto = "";
        DNIaparejador = "";
        DNIcontable = "";
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        fechaEmision = LocalDate.of(1000, 01, 01);
        fechaEntrega = LocalDate.of(1000, 01, 01);
        coste = 0;
        realizado = false;
    }
}
