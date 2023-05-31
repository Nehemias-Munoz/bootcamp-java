package trabajadores.tipo;

import javax.swing.JOptionPane;

import trabajadores.Trabajador;

/**
 * @author nehemiasmunoz
 *         Clase que extiende de trabajador general y agrega 2 atributos nuevos
 */
public class TrabajadorEventual extends Trabajador {
    // atributos de la clase
    private String disponibilidad;
    private String correoElectronico;

    /**
     * Constructor vacio
     */
    public TrabajadorEventual() {
    }

    /**
     * Constructor clase trabajador eventual
     * 
     * @param disponibilidad
     * @param correoElectronico
     */
    public TrabajadorEventual(String disponibilidad, String correoElectronico) {
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Constructor de trabajador tipo eventual con herencia
     * 
     * @param nombres
     * @param apellidos
     * @param run
     * @param telefono
     * @param edad
     * @param disponibilidad
     * @param correoElectronico
     */
    public TrabajadorEventual(String nombres, String apellidos, String run, String telefono, int edad,
            String disponibilidad, String correoElectronico) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Metodo toString
     * 
     * @return parametros y valores de la clase por consola
     */
    @Override
    public String toString() {
        return "TrabajadorEventual [disponibilidad=" + disponibilidad + ", correoElectronico=" + correoElectronico
                + "]";
    }

    // Getters and Setters
    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Muestra en panel los datos de: Disponibilidad | Correo electronico
     */
    @Override
    public void mostrarDatos() {
        // TODO Auto-generated method stub
        super.mostrarDatos();
        JOptionPane.showMessageDialog(null,
                "Disponibilidad: " + disponibilidad + " Correo electronico: " + correoElectronico);
    }
}
