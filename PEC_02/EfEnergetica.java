
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
        IDtipoTarea = 8;
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
        //Variables propias:
        categorias = new ArrayList<>(asList('A','B','C','D','E','F','G')); 
        fechaVisita = LocalDate.of(1000, 01, 01);
    } 
}
