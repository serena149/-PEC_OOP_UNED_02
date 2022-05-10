
/**
 *Arquitecto
 */

import java.time.LocalDate;

public class Arquitecto extends Empleado
{
    //No hay de momento campos propios de Arquitecto
        
    /**
     * Constructor
     */
    public Arquitecto(String nif)
    {
        //Se inicializan las variables heredadas de Persona
        DNIoNIE = nif;
        IDtipo = 2;
        
        nombre = "";
        ape1 = "";
        ape2 = "";
    }

    /**
     * Visualización de datos de los clientes asignados (proyectos, certificados y ejecución de obras contratadas).
     */
    public void mostrarClientesArq()
    {
        boolean hayTareas = false;
        
        try{
            System.out.println("Listado de clientes con proyectos o certificados asignados a este arquitecto:");
            
            //Se recorre el array de personas
            for (Persona p : estudio.datosPersonas){
                //Si se trata de un cliente, se imprimen sus datos
                if(p.IDtipo == 0){  
                    System.out.println("    Cliente con DNI o NIE " + p.DNIoNIE + ", " + p.nombre + " " + p. ape1 + " " + p.ape2);
                    //Se recorre el array de tareas
                    for (Tarea t : estudio.datosTareas){
                        //Si la tarea está asignada al cliente en cuestión y al arquitecto del que se buscan los clientes, se imprimen los datos
                        if(t.DNIcliente.equals(p.DNIoNIE) && t.DNIarquitecto.equals(DNIoNIE)){
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
        }        
    }
    
    /**
     * Registro de proyectos arquitectónicos y certificados.
     */
    public void altaTarea()
    {
        int aux1;
        LocalDate fechaInput1;
        String nombreInput;
        String DNIInput;        
        String DNIInput2; 
        boolean clienteExiste = false;
        boolean arquiExiste = false;
        LocalDate fechaInput2;
        Residencial res1;
        NoResidencial noRes1;
        Habitabilidad hab1;
        
        try {                 
            System.out.println("Indica un nombre unico para el proyecto que estás dando de alta:");
            nombreInput = estudio.sc.nextLine();
            
            //Se comprueba que el nombre sea único          
            for (Tarea t : estudio.datosTareas) {
                if(t.nombreUnicoTarea.equals(nombreInput)){
                        throw new Exception();
                    }
                }
                        
            System.out.println("Indica una fecha de solicitud con formato aaaa-mm-dd");
            fechaInput1 = LocalDate.parse(estudio.sc.nextLine());
            
            System.out.println("Indica el DNI del cliente");
            DNIInput = estudio.sc.nextLine(); 
            
            //Se comprueba que el cliente exista            
            for (Persona p : estudio.datosPersonas) {
                    if(p.DNIoNIE.equals(DNIInput) && p.IDtipo == 0){
                        clienteExiste = true;
                    }
                }
            
            if(!clienteExiste){
                throw new Exception();
            }
            
            //Se asigna a un arquitecto.
            //El resto de asignaciones de empleados (contable etc) las gestiona el admin según el enunciado, por lo que aquí se dejan vacías.
        
            System.out.println("Indica el DNI del arquitecto");
            DNIInput2 = estudio.sc.nextLine();   
            
            //Se comprueba que el arquitecto exista 
            for (Persona p : estudio.datosPersonas) {
                    if((p.DNIoNIE.equals(DNIInput2) && p.IDtipo == 2)){
                        arquiExiste = true;
                    }
                }
                
            if(!clienteExiste){
                throw new Exception();
            }
            
            //Se crea un objeto del tipo solicitado por el usuario
            System.out.println("Indica qué tipo de proyecto o certificado deseas dar de alta:");
            System.out.println("0: edificio, 1: vivienda unifamiliar, 2: nave, 3: museo, 4: otro no residencial, 5: rehabilitación");
            System.out.println("6: certificado de habitabilidad, 7: ITE, 8: eficiencia energetica, 9: informe pericial");
            aux1 = Integer.parseInt(estudio.sc.nextLine());
                    
            switch(aux1) {
                case 0:
                    estudio.datosTareas.add(new Edificio(nombreInput));
                    break;
                case 1:
                    estudio.datosTareas.add(new Unifamiliar(nombreInput));
                    break;
                case 2:
                    estudio.datosTareas.add(new Nave(nombreInput));
                    break;
                case 3:
                    estudio.datosTareas.add(new Museo(nombreInput));
                    break;
                case 4:
                    estudio.datosTareas.add(new OtraNoRes(nombreInput));
                    break;
                case 5:
                    estudio.datosTareas.add(new Rehabilitacion(nombreInput));
                    break;
                case 6:
                    estudio.datosTareas.add(new Habitabilidad(nombreInput));
                    break;
                case 7:
                    estudio.datosTareas.add(new ITE(nombreInput));
                    break;
                case 8:
                    estudio.datosTareas.add(new EfEnergetica(nombreInput));
                    break;
                case 9:
                    estudio.datosTareas.add(new Pericial(nombreInput));
                    break;
                default:
                    throw new Exception();                    
                }
                                        
                
            for (Tarea t : estudio.datosTareas){
                if(t.nombreUnicoTarea.equals(nombreInput)){
                    t.fechaSolicitud = fechaInput1;
                    t.DNIcliente = DNIInput;
                    t.DNIarquitecto = DNIoNIE;
                    
                    //Si se trata de un edificio/vivienda, se solicita y se graba también la fecha de emisión del certificado de habitabilidad más reciente:
                    if(aux1 <= 4){
                        System.out.println("Indica la fecha del certificado de habitabilidad más reciente con formato aaaa-mm-dd");
                        fechaInput2 = LocalDate.parse(estudio.sc.nextLine());
                        if(aux1 <= 1){
                            //Se realiza un casteo a Residencial para poder acceder al array de certificados. Se añade un elemento y se modifica la fecha.
                            res1 = (Residencial) t;
                            res1.historicoCert.add(new Habitabilidad(""));
                            hab1 = (Habitabilidad) res1.historicoCert.get(res1.historicoCert.size() - 1);
                            hab1.fechaEmision = fechaInput2;
                        } else if(aux1 >= 2 && aux1 <= 4){
                            //Se realiza un casteo a NoResidencial para poder acceder al array de certificados. Se añade un elemento y se modifica la fecha.
                            noRes1 = (NoResidencial) t;
                            noRes1.historicoCert.add(new Habitabilidad(""));
                            hab1 = (Habitabilidad) noRes1.historicoCert.get(noRes1.historicoCert.size() - 1);
                            hab1.fechaEmision = fechaInput2;
                        }
                    }                  
                    
                    System.out.println("La tarea se ha grabado correctamente.");
                }                
            } 
            
            } catch (Exception e) {
                System.out.println("Error en los datos. Por favor, realiza otro intento.");
            }
    }
    
    
    /**
     * Actualización de proyectos arquitectónicos y certificados.
     */
    public void modTarea()
    {
        String nombreInput;
        boolean tareaExiste = false;
        boolean clienteExiste = false;
        LocalDate fechaInput1;
        String DNIInput;
        String realizadoString;
    
        try{
            System.out.println("Indica el nombre único de la tarea que quieres modificar");
            nombreInput = estudio.sc.nextLine();
            
            //Se comprueba que la tarea exista
            for (Tarea t : estudio.datosTareas){
                if (t.nombreUnicoTarea.equals(nombreInput)){
                    tareaExiste = true;
                }
            }
            
            if(!tareaExiste){
                throw new Exception();                
            }
            
            System.out.println("Indica la nueva fecha de solicitud");
            fechaInput1 = LocalDate.parse(estudio.sc.nextLine());
            
            System.out.println("Indica el DNI del nuevo cliente");
            DNIInput = estudio.sc.nextLine(); 
            
            //Se comprueba que el cliente exista
            for (Persona p : estudio.datosPersonas) {
                    if((p.DNIoNIE.equals(DNIInput) && p.IDtipo == 0)){
                        clienteExiste = true;
                    }
                }
            
            if(!clienteExiste){
                throw new Exception();
            }
            
            System.out.println("Se trata de una tareas realizada? S/N");
            realizadoString = estudio.sc.nextLine();
            
            for (Tarea t : estudio.datosTareas){
                if(t.nombreUnicoTarea.equals(nombreInput)){
                    t.fechaSolicitud = fechaInput1;
                    t.DNIcliente = DNIInput;                    
                    
                    if(realizadoString.equals("S")){
                        t.realizado = true;
                    }
                    
                    System.out.println("La tarea se ha grabado correctamente.");
                }                
            }            
            
            } catch (Exception e) {
                System.out.println("Error en los datos. Por favor, realiza otro intento.");
            }
        }
    }