/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;
/**
 *
 * @author Oscar
 */
public class HolaMundoNombre {
  public static void main(String[]args)
  {
      Scanner miScanner = new Scanner(System.in);
      System.out.print("Escriba su nombre:  ");
      String nombre = miScanner.nextLine();
      System.out.println("Hola Mundo:   "+ nombre);
  }
    
}
