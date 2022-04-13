
/**
 * Certificado de Eficiencia Energetica
 * Se emiten con una categoría que puede ser desde la “A” (la más eficiente) a la “G”.
 */

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.time.LocalDate;

public class EfEnergetica extends Certificado
{
    //valores posibles:
    ArrayList<Character> categorias;
    //Variables para la visita del aparejador:
    LocalDate fechaVisita;
    Aparejador apaAsignado;
    
    /**
     * Constructor for objects of class EfEnergetica
     */
    public EfEnergetica()
    {
        categorias = new ArrayList<>(asList('A','B','C','D','E','F','G'));        
    } 
}
