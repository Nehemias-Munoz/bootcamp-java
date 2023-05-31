package trabajadores.tipo;

import javax.swing.JOptionPane;

import trabajadores.Trabajador;

public class TrabajadorContratado extends Trabajador {
    // atributos clase
    private String fechaIngreso;
    private double salario;

    /**
     * Constructor vacio
     */
    public TrabajadorContratado() {
    }

    /**
     * Constructor de la clase
     * 
     * @param fechaIngreso
     * @param salario
     */
    public TrabajadorContratado(String fechaIngreso, double salario) {
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    /**
     * Constructor de trabajador tipo contratado con herencia
     * 
     * @param nombres
     * @param apellidos
     * @param run
     * @param telefono
     * @param edad
     * @param fechaIngreso
     * @param salario
     */
    public TrabajadorContratado(String nombres, String apellidos, String run, String telefono, int edad,
            String fechaIngreso, double salario) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    /**
     * Metodo toString
     * 
     * @return parametros y valores de la clase por consola
     */
    @Override
    public String toString() {
        return "TrabajadorContratado [fechaIngreso=" + fechaIngreso + ", salario=" + salario + "]";
    }

    // Getters and Setters
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Muestra por consola los datos de: Fecha ingreso | Salario
     */
    @Override
    public void mostrarDatos() {
        // TODO Auto-generated method stub
        super.mostrarDatos();
        JOptionPane.showMessageDialog(null,
                "Fecha ingreso: " + fechaIngreso + " Salario: " + salario);
    }
}
