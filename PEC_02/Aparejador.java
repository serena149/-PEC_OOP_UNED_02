
/**
 * Aparejador
 */

public class Aparejador extends Empleado
{
    //No hay de momento campos propios de Aparejador 

    /**
     * Constructor
     */
    
    public Aparejador(String nif)
    {
        //Se inicializan las variables heredadas de Persona
        DNIoNIE = nif;
        IDtipo = 3;
        
        nombre = "";
        ape1 = "";
        ape2 = "";
    }

    /**
     * Visualización de datos de los clientes, proyectos arquitectónicos y certificados a los que ha sido asignado.
     */
    
    public void mostrarClientesApa()
    {
        boolean hayTareas = false;
        
        try{
            System.out.println("Listado de clientes con proyectos o certificados asignados a este aparejador:");
            
            //Se recorre el array de personas
            for (Persona p : estudio.datosPersonas){
                //Si se trata de un cliente, se imprimen sus datos
                if(p.IDtipo == 0){     
                    System.out.println("    Cliente con DNI " + p.DNIoNIE + ", " + p.nombre + " " + p. ape1 + " " + p.ape2);
                    //Se recorre el array de tareas
                    for (Tarea t : estudio.datosTareas){
                        //Si la tarea está asignada al cliente en cuestión y al aparejador del que se buscan los clientes, se imprimen los datos
                        if(t.DNIcliente.equals(p.DNIoNIE) && t.DNIaparejador.equals(DNIoNIE)){
                            hayTareas = true;
                            
                            System.out.print("Tarea: ");
                            switch(t.IDtipoTarea){
                                case 0:
                                    System.out.println("Edificio residencial");
                                    break;
                                case 1:
                                    System.out.println("Vivienda unifamiliar");
                                    break;
                                case 2:
                                    System.out.println("Nave industrial");
                                    break;
                                case 3:
                                    System.out.println("Museo");
                                    break;
                                case 4:
                                    System.out.println("Otro edificio no residencial");
                                    break;
                                case 5:
                                    System.out.println("Proyecto de rehabilitación");
                                    break;
                                case 6:
                                    System.out.println("Certificado de habitabilidad");
                                    break;
                                case 7:
                                    System.out.println("Certificado de Inspección técnica de edificios");
                                    break;
                                case 8:
                                    System.out.println("Certificado de eficiencia energética");
                                    break;
                                case 9:
                                    System.out.println("Informe pericial");
                                    break;
                                default:
                                    break; 
                            }
                                                   
                            System.out.println("Fecha de solicitud: " + t.fechaSolicitud);
                            System.out.println("Descripcion: " + t.nombreUnicoTarea);
                            
                            if(t.realizado){
                                System.out.println("La tarea resulta realizada.");
                            }else{
                                System.out.println("La tarea resulta no realizada.");
                            }                  
                                
                        }
                    }
                    
                    //Si no hay tareas para el cliente, se imprime un mensaje
                    if(!hayTareas){
                        System.out.println("No se han encontrado tareas.");
                    } else {
                        //Si hay tareas, se resetea la variable bool para el siguiente cliente
                        hayTareas = false;
                    }
                    
                }
            }
        } catch(Exception e){
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
            System.out.println(e);
        }
        
    }
    

    /**
     * Visualización de listado de clientes en función de visitas pendientes para la emisión de certificados.
     */
    
    public void mostrarClientesPendientes()
    {
        //Placeholder        
    }
}
