/**
 * Administrador  
*/

import java.util.ArrayList;
import java.time.LocalDate;

public class Admin extends Empleado
{
    //No hay de momento campos propios de Admin

    /**
     * Constructor
     */
    public Admin(String nif)
    {
        //Se inicializan las variables heredadas de Persona
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
            
            //Se comprueba que el DNI o NIE introducido no sea repetido.
            for (Persona p : estudio.datosPersonas) {
                if(p.DNIoNIE.equals(DNIInput)){
                        throw new Exception();
                    }
                }
            
            //Se puede volver a introducir mismo nombre / apellido si no se desea modificarlo
            System.out.println("Indica el nombre:");
            nombreInput = estudio.sc.nextLine();
            
            System.out.println("Indica el primer apellido:");
            ape1Input = estudio.sc.nextLine();
            
            System.out.println("Indica el segundo apellido, si existe:");
            ape2Input = estudio.sc.nextLine();
            
            System.out.println("Indica qué tipo de usuario deseas dar de alta:");
            System.out.println("0: cliente, 1: administrador, 2: arquitecto, 3: aparejador, 4: contable");
            aux1 = Integer.parseInt(estudio.sc.nextLine());
            
            //Se crea objeto del tipo solicitado por el usuario
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
            
            //Se recorre el array de Personas y se modifica el objeto recién creado
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
        String DNIInput = new String("");
        boolean personaExiste = false;        
        
        try{
            System.out.println("Indica DNI o NIE de la persona que estás dando de baja:");
            DNIInput = estudio.sc.nextLine();
            
            //Se comprueba que el usuario exista en el array
            //Si existe, se retira del array
            for (Persona p : estudio.datosPersonas){
                if (p.DNIoNIE.equals(DNIInput)){
                    personaExiste = true;
                    estudio.datosPersonas.remove(p);
                    System.out.println("El usuario se ha dado de baja correctamente.");
                    break;
                }
            }
            
            //Si no existe, se lanza una excepción para mostrar el mensaje de error
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
            
            //Se comprueba que el DNI o NIE corresponda a una persona en el array
            for (Persona p : estudio.datosPersonas){                
                if (p.DNIoNIE.equals(DNIInput)){
                    personaExiste = true;
                }
            }
            
            //Si no existe, se interrumpe la ejecución y se muestra el mensaje de error
            if(!personaExiste){
                throw new Exception();                
            }
            
            System.out.println("Indica el nuevo nombre:");
            nombreInput = estudio.sc.nextLine();
            
            System.out.println("Indica el nuevo primer apellido:");
            ape1Input = estudio.sc.nextLine();
            
            System.out.println("Indica el nuevo segundo apellido, si existe:");
            ape2Input = estudio.sc.nextLine();
            
            //se recorre el array y se actualizan los datos
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
            System.out.println("Indica el nombre único de la tarea que quieres asignar");
            nombreInput = estudio.sc.nextLine();
            
            //Se comprueba que el nombre corresponda a una tarea que existe en el array
            for (Tarea t : estudio.datosTareas){
                if (t.nombreUnicoTarea.equals(nombreInput)){
                    tareaExiste = true;
                }
            }
            
            //si no existe, se lanza una excepción
            if(!tareaExiste){
                throw new Exception();                
            }
            
            //Se solicitan los DNI de los profesionales, repitiendo las comprobaciones para todos
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
            
            //Se graban los nuevos valores
            for(Tarea t : estudio.datosTareas){
                if(t.nombreUnicoTarea.equals(nombreInput)){
                    t.DNIarquitecto = arquiInput;
                    t.DNIaparejador = apaInput;
                    t.DNIcontable = contInput;
                    System.out.println("La tarea se ha asignado correctamente.");
                }
            }
                    
        } catch(Exception e){
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
        }
    }
    
    /**
     * Visualización de datos de todas las personas registradas en el sistema.
    */

    public void mostrarTodosDatos()
    {
        System.out.println("Datos de las personas dadas de alta en el sistema:"); 
        
        //Se imprime el tipo correcto de usuario del programa
        for (Persona p : estudio.datosPersonas){
            switch (p.IDtipo){
                 case 0:
                     System.out.print("Cliente");
                     break;
                 case 1:
                     System.out.print("Admin");
                     break;
                 case 2:
                     System.out.print("Arquitecto");
                     break;
                 case 3:
                     System.out.print("Aparejador");
                     break;
                 case 4:
                     System.out.print("Contable");
                 default:
                     break;
                }
            
            //Se imprimen los datos
            System.out.println(" con DNI o NIE: " + p.DNIoNIE + ", " + p.nombre + " " + p. ape1 + " " + p.ape2);
            }                
    }
    
    /**
     * Visualización de clientes por cada arquitecto o aparejador.
    */

    public void mostrarClientes()
    {
        System.out.println("Listado de clientes por cada arquitecto o aparejador:");
        
        //recorre el array de personas
        for(Persona p : estudio.datosPersonas){
            ArrayList<String> listaDNIclientes = new ArrayList<String>();             
            
            //Solo se ejecuta el bloque si se trata de un arquitecto o aparejador
            if(p.IDtipo == 2 || p.IDtipo == 3){
                
                //Se imprime el tipo de usuario
                switch(p.IDtipo){
                    case 2:
                         System.out.print("Arquitecto");
                         break;
                     case 3:
                         System.out.print("Aparejador");
                         break;
                }
                
                //se imprimen los datos
                System.out.println(" con DNI o NIE: " + p.DNIoNIE + ", " + p.nombre + " " + p. ape1 + " " + p.ape2);
                
                //se buscan los clientes para el arquitecto o aparejador, evitando duplicados:
                for (Tarea t : estudio.datosTareas){
                    if((t.DNIarquitecto.equals(p.DNIoNIE) || t.DNIaparejador.equals(p.DNIoNIE)) && !listaDNIclientes.contains(t.DNIcliente)){
                        listaDNIclientes.add(t.DNIcliente);
                    }
                }
                
                //Se imprime la lista o, en ausencia de clientes asignados, un mensaje
                if(listaDNIclientes.size() == 0){
                    System.out.println("    No resultan clientes asignados.");
                } else {
                    for(String str : listaDNIclientes){
                        for(Persona p1 : estudio.datosPersonas){
                            if(p1.DNIoNIE.equals(str)){
                                System.out.println("    Cliente con DNI o NIE: " + p1.DNIoNIE + ", " + p1.nombre + " " + p1. ape1 + " " + p1.ape2);
                            }
                        }
                    }
                }
            }
        }            
    }

    
    /**
     * Visualización del listado de viviendas/edificios y las fechas de fin de obra.    
    */

    public void mostrarFechaFinObra()
    {
        Proyecto temp;
        
        System.out.println("Listado de proyectos y fechas de fin de obra:");
        
        //Se recorre el array:
        for(Tarea t : estudio.datosTareas){
            
            //Se imprime el tipo de proyecto
            switch(t.IDtipoTarea){
                case 0:                    
                    System.out.print("Bloque de viviendas ");
                    break;
                case 1:
                    System.out.print("Vivienda unifamiliar ");
                    break;
                case 2:
                    System.out.print("Nave industrial ");
                    break;
                case 3:
                    System.out.print("Museo ");
                    break;
                case 4:
                    System.out.print("Otra construcción no residencial ");
                    break;
                case 5:
                    System.out.print("Proyecto de rehabilitación ");
                    break;
                default:
                    break;
            }
            
            //Se usa un casteo a Proyecto para poder acceder a fechaFinObra, excluyendo los certificados
            if(t.IDtipoTarea <= 5){
                temp = (Proyecto) t;
                
                //Se comprueba que el valor no sea el valor por defecto, o  sea 1000-01-01
                if(temp.fechaFinObra.isAfter(LocalDate.of(1000, 01, 01))){
                    System.out.println("con fecha de fin de obra: " + temp.fechaFinObra);
                } else {
                    System.out.println("con fecha de fin de obra no disponible");
                }
                
            }
        }
                
    }
    
    /**
     * Visualización del listado de viviendas/edificios y las fechas del último certificado de habitabilidad emitido.
    */

    public void mostrarCertHabit()
    {
        Residencial res1;
        NoResidencial noRes1;
        LocalDate fechaMostrar = LocalDate.of(1000, 01, 01);
        Habitabilidad hab1;
        
        System.out.println("Listado de proyectos y fecha del último certificado de habitabilidad:");
        
        //Se recorre el array
        for(Tarea t : estudio.datosTareas){
            
            //Se imprime el tipo de proyecto
            switch(t.IDtipoTarea){
                case 0:                    
                    System.out.print("Bloque de viviendas ");
                    break;
                case 1:
                    System.out.print("Vivienda unifamiliar ");
                    break;
                case 2:
                    System.out.print("Nave industrial ");
                    break;
                case 3:
                    System.out.print("Museo ");
                    break;
                case 4:
                    System.out.print("Otra construcción no residencial ");
                    break;
                default:
                    break;
            }
            
            System.out.println(" con nombre unico " + t.nombreUnicoTarea);
            System.out.print("y fecha del certificado de habitabilidad más reciente ");
            
            //casteo a Residencial para poder acceder a historicoCert
            if(t.IDtipoTarea >= 0 && t.IDtipoTarea <= 1){
                res1 = (Residencial) t;
                
                //Se recorre historicoCert
                for(Certificado c : res1.historicoCert){
                    //Se aceptan solo los certificados de tipo Habitabilidad
                    if(c.IDtipoTarea == 6){
                        //Se realiza un casteo para poder acceder a la fecha de emisión
                        hab1 = (Habitabilidad) c;  
                        //Se guarda la fecha en una variable solo si es más reciente que la anterior
                        if(hab1.fechaEmision.isAfter(fechaMostrar)){
                            fechaMostrar = hab1.fechaEmision;
                        }                    
                    }
                }
            } else if(t.IDtipoTarea >= 2 && t.IDtipoTarea <= 4){
                //casteo a NoResidencial para poder acceder a historicoCert. Se usa el mismo mecanismo para la busqueda y comparación de fechas.
                noRes1 = (NoResidencial) t;
                for(Certificado c : noRes1.historicoCert){
                    if(c.IDtipoTarea == 6){
                        hab1 = (Habitabilidad) c;
                        if(hab1.fechaEmision.isAfter(fechaMostrar)){
                            fechaMostrar = hab1.fechaEmision;
                        }
                    }
                
                }                
            }
            
            //Si la fecha es válida, se muestra a pantalla y luego se resetea la variable usada para comparar las fechas
            if(fechaMostrar.isAfter(LocalDate.of(1000, 01, 01))){
                System.out.println(fechaMostrar);
                fechaMostrar = LocalDate.of(1000, 01, 01);
            } else {
                //En caso contrario, se muestra un mensaje
                System.out.println("no disponible");
            }
        }
        
    }
    
    /**
     * Visualización de un listado de viviendas en las que se pueda consultar para cada vivienda los proyectos arquitectónicos y certificados emitidos.
    */

    public void mostrarTareasVivienda()
    {
        //Placeholder                
    }
    
    /**
     * Visualización de la planificación de ejecución de obras, a partir de los proyectos contratados en un momento determinado.
    */

    public void mostrarPlan()
    {
        //Placeholder        
    }
    
    /** 
     * Generacion de listado de clientes cuya vivienda tenga más de 45 años para informar de la necesidad de obtener un certificado de ITE.     
    */
    public void buscarViviendasITE()
        {
            //Placeholder                    
        }
        
    /**
    * Generacion de listado de certificados de habitabilidad que han cumplido 15 años con el objetivo de informar a dichos clientes de la necesidad de renovarlos.
    */
    public void buscarHabitabilidadCumpl()
        {
            //Placeholder                    
        }
        
    /**
    * Gestión manual del calendario de obras, introduciendo fechas de inicio y fin de obra.
    */
    public void gestionCalendario()
        {
            Proyecto pro1;
            ArrayList<Proyecto> arrayP = new ArrayList<Proyecto>();
            String str1 = new String("");
            int int1;
            LocalDate fecha1;
            LocalDate fecha2;
            
            try{
                System.out.println("Calendario de obras:");
                
                //Se recorre el array de tareas de la clase estudio, almacenando los proyectos en un array temporal de tipo Proyecto
                for(Tarea t : estudio.datosTareas){
                    if(t.IDtipoTarea <= 5){
                        pro1 = (Proyecto) t;
                        arrayP.add(pro1);
                    }
                }
                
                //Se imprimen los datos de los proyectos y un número que permita luego identificar rápidamente el proyecto que se quiera modificar
                for(Proyecto p : arrayP){
                    System.out.println((arrayP.indexOf(p)+1) + ") Proyecto con con nombre único " + p.nombreUnicoTarea);  
                    System.out.print("   Fecha de inicio de obra: ");
                    
                    //Se imprimen las fechas solo si validas
                    if(p.fechaInicio.isAfter(LocalDate.of(1000, 01, 01))){
                        System.out.println(p.fechaInicio.toString() + ",");
                    } else {
                        System.out.println("no definida,");
                    } 
                    
                    System.out.print("   Fecha de fin de obra: ");                
                    if(p.fechaFinObra.isAfter(LocalDate.of(1000, 01, 01))){
                        System.out.println(p.fechaFinObra.toString() + ".");
                    } else {
                        System.out.println("no definida.");
                    }
                }
                
                System.out.println("Quieres modificar las fechas de un proyecto? S/N");
                str1 = estudio.sc.nextLine();
                
                //Solo si el usuario desea modificar fechas, se ejecuta este bloque
                if(str1.equals("S")){
                    System.out.println("Indica el número del proyecto en el calendario:");
                    int1 = Integer.parseInt(estudio.sc.nextLine());
                    
                    //Solo si el número introducido es valido
                    if(int1 >= 1 && int1 <= arrayP.size()){
                        System.out.println("Indica la nueva fecha de inicio de la obra con formato aaaa-mm-dd:");
                        arrayP.get(int1 -1).fechaInicio = LocalDate.parse(estudio.sc.nextLine());
                        System.out.println("Indica la nueva fecha de fin de la obra con formato aaaa-mm-dd:");
                        arrayP.get(int1 -1).fechaFinObra = LocalDate.parse(estudio.sc.nextLine());
                    } else {
                        System.out.println("No se ha encontrado un proyecto con ese número.");
                    }
                    
                }
            } catch(Exception e) {
                System.out.println("Error en los datos. Por favor, realiza otro intento.");
            } 
        }
    
}
