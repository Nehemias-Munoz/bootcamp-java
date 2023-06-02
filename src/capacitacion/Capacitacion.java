package capacitacion;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author nehemiasmunoz
 */
public class Capacitacion {
    private int id;
    private String rut;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private LocalTime duracion;
    private int cantidadAsistentes;

    /**
     * Constructor vacio
     */
    public Capacitacion() {
    }

    /**
     * Constructor de la clase con parametros
     * 
     * @param id
     * @param rut
     * @param dia
     * @param hora
     * @param lugar
     * @param duracion
     * @param cantidadAsistentes
     */
    public Capacitacion(int id, String rut, LocalDate dia, LocalTime hora, String lugar, LocalTime duracion,
            int cantidadAsistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Metodo que devuelve los parametros y valores del objeto
     */
    @Override
    public String toString() {
        return "Capacitacion [id=" + id + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
                + ", duracion=" + duracion + ", cantidadAsistentes=" + cantidadAsistentes + "]";
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Metodo que retorna informacion de la capacitacion
     * 
     * @return String con datos de la capacitacion
     */
    public String mostrarDetalle() {
        StringBuilder mensaje = new StringBuilder("La capacitacion será en ");
        mensaje.append(lugar);
        mensaje.append(" a las ");
        mensaje.append(hora);
        mensaje.append(" del día ");
        mensaje.append(dia);
        mensaje.append("Y durará ");
        mensaje.append(duracion);
        mensaje.append(" minutos");
        return mensaje.toString();
    }
}
