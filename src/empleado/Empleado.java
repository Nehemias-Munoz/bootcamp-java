package empleado;

/**
 * @author nehemiasmunoz
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    /**
     * Constructor clase vacio
     */
    public Empleado() {
    }

    /**
     * Constructo clase
     * 
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     */
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
