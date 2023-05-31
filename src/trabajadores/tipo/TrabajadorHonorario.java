package trabajadores.tipo;

import javax.swing.JOptionPane;

import trabajadores.Trabajador;

/**
 * @author nehemiasmunoz
 *         Clase que extiende de Trabajador general y agrega 2 atributos nuevos
 */
public class TrabajadorHonorario extends Trabajador {
    private String giro;
    private int anioIniciacionActividades;

    /**
     * Constructor Vacio
     */
    public TrabajadorHonorario() {
    }

    /**
     * Constructor clase trabajador
     * 
     * @param giro
     * @param anioIniciacionActividades
     */
    public TrabajadorHonorario(String giro, int anioIniciacionActividades) {
        this.giro = giro;
        this.anioIniciacionActividades = anioIniciacionActividades;
    }

    /**
     * Constructor de trabajador tipo honorario con herencia
     * 
     * @param nombres
     * @param apellidos
     * @param run
     * @param telefono
     * @param edad
     * @param giro
     * @param anioIniciacionActividades
     */
    public TrabajadorHonorario(String nombres, String apellidos, String run, String telefono, int edad, String giro,
            int anioIniciacionActividades) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacionActividades = anioIniciacionActividades;
    }

    /**
     * Metodo toString
     * 
     * @return parametros y valores de la clase
     */
    @Override
    public String toString() {
        return "Trabajador Honorario{" +
                "giro ='" + giro + '\'' +
                ", año iniciacion actividades ='" + anioIniciacionActividades + '\'' +
                '}';
    }

    // Getters and Setters
    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnioIniciacionActividades() {
        return anioIniciacionActividades;
    }

    public void setAnioIniciacionActividades(int anioIniciacionActividades) {
        this.anioIniciacionActividades = anioIniciacionActividades;
    }

    /**
     * Muestra por consola los datos de: Giro | Año de inicio actividades
     */
    @Override
    public void mostrarDatos() {
        // TODO Auto-generated method stub
        super.mostrarDatos();
        JOptionPane.showMessageDialog(null, "Giro: " + giro + " Año Inicio Actividades: " + anioIniciacionActividades);
    }
}
