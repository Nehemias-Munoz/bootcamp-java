package trabajadores;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, String run, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", run=" + run + ", edad=" + edad + "]";
    }

    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    public int descomponerRun() {
        String[] runsStrings = run.split("-");
        int[] runInt = new int[2];
        runInt[0] = Integer.parseInt(runsStrings[0]);
        runInt[1] = Integer.parseInt(runsStrings[1]);
        return runInt[0];
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

// Nehemias Muñoz