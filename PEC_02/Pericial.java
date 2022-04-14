
/**
 * Informe Periciales
*/

import java.time.LocalDate;

public class Pericial extends Certificado
{
    //Variables para la emisión
    public Arquitecto arquiAsignado1;
    public LocalDate fechaemision;
    
    /**
     * Constructor
     */
    public Pericial(String str1)
    {
        nombreUnicoTarea = str1;
    }
}
