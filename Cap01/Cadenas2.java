/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

/**
 *
 * @author Oscar
 */
public class Cadenas2 {
    public static void main(String[]args)
    {
        String s = "Esto es una cadena de caracteres";
        
        int pos1 = s.indexOf('c');
        int pos2 =s.lastIndexOf('c');
        int pos3 = s.indexOf('x');
        
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}
