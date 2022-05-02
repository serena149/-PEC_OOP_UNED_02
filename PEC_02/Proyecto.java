/**
 * Proyecto
 */

import java.time.LocalDate;
import java.time.Period;

public class Proyecto extends Tarea
{
    //Variables tras contratación del proyecto:
    public LocalDate fechaInicio;
    public Period duracionPrevista;
    public Period duracionObra;
    //Variables tras terminar obra:
    public LocalDate fechaFinObra;    
        
    /**
    * Constructor
     */
    public Proyecto()
    {
        //
        
    }   
    
    /**
    * get para la variable fechaFinObra
    */
    
    public LocalDate getFechaFinObra(){
        return fechaFinObra;
    }
    
    /**
    * set para la variable fechaFinObra
    */
    
    public void setFechaFinObra(LocalDate nuevaFecha){
        fechaFinObra = nuevaFecha;
    }
}
