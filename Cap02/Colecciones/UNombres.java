/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.colecciones;
import java.util.Collection;
import java.util.Vector;
/**
 *
 * @author Oscar
 */
public class UNombres {
    public static Collection<String> obtenerLista()
 {
 Vector<String> v = new Vector<String>();
 v.add("Pablo");
 v.add("Juan");
 v.add("Carlos");
 return v;
 }
}
