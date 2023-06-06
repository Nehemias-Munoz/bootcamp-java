package modelos.profesional;

import modelos.usuario.Usuario;

import java.time.LocalDate;

public class Profesional extends Usuario {

    private String titulo;
    private LocalDate fechaIngreso;

    /**
     * Constructor vacio
     */
    public Profesional() {
    }

    /**
     * Constructor de la clase
     *
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String titulo, LocalDate fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Constructor de la clase con herencia
     *
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String nombre, LocalDate fechaNacimiento, String run, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Metodo que muestra por consola los datos propios y los del padre
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}');
    }
}
