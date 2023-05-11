package trabajadores;

public class CargaFamiliar {
    private String runCarga;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private String parentesco;
    private int edad;

    enum Parentesco {
        Conyuge,
        Hijo,
        Otro
    }

    @Override
    public String toString() {
        return "Carga Familiar [Run Carga=" + runCarga + ", Nombres=" + nombres + ", Apellidos=" + apellidos
                + ", Run Familiar=" + runFamiliar + ", Parentesco=" + parentesco + ", Edad=" + edad + "]";
    }

    public CargaFamiliar(String runCarga, String nombres, String apellidos, String runFamiliar, String parentesco,
            int edad) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public CargaFamiliar() {
    }

    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
