package usuario;

import java.time.LocalDate;

/**
 * @author nehemiasmunoz
 *
 */
public class Usuario {

    private String nombre;
    private String fechaNacimiento;
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
    public Usuario(String nombre, String fechaNacimiento, String run) {
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String mostrarEdad() {
        StringBuilder mensaje = new StringBuilder("El usuario tiene ");
        LocalDate lc = LocalDate.now();
        int anioActual = lc.getYear();
        int edad = anioActual - LocalDate.parse(fechaNacimiento).getYear();
        mensaje.append(edad);
        mensaje.append(" años.");
        return mensaje.toString();
    }
}