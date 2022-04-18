
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
        nombre = "";
        ape1 = "";
        ape2 = "";
    }
    
    /**
    * Gestión de usuarios: altas.
    */

    public void altaUsuario()
    {
        int aux1;       
        String DNIInput;
        String nombreInput;
        String ape1Input;
        String ape2Input;
        
        try{
            System.out.println("Indica DNI o NIE de la persona que estás dando de alta:");
            DNIInput = estudio.sc.nextLine();
            
            for (Persona p : estudio.datosPersonas) {
                if(p.DNIoNIE.equals(DNIInput)){
                        throw new Exception();
                    }
                }
            
            System.out.println("Indica el nombre:");
            nombreInput = estudio.sc.nextLine();
            
            System.out.println("Indica el primer apellido:");
            ape1Input = estudio.sc.nextLine();
            
            System.out.println("Indica el segundo apellido, si existe:");
            ape2Input = estudio.sc.nextLine();
            
            System.out.println("Indica qué tipo de usuario deseas dar de alta:");
            System.out.println("0: cliente, 1: administrador, 2: arquitecto, 3: aparejador, 4: contable");
            aux1 = Integer.parseInt(estudio.sc.nextLine());
                    
            switch(aux1) {
                case 0:
                    estudio.datosPersonas.add(new Cliente(DNIInput));
                    break;
                case 1:
                    estudio.datosPersonas.add(new Admin(DNIInput));
                    break;
                case 2:
                    estudio.datosPersonas.add(new Arquitecto(DNIInput));
                    break;
                case 3:
                    estudio.datosPersonas.add(new Aparejador(DNIInput));
                    break;
                case 4:
                    estudio.datosPersonas.add(new Contable(DNIInput));
                    break;                
                default:
                    throw new Exception();
                }
            for (Persona p : estudio.datosPersonas){
                if(p.DNIoNIE.equals(DNIInput)){
                    p.nombre = nombreInput;
                    p.ape1 = ape1Input;
                    p.ape2 = ape2Input;
                    System.out.println("El usuario se ha grabado correctamente.");
                }
            }
        } catch (Exception e){
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
        }
    }
    
    /**
     * Gestión de usuarios: bajas.
    */

    public void bajaUsuario()
    {
        String DNIInput;
        boolean personaExiste = false;
        int index;
        
        try{
            System.out.println("Indica DNI o NIE de la persona que estás dando de baja:");
            DNIInput = estudio.sc.nextLine();
            
            for (Persona p : estudio.datosPersonas){
                if (p.DNIoNIE.equals(DNIInput)){
                    personaExiste = true;
                    estudio.datosPersonas.remove(p);
                    System.out.println("El usuario se ha dado de baja correctamente.");
                    break;
                }
            }
            
            if(!personaExiste){
                throw new Exception();                
            }
            
            
        } catch(Exception e){
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
        }                
    }
    
    /**
     * Gestión de usuarios: modificaciones.
    */

    public void modUsuario()
    {
        String DNIInput;
        boolean personaExiste = false;
        String nombreInput;
        String ape1Input;
        String ape2Input;
        
        try{
            System.out.println("Indica DNI o NIE de la persona que estás modificando:");
            DNIInput = estudio.sc.nextLine();
            
            for (Persona p : estudio.datosPersonas){
                if (p.DNIoNIE.equals(DNIInput)){
                    personaExiste = true;
                }
            }
            
            if(!personaExiste){
                throw new Exception();                
            }
            
            System.out.println("Indica el nuevo nombre:");
            nombreInput = estudio.sc.nextLine();
            
            System.out.println("Indica el nuevo primer apellido:");
            ape1Input = estudio.sc.nextLine();
            
            System.out.println("Indica el nuevo segundo apellido, si existe:");
            ape2Input = estudio.sc.nextLine();
            
            for (Persona p : estudio.datosPersonas){
                if(p.DNIoNIE.equals(DNIInput)){
                    p.nombre = nombreInput;
                    p.ape1 = ape1Input;
                    p.ape2 = ape2Input;
                    System.out.println("El usuario se ha modificado correctamente.");
                }
            }
        } catch(Exception e){
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
        }                
                    
    }
    
    /**
     * Asignación de arquitectos, aparejadores y contables a proyectos y certificados.
     */

    public void asignarEmpleado()
    {
        String nombreInput;
        boolean tareaExiste = false;
        boolean personaExiste = false;
        String arquiInput;
        String apaInput;
        String contInput;
        
        try{
            System.out.println("Indica el nombre único de la tarea que quieres modificar");
            nombreInput = estudio.sc.nextLine();
            
            for (Tarea t : estudio.datosTareas){
                if (t.nombreUnicoTarea.equals(nombreInput)){
                    tareaExiste = true;
                }
            }
            
            if(!tareaExiste){
                throw new Exception();                
            }
            
            System.out.println("Indica el DNI del arquitecto al que quieres asignar la tarea:");
            arquiInput = estudio.sc.nextLine();
            
            for (Persona p : estudio.datosPersonas) {
                    if((p.DNIoNIE.equals(arquiInput) && p.IDtipo == 2)){
                        personaExiste = true;
                    }
                }
            
            if(!personaExiste){
                throw new Exception();
            }
            
            personaExiste = false;
            
            System.out.println("Indica el DNI del aparejador al que quieres asignar la tarea:");
            apaInput = estudio.sc.nextLine();
            
            for (Persona p : estudio.datosPersonas) {
                    if((p.DNIoNIE.equals(apaInput) && p.IDtipo == 3)){
                        personaExiste = true;
                    }
                }
            
            if(!personaExiste){
                throw new Exception();
            }
            
            personaExiste = false;
            
            System.out.println("Indica el DNI del contable al que quieres asignar la tarea:");
            contInput = estudio.sc.nextLine();
            
            for (Persona p : estudio.datosPersonas) {
                    if((p.DNIoNIE.equals(contInput) && p.IDtipo == 4)){
                        personaExiste = true;
                    }
                }
            
            if(!personaExiste){
                throw new Exception();
            }
            
            personaExiste = false;
        
        } catch(Exception e){
        
        }
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
