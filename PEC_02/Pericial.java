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
        //Variables heredadas de Tarea:
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        DNIcliente = "";
        DNIarquitecto = "";
        DNIcontable = "";
        DNIaparejador = "";
        fechaEntrega = LocalDate.of(1000, 01, 01);
        coste = 0f; 
        realizado = false;
        //Variables propias de Pericial:
        fechaEmision = LocalDate.of(1000, 01, 01);
    }
}
