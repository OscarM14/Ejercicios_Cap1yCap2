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
public class ParOIMpar2 {
    public static void main (String[]args)
    {
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Ingrese un valor: ");
      int v = scanner .nextInt();
      
      int resto = v%2;
      
      String mssg =(resto==0)?"Es Par": "Es Impar";
       
      System.out.println(v+" "+mssg);
    }
    
}
