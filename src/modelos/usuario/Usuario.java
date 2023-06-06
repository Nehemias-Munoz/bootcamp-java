package modelos.usuario;

import interfaces.Asesoria;

import java.time.LocalDate;

/**
 * @author nehemiasmunoz
 */
public class Usuario implements Asesoria {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String run;

    /**
     * Constructor vacio
     */
    public Usuario() {
    }

    /**
     * Constructor con parametros
     *
     * @param nombre
     * @param fechaNacimiento
     * @param run
     */
    public Usuario(String nombre, LocalDate fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;

    }

    /**
     * Metodo que devuelve los parametros y valores de clase
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    /**
     * Metodo que retorna la edad del modelos.usuario basado en la fecha que se entrego
     *
     * @return Mensaje con los años del modelos.usuario
     */
    public String mostrarEdad() {
        StringBuilder mensaje = new StringBuilder("El modelos.usuario tiene ");
        LocalDate lc = LocalDate.now();
        int anioActual = lc.getYear();
        int edad = anioActual - fechaNacimiento.getYear();
        mensaje.append(edad);
        mensaje.append(" años.");
        return mensaje.toString();
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}');
    }
}