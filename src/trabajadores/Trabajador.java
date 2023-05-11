package trabajadores;

public class Trabajador {
    String nombres;
    String apellidos;
    String run;
    int edad;

    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, String run, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.edad = edad;
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
}
