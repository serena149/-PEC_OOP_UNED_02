
/**
 * Administrador
 * 
*/

public class Admin extends Empleado
{
    //     

    /**
     * Constructor for objects of class Admin
     */
    public Admin(String nif)
    {
        DNIoNIE = nif;
        IDtipo = 1;
    }
    
    /**
    * Gestión de usuarios: altas.
    */

    public void altaUsuario()
    {
        //
                
    }
    
    /**
     * Gestión de usuarios: bajas.
    */

    public void bajaUsuario()
    {
        // put your code here
                
    }
    
    /**
     * Gestión de usuarios: modificaciones.
    */

    public void modUsuario()
    {
        // put your code here
                
    }
    
    /**
     * Asignación de arquitectos, aparejadores y contables a proyectos y certificados.
    */

    public void asignarEmpleado()
    {
        // put your code here
                
    }
    
    /**
     * Visualización de datos de todas las personas registradas en el sistema.
    */

    public void mostrarTodosDatos()
    {
        // put your code here
                
    }
    
    /**
     * Visualización de clientes por cada arquitecto o aparejador.
    */

    public void mostrarClientes()
    {
        // put your code here
                
    }
    
    /**
     * Visualización del listado de viviendas/edificios y las fechas de fin de obra.    
    */

    public void mostrarFechaFinObra()
    {
        // put your code here
                
    }
    
    /**
     * Visualización del listado de viviendas/edificios y las fechas del último certificado de habitabilidad emitido.
    */

    public void mostrarCertHabit()
    {
        // put your code here
                
    }
    
    /**
     * Visualización de un listado de viviendas en las que se pueda consultar para cada vivienda los proyectos arquitectónicos y certificados emitidos.
    */

    public void mostrarTareasVivienda()
    {
        // put your code here
                
    }
    
    /**
     * Visualización de la planificación de ejecución de obras, a partir de los proyectos contratados en un momento determinado.
    */

    public void mostrarPlan()
    {
        // put your code here
                
    }
    
    /** 
     * Generacion de listado de clientes cuya vivienda tenga más de 45 años para informar de la necesidad de obtener un certificado de ITE.     
    */
    public void buscarViviendasITE()
        {
            // put your code here
                    
        }
        
    /**
    * Generacion de listado de certificados de habitabilidad que han cumplido 15 años con el objetivo de informar a dichos clientes de la necesidad de renovarlos.
    */
    public void buscarHabitabilidadCumpl()
        {
            // put your code here
                    
        }
    /**
    * Una vez el cliente ha obtenido el proyecto y decide que el propio estudio desarrolle la obra, el administrador gestionará el calendario 
    * teniendo en cuenta que el estudio no puede tener más de tres obras en marcha al mismo tiempo.
    * Para ello el administrador consultará la duración prevista de la obra que consta en el proyecto y asignará la fecha de inicio de la obra. 
    * Cuando la obra haya finalizado,también actualizará la fecha de fin de obra.
    */
    public void gestionCalendario()
        {
            // put your code here
                    
        }
        
        


}
