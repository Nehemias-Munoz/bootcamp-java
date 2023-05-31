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

}
