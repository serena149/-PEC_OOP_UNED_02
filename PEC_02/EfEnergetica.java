
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
    private ArrayList<Character> categorias;
    //Variables para la visita del aparejador:
    public LocalDate fechaVisita;
        
    /**
     * Constructor for objects of class EfEnergetica
     */
    public EfEnergetica(String str1)
    {
        categorias = new ArrayList<>(asList('A','B','C','D','E','F','G'));    
        IDtipoTarea = 8;
        nombreUnicoTarea = str1;
        fechaVisita = LocalDate.of(1000, 01, 01);
        fechaSolicitud = LocalDate.of(1000, 01, 01);
        fechaEntrega = LocalDate.of(1000, 01, 01);
        DNIaparejador = "";
        DNIcontable = "";
        DNIcliente = "";
        DNIarquitecto = "";
        coste = 0;
        realizado = false;        
    } 
}
