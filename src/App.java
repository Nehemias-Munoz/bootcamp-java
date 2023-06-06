import modelos.administrativo.Administrativo;
import modelos.cliente.Cliente;
import modelos.listado.Listado;
import modelos.profesional.Profesional;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        //Ejercicio g16
        Listado nuevoListado = new Listado();
        Cliente cliente3 = new Cliente("20329487-3", "Juan", "Perez", "3782482", "capital", "orompello 423", "Concepcion", 32, "isapre");
        Cliente cliente4 = new Cliente("28347234-2", "Alonso", "Rosas", "3423442", "habitad", "alicanto 323", "Talca", 72, "fonasa");
        Administrativo admin1 = new Administrativo("Aron", LocalDate.parse("1980-03-02"), "39824793-9", "ventas", "Vendedor en falabella");
        Administrativo admin2 = new Administrativo("Aron", LocalDate.parse("1980-03-02"), "39824793-9", "ventas", "Vendedor en falabella");
        Profesional profesional1 = new Profesional("Julio Meza", LocalDate.parse("1999-03-12"), "328974-2", "tecnico en telecomunicaciones", LocalDate.parse("2021-08-12"));

        nuevoListado.nuevoElementoLista(cliente3);
        nuevoListado.nuevoElementoLista(cliente4);
        nuevoListado.nuevoElementoLista(admin1);
        nuevoListado.nuevoElementoLista(admin2);
        nuevoListado.nuevoElementoLista(profesional1);

        nuevoListado.llamarAnalizarUsuario();
    }
}
