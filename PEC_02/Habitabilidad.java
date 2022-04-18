
/**
 * Certificado de habitabilidad
 * Caducan cada 15 años. El estudio mediante el administrador tendrá que ponerse en contacto con el cliente para informar y preguntar por su posible renovación.
 */

import java.time.LocalDate;

public class Habitabilidad extends Certificado
{
    //Variables para guardar la visita del aparejador:
    public String DNIaparejador;
    public LocalDate fechaVisita;
    //Variable para el arquitecto:
    public String DNIarquitecto;
    public LocalDate fechaEmision;
    
    /**
     * Constructor
     */
    public Habitabilidad(String str1)
    {
        nombreUnicoTarea = str1;
        DNIaparejador = "";
        fechaVisita = LocalDate.of(1000, 01, 01);
        DNIarquitecto = "";
        fechaEmision = LocalDate.of(1000, 01, 01);
        realizado = false;
    }
}
