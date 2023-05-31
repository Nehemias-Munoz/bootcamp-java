package trabajadores;

public class Trabajador {
    // Atributos de la clase
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    /**
     * Constructor vacio
     */
    public Trabajador() {
    }

    /**
     * Constructor de la clase
     * 
     * @param nombres
     * @param apellidos
     * @param run
     * @param telefono
     * @param edad
     */
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    /**
     * Metodo mostrar datos
     * Muestra por consola el telefono y la edad del trabajador
     */
    public void mostrarDatos() {
        System.out.println("Telefono: " + this.telefono + " | Edad: " + this.edad);
    }

    /**
     * Metodo to String
     * 
     * @return parametros y valores de la clase
     */
    @Override
    public String toString() {
        return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", run=" + run + ", edad=" + edad + "]";
    }

    /**
     * Metodo nombre completo
     * 
     * @return Devuelve el nombre completo
     */
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    /**
     * Metodo descomponer run
     * 
     * @return Devuelve el rut sin digito verificador en tipo int
     */
    public int descomponerRun() {
        String[] runsStrings = run.split("-");
        int[] runInt = new int[2];
        runInt[0] = Integer.parseInt(runsStrings[0]);
        runInt[1] = Integer.parseInt(runsStrings[1]);
        return runInt[0];
    }

    // Getters and Setters
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

// Nehemias Muñoz