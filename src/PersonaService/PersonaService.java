package PersonaService;

import Entidad_Persona.Persona;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class PersonaService {
    public Persona crearPersona(){
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre(JOptionPane.showInputDialog("Escriba el nombre "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el número de día de nacimiento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el número de mes de nacimiento"));
        int anio= Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el número de año de nacimiento"));
        nuevaPersona.setFechaNacimiento(LocalDate.of(anio, mes, dia));
        return nuevaPersona;
    }
    public int calcularEdad(Persona x){
        LocalDate fechaActual = LocalDate.now();
        return (int)(fechaActual.getYear()) - (int)(x.getFechaNacimiento().getYear());
    }
    public void menorQue(Persona x, int y){
        if (calcularEdad(x)<y) {
            JOptionPane.showMessageDialog(null, "TRUE: La persona sí es menor de "+ y +" años");
            System.out.println("TRUE: La persona sí es menor de "+ y +" años");            
        } else {
            JOptionPane.showMessageDialog(null, "FALSE: La persona no es menor de "+y+" años");
            System.out.println("FALSE: La persona no es menor de "+y+" años");
        }
    }
    public void mostrarPersona(Persona x){
        JOptionPane.showMessageDialog(null, "Los datos de la persona son: " + x.toString());
        System.out.println("Los datos de la persona son: " + x.toString());
    }
}
