
/**
 *Arquitecto
 */

import java.time.LocalDate;

public class Arquitecto extends Empleado
{
    // instance variables    

    /**
     * Constructor
     */
    public Arquitecto(String nif)
    {
        DNIoNIE = nif;
        IDtipo = 2;
    }

    /**
     * Visualización de datos de los clientes asignados (proyectos, certificados y ejecución de obras contratadas).
     */
    public void mostrarClientesArq()
    {
        // put your code here        
        
    }
    
    /**
     * Registro de proyectos arquitectónicos y certificados.
     */
    public void altaTarea()
    {
        //Se autoasigna al arquitecto que realiza el alta; luego el admin puede asignarlo a otro profesional si así desea.
        //El resto de asignaciones de empleados (contable etc) las gestiona el admin según el enunciado, por lo que aquí se dejan vacías.
        
        int aux1;
        LocalDate fechaInput1;
        Cliente clienteInput;
        String nombreInput;
        String DNIInput;        
        boolean clienteExiste = false;
        
        
        
        //DEBUG BORRAR
        estudio.datosPersonas.add(new Cliente("611616776"));    
        //FIN DEBUG BORRAR
            
            
        
        
        
        
        try {                 
            System.out.println("Indica una fecha de solicitud con formato aaaa-mm-dd");
            fechaInput1 = LocalDate.parse(estudio.sc.nextLine());
            
            System.out.println("Indica un nombre unico para el proyecto que estás dando de alta:");
            nombreInput = estudio.sc.nextLine();
            
            for (Tarea t : estudio.datosTareas) {
                if(t.nombreUnicoTarea.equals(nombreInput)){
                        throw new Exception();
                    }
                }
            
            
            System.out.println("Indica el DNI del cliente");
            DNIInput = estudio.sc.nextLine();   
                        
            for (Persona p : estudio.datosPersonas) {
                    if((p.DNIoNIE.equals(DNIInput) && p.IDtipo == 0)){
                        clienteExiste = true;
                    }
                }
            
            if(!clienteExiste){
                throw new Exception();
            }
            
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
                    System.out.println("La tarea se ha grabado correctamente.");
                }                
            }            
                  
            
            } catch (Exception e) {
                System.out.println("Error en los datos. Por favor, realiza otro intento.");
            }
    }
    
    
    /**
     * Actualización de proyectos arquitectónicos y certifcados.
     */
    public void modTarea()
    {
        //Al actualizar el proyecto o certificado, se asigna al arquitecto que realiza los cambios.
        
        String nombreInput;
        boolean tareaExiste = false;
        boolean clienteExiste = false;
        LocalDate fechaInput1;
        String DNIInput;
    
        try{
            System.out.println("Indica el nombre único de la tarea que quieres modificar");
            nombreInput = estudio.sc.nextLine();
            
            for (Tarea t : estudio.datosTareas){
                if (t.nombreUnicoTarea.equals(nombreInput)){
                    tareaExiste = true;
                }
            }
            
            if(!tareaExiste){
                System.out.println("Exception?");
                throw new Exception();                
            }
            
            System.out.println("Indica la nueva fecha de solicitud");
            fechaInput1 = LocalDate.parse(estudio.sc.nextLine());
            System.out.println("Indica el DNI del nuevo cliente");
            DNIInput = estudio.sc.nextLine(); 
            
            for (Persona p : estudio.datosPersonas) {
                    if((p.DNIoNIE.equals(DNIInput) && p.IDtipo == 0)){
                        clienteExiste = true;
                    }
                }
            
            if(!clienteExiste){
                throw new Exception();
            }
            
            for (Tarea t : estudio.datosTareas){
                if(t.nombreUnicoTarea.equals(nombreInput)){
                    t.fechaSolicitud = fechaInput1;
                    t.DNIcliente = DNIInput;
                    t.DNIarquitecto = DNIoNIE;    
                    System.out.println("La tarea se ha grabado correctamente.");
                }                
            }            
            
            } catch (Exception e) {
                System.out.println("Error en los datos. Por favor, realiza otro intento.");
            }
        }
        
    }