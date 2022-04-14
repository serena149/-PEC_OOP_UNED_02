
/**
 * Residencial
 */

import java.util.ArrayList;

public class Residencial extends Proyecto
{
    //Variables específicas de proyecto residencial
    public String dirección;
    public float supfTerreno;
    public float supfEdificio;
    public int numPlantas;
    public int numHabitaciones;
    public int numBaños;
    //historico de certificados asociados:
    public ArrayList<Certificado> historicoCert;

    /**
     * Constructor
     */
    public Residencial()
    {
        // initialise instance variables
        
    }   
}
