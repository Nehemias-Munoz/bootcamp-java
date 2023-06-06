package modelos.administrativo;

import modelos.usuario.Usuario;

import java.time.LocalDate;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    // No se solicita pero sera necesario

    /**
     * Constructor vacio
     */
    public Administrativo() {
    }

    /**
     * Constructor de la clase
     *
     * @param nombre
     * @param fechaNacimiento
     * @param run
     */
    public Administrativo(String nombre, LocalDate fechaNacimiento, String run) {
        super(nombre, fechaNacimiento, run);
    }

    /**
     * Constructor de la clase con herencia
     *
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param area
     * @param experienciaPrevia
     */
    public Administrativo(String nombre, LocalDate fechaNacimiento, String run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    //Getter and Settter
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * Metodo que muestra por consola los datos propios y los del padre
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}');
    }

}
