/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraactividad;
import java.util.Scanner;
/**
 *
 * @author DEVELOPER
 */
public class Primeraactividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
System.out.println("Ingrese su nombre;");
String nom=scanner.nextLine();

Scanner apellido=new Scanner(System.in);
System.out.println("Ingrese su apellido: ");
String apell=apellido.nextLine();

Scanner editor=new Scanner(System.in);
System.out.println("Ingrese su editor de codigo preferido:");
String edit=editor.nextLine();

Scanner sistema=new Scanner(System.in);
System.out.println("Ingrese su sistema operativo:");
String sist=sistema.nextLine();


 // TODO code application logic here
    }
    
}
