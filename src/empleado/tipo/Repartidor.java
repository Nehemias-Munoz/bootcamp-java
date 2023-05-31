package empleado.tipo;

import empleado.Bono;
import empleado.Empleado;

/**
 * @author nehemiasmunoz
 */
public class Repartidor extends Empleado implements Bono {
    private String diponibilidadHoraria;

    /**
     * Constructor clase vacio
     */
    public Repartidor() {
    }

    /**
     * Constructor clase
     * 
     * @param diponibilidadHoraria
     */
    public Repartidor(String diponibilidadHoraria) {
        this.diponibilidadHoraria = diponibilidadHoraria;
    }

    /**
     * Constructo clase con herencia
     * 
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     * @param diponibilidadHoraria
     */
    public Repartidor(String nombre, String apellido, int edad, double salario, String diponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.diponibilidadHoraria = diponibilidadHoraria;
        bonoAdicional();
    }

    /**
     * Añade un bono de 30.000 al salario de los vendedores
     */
    @Override
    public void bonoAdicional() {
        super.setSalario(getSalario() + 50.000);
    }
}
