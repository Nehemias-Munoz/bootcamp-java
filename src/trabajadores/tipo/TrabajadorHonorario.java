package trabajadores.tipo;

import trabajadores.Trabajador;

/**
 * @author nehemiasmunoz
 * Clase que extiende de Trabajador general y agrega 2 atributos nuevos
 */
public class TrabajadorHonorario extends Trabajador {
    private String giro;
    private String añoIniciacionActividades;

    /**
     * Constructor Vacio
     * */
    public TrabajadorHonorario() {
    }

    /**
     * Constructor clase trabajador
     * @param giro
     * @param añoIniciacionActividades
     * */
    public TrabajadorHonorario(String giro, String añoIniciacionActividades) {
        this.giro = giro;
        this.añoIniciacionActividades = añoIniciacionActividades;
    }

    /**
     *Constructor de trabajador tipo honorario con herencia
     * @param nombres
     * @param apellidos
     * @param run
     * @param telefono
     * @param edad
     * @param giro
     * @param añoIniciacionActividades
     * */
    public TrabajadorHonorario(String nombres, String apellidos, String run, String telefono, int edad, String giro,
            String añoIniciacionActividades) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.añoIniciacionActividades = añoIniciacionActividades;
    }

    /**
     * Metodo toString
     * @return parametros y valores de la clase
     */
    @Override
    public String toString() {
        return "TrabajadorHonorario{" +
                "giro='" + giro + '\'' +
                ", añoIniciacionActividades='" + añoIniciacionActividades + '\'' +
                '}';
    }

    //Getters and Setters
    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getAñoIniciacionActividades() {
        return añoIniciacionActividades;
    }

    public void setAñoIniciacionActividades(String añoIniciacionActividades) {
        this.añoIniciacionActividades = añoIniciacionActividades;
    }
}
