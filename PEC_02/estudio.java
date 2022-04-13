
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
     /**
     * Menu
     */
    
    public static void Menu()
    {
        String str1;        
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Elige una letra:");
            str1 = sc.nextLine();
            
            //elección de subprograma
            
            if(str1.equals("N")){
                running = false;
                System.out.println("Pos ya estaría");
            }
        }     
        while (running);
        
        
        
    }
        
    
    /**
     * Main
     */
    
    public static void main(String[] args)
    {
        Menu();        
    }
}
