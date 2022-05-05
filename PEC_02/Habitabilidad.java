/**
 * Certificado de habitabilidad
 * Caducan cada 15 años. El estudio mediante el administrador tendrá que ponerse en contacto con el cliente para informar y preguntar por su posible renovación.
 */

import java.time.LocalDate;

public class Habitabilidad extends Certificado
{
    //Variables para guardar la visita del aparejador:
    public LocalDate fechaVisita;
    //Variable para el arquitecto:    
    public LocalDate fechaEmision;
    
    /**
     * Constructor
     */
    public Habitabilidad(String str1)
    {
        IDtipoTarea = 6;
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
        //variables propias de Habitabilidad:
        fechaVisita = LocalDate.of(1000, 01, 01);
        fechaEmision = LocalDate.of(1000, 01, 01);
    }
}
