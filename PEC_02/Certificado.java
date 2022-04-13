
/**
 * Certificado.
 */

import java.time.LocalDate;

public class Certificado
{
    //Variables tras solicitud:
    LocalDate fechaSolicitud;
    LocalDate fechaEntrega;
    Cliente cliente;
    //Variables tras asignación:
    Arquitecto arquiAsignado;
    Contable contAsignado;
    float coste;
    

    /**
     * Constructor
     */
    public Certificado()
    {
        //
    }
}
