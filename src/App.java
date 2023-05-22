import trabajadores.Trabajador;

public class App {
    public static void main(String[] args) throws Exception {
        Trabajador trabajador1 = new Trabajador();
        Trabajador trabajador2 = new Trabajador("Nehemias Marvic", "Muñoz Monsalves", "20161653-0","287983424", 23);
        trabajador2.mostrarDatos();
        System.out.println(trabajador2.nombreCompleto());
        System.out.println(trabajador2.descomponerRun());
    }
}
