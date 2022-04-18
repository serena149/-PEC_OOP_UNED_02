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
            System.out.println("0: alta de usuario, 1: baja de usuario, 2: modificación de usuario, 3: asignación de tareas a los empleados");
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
        
        try{
            System.out.println("Indica qué operación deseas realizar:");
            System.out.println("0: registro de proyecto o certificado, 1: actualización de proyecto o certificado");
            aux1 = Integer.parseInt(sc.nextLine());
            
            switch(aux1){
                case 0:
                    arq.altaTarea();
                    break;
                case 1:
                    arq.modTarea();
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
        System.out.println("Placeholder del submenu de aparejador");
    }  
     
    /**
     * Submenu de contable
     */    
    public static void submenuCont(Scanner sc)
    {
        System.out.println("Placeholder del submenu de contable");
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
        
        Menu(sc);   
    }
}
