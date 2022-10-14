/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 * Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 * Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 * Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package java_poo_ej12_guia7;

import Entidad_Persona.Persona;
import PersonaService.PersonaService;
import javax.swing.JOptionPane;

public class JAVA_POO_Ej12_Guia7 {

    public static void main(String[] args) {
       
        PersonaService ps = new PersonaService();
        
        Persona persona1 = ps.crearPersona();
        
        JOptionPane.showMessageDialog(null, "La edad de esta persona es: "+ps.calcularEdad(persona1)+" años");
        System.out.println("La edad de esta persona es: "+ps.calcularEdad(persona1)+" años");
        
        int anio= Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese una edad en nro de años para ver si la persona es menor a esa edad"));
        
        ps.menorQue(persona1, anio);
        
        ps.mostrarPersona(persona1);
    }
    
}
