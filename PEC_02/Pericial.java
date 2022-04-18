
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
        DNIarquitecto = "";
        DNIaparejador = "";
        fechaEmision = LocalDate.of(1000, 01, 01);
        realizado = false;
    }
}
