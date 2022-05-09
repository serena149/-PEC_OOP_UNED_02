/**
 * Clase principal del proyecto de gestión del estudio de arquitectura
 * 
 * @Serena Lombardi Y5282149Y 
 * @version 2
 */

import java.util.Scanner;
import java.util.ArrayList;
//DEBUG BORRAR
import java.time.LocalDate;
//FIN DEBUG BORRAR

public class estudio
{
    public static ArrayList<Tarea> datosTareas;    
    public static ArrayList<Persona> datosPersonas;
    public static Scanner sc;
        
    /**
     * Constructor
     */
    public estudio()
    {
        //Se inicializan las variables si se decide crear el objeto en bluej
        datosTareas = new ArrayList<Tarea>();
        datosPersonas = new ArrayList<Persona>();
        sc = new Scanner(System.in);        
    } 
    
    /**
     * Submenu de administrador
     */    
    public static void submenuAdmin(Scanner sc)
    {
        int aux1;
        Admin ad = new Admin("");
        
        try{
            System.out.println("Indica qué operación deseas realizar:");
            System.out.println("0: alta de usuario, 1: baja de usuario, 2: modificación de usuario,");
            System.out.println("3: asignación de tareas a los empleados, 4: visualización de todos los usuarios,");
            System.out.println("5: listado de clientes por cada arquitecto y aparejador,");         
            System.out.println("6: listado de viviendas/edificios y fechas de fin de obra,");
            System.out.println("7: listado de viviendas/edificios y fechas de último certificado de habitabilidad,");
            System.out.println("8: consulta y gestión del calendario.");
            
            aux1 = Integer.parseInt(sc.nextLine());
            
            switch(aux1){
                case 0:
                    ad.altaUsuario();
                    break;
                case 1:
                    ad.bajaUsuario();
                    break;
                case 2:
                    ad.modUsuario();
                    break;
                case 3:
                    ad.asignarEmpleado();
                    break;
                case 4:
                    ad.mostrarTodosDatos();
                    break;
                case 5:
                    ad.mostrarClientes();
                    break;
                case 6:
                    ad.mostrarFechaFinObra();
                    break;
                case 7:
                    ad.mostrarCertHabit();
                    break;
                case 8:    
                    ad.gestionCalendario();
                    break;
                default:
                    throw new Exception();
            }
        } catch(Exception e) {
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
        } 
    }
    
     /**
     * Submenu de arquitecto
     */    
    public static void submenuArqui(Scanner sc)
    {
        int aux1;
        Arquitecto arq = new Arquitecto("");
        String DNIInput;
        
        try{
            System.out.println("Indica qué operación deseas realizar:");
            System.out.println("0: registro de proyecto o certificado, 1: actualización de proyecto o certificado, 2: visualización de clientes asignados");
            aux1 = Integer.parseInt(sc.nextLine());
                        
            switch(aux1){
                case 0:
                    arq.altaTarea();
                    break;
                case 1:
                    arq.modTarea();
                    break;
                case 2:
                    System.out.println("Indica el DNI o NIE del arquitecto:");
                    DNIInput = sc.nextLine();
                    arq.DNIoNIE = DNIInput;
                    arq.mostrarClientesArq();
                    break;
                default:
                    throw new Exception(); 
            }
        } catch(Exception e) {
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
        } 
    }
    
    /**
     * Submenu de aparejador
     */    
    public static void submenuApa(Scanner sc)
    {
        int aux1;
        Aparejador ap = new Aparejador("");
        String DNIInput;
        
        try{
            System.out.println("Indica qué operación deseas realizar:");
            System.out.println("0: visualización de clientes asignados.");
            aux1 = Integer.parseInt(sc.nextLine());
            
            switch(aux1){
                case 0:
                    System.out.println("Indica el DNI o NIE del aparejador:");
                    DNIInput = sc.nextLine();
                    ap.DNIoNIE = DNIInput;
                    ap.mostrarClientesApa();
                    break;
                default:
                    throw new Exception(); 
            }
        } catch(Exception e) {
            System.out.println("Error en los datos. Por favor, realiza otro intento.");
        } 
    }  
     
    /**
     * Submenu de contable
     */    
    public static void submenuCont(Scanner sc)
    {
        System.out.println("Submenu contable");
    }
     
    /**
     * Menu principal
     */    
    public static void Menu(Scanner sc)
    {
        int aux1;
        String str1;        
        boolean running = true;        
                
        do {
            try{   
                System.out.println("Bienvenido al Sistema Integrado de Gestión de Estudio de Arquitectura:");
                System.out.println("Qué tipo de usuario eres?");
                System.out.println("1: Administrador, 2: Arquitecto, 3: Aparejador, 4: Contable");
                aux1 = Integer.parseInt(sc.nextLine());
                
                switch(aux1) {
                    case 1:
                        submenuAdmin(sc);
                        break;
                    case 2:
                        submenuArqui(sc);
                        break;
                    case 3:
                        submenuApa(sc);
                        break;
                    case 4:
                        submenuCont(sc);
                        break;
                    default:
                        throw new Exception();
                }
                
                System.out.println("Quieres realizar otra operación? S/N");
                str1 = sc.nextLine();
                
                if(!(str1.equals("S"))){
                    running = false;
                    System.out.println("Se cerrará el programa.");
                }
             }catch (Exception e){
                System.out.println("Se ha detectado un error en el dato introducido.");
                System.out.println("Quieres realizar otra operación? S/N");
                str1 = sc.nextLine();
                
                if(!(str1.equals("S"))){
                    running = false;
                    System.out.println("Se cerrará el programa.");
                }
            }               
        }     
        while (running);              
        
    }
        
    
    /**
     * Main del programa
     */
    
    public static void main(String[] args)
    {   
        //Se inicializan las variables si se decide usar main       
        datosTareas = new ArrayList<Tarea>();
        datosPersonas = new ArrayList<Persona>();
        sc = new Scanner(System.in);
        
        //CODIGO DEBUG BORRAR
        datosPersonas.add(new Cliente("1"));
        datosPersonas.get(0).nombre = "Sere";
        datosPersonas.get(0).ape1 = "N";
        datosPersonas.get(0).ape2 = "A";
        
        datosPersonas.add(new Cliente("2"));
        datosPersonas.get(1).nombre = "Fe";
        datosPersonas.get(1).ape1 = "Li";
        datosPersonas.get(1).ape2 = "Pe";
        
        datosPersonas.add(new Cliente("3"));
        datosPersonas.get(2).nombre = "Ismael";
        datosPersonas.get(2).ape1 = "Perez";
        datosPersonas.get(2).ape2 = "Serrano";
        
        datosPersonas.add(new Cliente("4"));
        datosPersonas.get(3).nombre = "Barbara";
        datosPersonas.get(3).ape1 = "Maga";
        datosPersonas.get(3).ape2 = "";
        
        datosPersonas.add(new Cliente("5"));        
        datosPersonas.get(4).nombre = "Me";
        datosPersonas.get(4).ape1 = "Quivo";
        datosPersonas.get(4).ape2 = "Cao";
        
        datosPersonas.add(new Arquitecto("a"));
        datosPersonas.get(5).nombre = "Antonio";
        datosPersonas.get(5).ape1 = "Arqui";
        datosPersonas.get(5).ape2 = "Tecto";        
        
        datosPersonas.add(new Arquitecto("b"));
        datosPersonas.get(6).nombre = "Ter";
        datosPersonas.get(6).ape1 = "Arqui";
        datosPersonas.get(6).ape2 = "Ter";
        
        datosPersonas.add(new Arquitecto("c"));
        datosPersonas.get(7).nombre = "Esther";
        datosPersonas.get(7).ape1 = "Dos";
        datosPersonas.get(7).ape2 = "";
        
        datosPersonas.add(new Arquitecto("d"));
        datosPersonas.get(8).nombre = "Otro";
        datosPersonas.get(8).ape1 = "Arqui";
        datosPersonas.get(8).ape2 = "Tecto";
        
        datosPersonas.add(new Arquitecto("e"));
        datosPersonas.get(9).nombre = "Ultimo";
        datosPersonas.get(9).ape1 = "Arqui";
        datosPersonas.get(9).ape2 = "Tecto";
        
        datosPersonas.add(new Aparejador("x"));
        datosPersonas.get(10).nombre = "Mendoza";
        datosPersonas.get(10).ape1 = "Oza";
        datosPersonas.get(10).ape2 = "Oza";
                
        datosPersonas.add(new Aparejador("y"));
        datosPersonas.get(11).nombre = "Quere";
        datosPersonas.get(11).ape1 = "Se";
        datosPersonas.get(11).ape2 = "Res";        
        
        datosTareas.add(new Edificio("Descripcion del edificio"));
        datosTareas.get(0).DNIcliente = "1";
        datosTareas.get(0).DNIarquitecto = "a";
        datosTareas.get(0).DNIaparejador = "x";
        datosTareas.get(0).fechaSolicitud = LocalDate.parse("2022-05-23");
        Proyecto borrar = (Proyecto) datosTareas.get(0); //es una referencia
        //borrar.fechaInicio = LocalDate.parse("2020-12-08");
        //borrar.fechaFinObra = LocalDate.parse("2022-05-23");        
        Residencial borrarRes = (Residencial) datosTareas.get(0);
        
        Habitabilidad hab1 = new Habitabilidad(""); //pruebas para metodo del cert de habitabilidad
        hab1.fechaEmision = LocalDate.of(2000, 01, 05);
        borrarRes.historicoCert.add(hab1);
        hab1 = new Habitabilidad("");
        hab1.fechaEmision = LocalDate.of(2010, 01,05);
        borrarRes.historicoCert.add(hab1);
        hab1 = new Habitabilidad("");
        hab1.fechaEmision = LocalDate.of(2015, 01, 05);
        borrarRes.historicoCert.add(hab1);
                        
        datosTareas.add(new Unifamiliar("Descripcion del unifamiliar"));
        datosTareas.get(1).DNIcliente = "1";
        datosTareas.get(1).DNIarquitecto = "a";
        datosTareas.get(1).DNIaparejador = "x";
        datosTareas.get(1).fechaSolicitud = LocalDate.parse("2022-05-23");
        datosTareas.get(1).realizado = true;    
        borrar = (Proyecto) datosTareas.get(1); //es una referencia
        borrar.fechaInicio = LocalDate.parse("2024-11-05");
        borrar.fechaFinObra = LocalDate.parse("2025-01-31");
                
        datosTareas.add(new Nave("Descripcion de la nave"));
        datosTareas.get(2).DNIcliente = "2";
        datosTareas.get(2).DNIarquitecto = "b";
        datosTareas.get(2).DNIaparejador = "x";
        datosTareas.get(2).fechaSolicitud = LocalDate.parse("2022-07-23");
        borrar = (Proyecto) datosTareas.get(2); //es una referencia
        borrar.fechaInicio = LocalDate.parse("1999-08-16");
        borrar.fechaFinObra = LocalDate.parse("2000-05-26");
        
        datosTareas.add(new Museo("Descripcion museo"));
        datosTareas.get(3).DNIcliente = "2";
        datosTareas.get(3).DNIarquitecto = "b";
        datosTareas.get(3).fechaSolicitud = LocalDate.parse("2022-07-23");
        borrar = (Proyecto) datosTareas.get(3); //es una referencia
        borrar.fechaInicio = LocalDate.parse("2015-03-19");
        borrar.fechaFinObra = LocalDate.parse("2016-11-14");
        
        datosTareas.add(new OtraNoRes("Descripcion OtraNoRes"));
        datosTareas.get(4).DNIcliente = "3";
        datosTareas.get(4).DNIarquitecto = "c";
        datosTareas.get(4).fechaSolicitud = LocalDate.parse("2022-01-01");
        datosTareas.get(4).realizado = true;
        borrar = (Proyecto) datosTareas.get(4); //es una referencia
        borrar.fechaInicio = LocalDate.parse("2019-04-15");
        borrar.fechaFinObra = LocalDate.parse("2020-03-13");
        
        datosTareas.add(new Rehabilitacion("Descripcion rehabilitacion"));
        datosTareas.get(5).DNIcliente = "3";
        datosTareas.get(5).DNIarquitecto = "c";
        datosTareas.get(5).fechaSolicitud = LocalDate.parse("2022-01-01");
        borrar = (Proyecto) datosTareas.get(5); //es una referencia
        borrar.fechaInicio = LocalDate.parse("2021-01-31");
        borrar.fechaFinObra = LocalDate.parse("2021-03-13");
        
        datosTareas.add(new Habitabilidad("Descripcion certif habitabilidad"));
        datosTareas.get(6).DNIcliente = "4";
        datosTareas.get(6).DNIarquitecto = "d";
        datosTareas.get(6).fechaSolicitud = LocalDate.parse("2022-04-04");
        
        datosTareas.add(new ITE("Descripcion certif ITE"));
        datosTareas.get(7).DNIcliente = "4";
        datosTareas.get(7).DNIarquitecto = "d";
        datosTareas.get(7).DNIaparejador = "x";
        datosTareas.get(7).fechaSolicitud = LocalDate.parse("2022-04-04");
        
        datosTareas.add(new EfEnergetica("Descripcion certif EfEnergetica"));
        datosTareas.get(8).DNIcliente = "5";
        datosTareas.get(8).DNIarquitecto = "e";
        datosTareas.get(8).fechaSolicitud = LocalDate.parse("2022-01-04");
                
        datosTareas.add(new Pericial("Descripcion inf pericial"));
        datosTareas.get(9).DNIcliente = "5";
        datosTareas.get(9).DNIarquitecto = "e";
        datosTareas.get(9).DNIaparejador = "x";
        datosTareas.get(9).fechaSolicitud = LocalDate.parse("2022-01-04");    
        
        //FIN DEBUG BORRAR        
        
        
        Menu(sc);   
    }
}
