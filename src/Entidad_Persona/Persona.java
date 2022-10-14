package Entidad_Persona;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate f) {
        this.fechaNacimiento = f;
    }

    @Override
    public String toString() {
        return "Persona {" + "Nombre = " + nombre + ", Fecha de Nacimiento = " + fechaNacimiento + '}';
    }
}
