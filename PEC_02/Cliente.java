/**
 * Cliente
 */
public class Cliente extends Persona
{
    
    /**
     * Constructor
     */
    public Cliente(String nif)
    {
        DNIoNIE = nif;
        IDtipo = 0;
        
        nombre = "";
        ape1 = "";
        ape2 = "";
    }   
}