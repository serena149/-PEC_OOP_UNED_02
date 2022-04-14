
/**
 * Informe Periciales
*/

import java.time.LocalDate;

public class Pericial extends Certificado
{
    //Variables para la emisión
    public String DNIarquitecto;
    public LocalDate fechaEmision;
    
    /**
     * Constructor
     */
    public Pericial(String str1)
    {
        nombreUnicoTarea = str1;
        DNIarquitecto = "";
        fechaEmision = LocalDate.of(1000, 01, 01);
    }
}
