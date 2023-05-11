import trabajadores.Trabajador;

public class App {
    public static void main(String[] args) throws Exception {
        Trabajador trabajador1 = new Trabajador();
        Trabajador trabajador2 = new Trabajador("Nehemias Marvic", "Muñoz Monsalves", "20161653-0", 23);
        System.out.println(trabajador2.nombreCompleto());
        System.out.println(trabajador2.descomponerRun());
    }
}
