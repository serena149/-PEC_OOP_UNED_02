/**
 * Cliente
 */
public class Cliente extends Persona
{
    //No hay de momento campos propios de Cliente
    
    /**
     * Constructor
     */
    public Cliente(String nif)
    {
        //Se inicializan las variables heredadas de Persona
        DNIoNIE = nif;
        IDtipo = 0;
        
        nombre = "";
        ape1 = "";
        ape2 = "";
    }   
}