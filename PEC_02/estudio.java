/**
 * Clase principal del proyecto de gestión del estudio de arquitectura
 * 
 * @Serena Lombardi Y5282149Y 
 * @version 2
 */

import java.util.Scanner;
import java.util.ArrayList;

public class estudio
{
    //Campos
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
     * Submenu de administrador: permite elegir qué función de Admin se quiere realizar
     */    
    public static void submenuAdmin()
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
    public static void submenuArqui()
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
                    //se solicita DNI porque el método se ejecuta desde main y no desde un objeto con DNI propio
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
    public static void submenuApa()
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
                    //se solicita DNI porque el método se ejecuta desde main y no desde un objeto con DNI propio
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
    public static void submenuCont()
    {
        //Placeholder
        System.out.println("Submenu contable.");
    }
     
    /**
     * Menu principal
     */    
    public static void Menu()
    {
        int aux1;
        String str1;        
        boolean running = true;        
        
        //bucle do while para controlar que se vuelva a ejecutar el menu si el usuario lo desea
        do {
            try{   
                System.out.println("Bienvenido al Sistema Integrado de Gestión de Estudio de Arquitectura:");
                System.out.println("Qué tipo de usuario eres?");
                System.out.println("1: Administrador, 2: Arquitecto, 3: Aparejador, 4: Contable");
                aux1 = Integer.parseInt(sc.nextLine());
                
                switch(aux1) {
                    case 1:
                        submenuAdmin();
                        break;
                    case 2:
                        submenuArqui();
                        break;
                    case 3:
                        submenuApa();
                        break;
                    case 4:
                        submenuCont();
                        break;
                    default:
                        throw new Exception();
                }
                
                //Si se teclea S, se ejecuta de nuevo; con cualquier otro String, se cierra el programa
                System.out.println("Quieres realizar otra operación? S/N");
                str1 = sc.nextLine();
                
                if(!(str1.equals("S"))){
                    running = false;
                    System.out.println("Se cerrará el programa.");
                }
             }catch (Exception e){
                //Al detectar una excepción, se ofrece al usuario la posibilidad de seguir usando el programa
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
    
        Menu();   
    }
}
