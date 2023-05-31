package empleado.tipo;

import java.time.LocalDate;

import empleado.Bono;
import empleado.Empleado;

/**
 * @author nehemiasmunoz
 */
public class Vendedor extends Empleado implements Bono {
    LocalDate fechaInicioEmpresa;

    /**
     * Constructor vacio
     */
    public Vendedor() {
    }

    /**
     * Constructor de la clase
     * 
     * @param fechaInicioEmpresa
     */
    public Vendedor(LocalDate fechaInicioEmpresa) {
        this.fechaInicioEmpresa = fechaInicioEmpresa;
    }

    /**
     * Constructor de la clase con herencia
     * 
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     * @param fechaInicioEmpresa
     */
    public Vendedor(String nombre, String apellido, int edad, double salario, LocalDate fechaInicioEmpresa) {
        super(nombre, apellido, edad, salario);
        this.fechaInicioEmpresa = fechaInicioEmpresa;
    }

    @Override
    public void bonoAdicional() {
        if (super.getEdad() < 30) {
            super.setSalario(getSalario() + 15.000);
        } else {
            super.setSalario(getSalario() + 30.000);
        }
    }

}
