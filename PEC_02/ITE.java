
/**
 * Certificado de Inspección Técnica de edificios. 
 * Es obligatoria a partir de los 45 años de su construcción. En el momento en que una vivienda para la que se ha desarrollado un proyecto cumple 45 años desde el fin de obra, 
 * el administrador se pondrá en contacto con el cliente para informar y preguntar por su posible inspección  * 
 */

import java.time.LocalDate;

public class ITE extends Certificado
{
    //Variable para calcular cuando se hace necesario el certificado de ITE:
    public LocalDate fechaFinObra;

    /**
     * Constructor for objects of class ITE
     */
    public ITE(String str1)
    {
        IDtipoTarea = 7;
        nombreUnicoTarea = str1;
        DNIaparejador = "";
        DNIarquitecto = "";
        DNIcliente = "";
        DNIcontable = "";
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        fechaEntrega = LocalDate.of(1000, 01, 01);
        fechaFinObra = LocalDate.of(1000, 01, 01);
        coste = 0;
        realizado = false;
    }
}