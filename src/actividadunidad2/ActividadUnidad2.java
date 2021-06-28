/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadunidad2;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class ActividadUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t1= new Scanner (System.in);
        Scanner t2= new Scanner (System.in);
        
        String nombre="";
        String apellido="";
        int edad =0;
        String hobby="";
        String editorCodigo="";
        
        System.out.println("Ingrese nombre");
        nombre=t1.nextLine();
        
        System.out.println("Ingrese apellido");
        apellido=t1.nextLine();
        
        System.out.println("Ingrese edad");
        edad=t2.nextInt();
        
        System.out.println("Ingrese hobby");
        hobby=t1.nextLine();
        
        System.out.println("Ingrese editor de codigo favorito");
        editorCodigo=t1.nextLine();
        
        System.out.println("El alumno "+nombre+" "+apellido+" de edad "+edad+". le gusta programar con el editor "+editorCodigo+" y su hobby es "+hobby );
        
    }
    
}
