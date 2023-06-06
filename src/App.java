import capacitacion.Capacitacion;
import modelos.cliente.Cliente;
import usuario.Usuario;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        String rut;
        do {
            rut = JOptionPane.showInputDialog("Ingrese rut del modelos.cliente \nSin puntos ni guion");
        } while (Integer.parseInt(rut) > 99999999);
        cliente.setRut(rut);
        cliente.setNombres(JOptionPane.showInputDialog("Ingrese el nombre del modelos.cliente"));
        cliente.setApellidos(JOptionPane.showInputDialog("Ingrese el o los apellidos del modelos.cliente"));
        cliente.setTelefono(JOptionPane.showInputDialog("Ingrese telefono del modelos.cliente"));
        cliente.setAfp(JOptionPane.showInputDialog("Ingrese la afp del modelos.cliente"));
        cliente.setSistemaSalud(
                JOptionPane.showInputDialog(
                        "Ingrese el sistema de salud del modelos.cliente \nFonasa \n Isapre"));
        cliente.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del modelos.cliente"));
        cliente.setComuna(JOptionPane.showInputDialog("Ingrese la comuna del modelos.cliente"));
        cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del modelos.cliente")));

        // mostrar datos
        JOptionPane.showMessageDialog(null, cliente.toString());

        // Implementacion clase usuario
        Usuario usuario = new Usuario();
        usuario.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del usuario"));
        String fechaNacimiento;
        fechaNacimiento = JOptionPane
                .showInputDialog("Ingrese la fecha nacimiento del usuario \n Formato: Año-Mes-Dia");
        usuario.setFechaNacimiento(LocalDate.parse(fechaNacimiento));
        usuario.setRun(JOptionPane.showInputDialog("Ingrese el run del usuario:"));

        JOptionPane.showMessageDialog(null, usuario.toString());
        JOptionPane.showMessageDialog(null, usuario.mostrarEdad());

        // Implementacion clase capacitacion

        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setId(1);
        capacitacion.setRut(JOptionPane.showInputDialog("Ingrese rut modelos.cliente de la capacitacion"));
        capacitacion.setDia(
                LocalDate.parse(
                        JOptionPane.showInputDialog(
                                "Ingrese fecha de la capacitacion \n Formato: año-mes-dia")));
        capacitacion.setHora(LocalTime
                .parse(JOptionPane.showInputDialog(
                        "Ingrese la hora de la capacitacion \n Formato: Hora:Minuto")));
        capacitacion.setLugar(JOptionPane.showInputDialog("Ingrese el lugar de la capacitacion"));
        capacitacion.setDuracion(LocalTime
                .parse(JOptionPane.showInputDialog(
                        "Ingrese la duracion de la capacitacion \n Formato: Hora:Minuto")));
        capacitacion.setCantidadAsistentes(
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistentes")));

        JOptionPane.showMessageDialog(null, capacitacion.toString());

        // Segunda instacias
        Usuario usuario2 = new Usuario("Juan", LocalDate.parse("1996-05-12"), "98372498-8");

        Cliente cliente2 = new Cliente("7398172-9", "Jose Antonio", "Lopez Ramirez", "98273", "capital",
                "Calle falsa 123", "San Antonio", 54, "fonasa");
        Capacitacion capacitacion2 = new Capacitacion(2, "129783-3", LocalDate.now(), LocalTime.now(),
                "Los angeles", LocalTime.parse("03:00"), 10);

        JOptionPane.showMessageDialog(null, usuario2.toString());
        JOptionPane.showMessageDialog(null, cliente2.toString());
        JOptionPane.showMessageDialog(null, capacitacion2.toString());
        usuario2.setNombre("Camilo");
        cliente2.setAfp("Habitad");
        capacitacion2.setCantidadAsistentes(8);

        StringBuilder nuevosDatos = new StringBuilder("Datos usuario");
        nuevosDatos.append(usuario2.getNombre());
        nuevosDatos.append("\n");
        nuevosDatos.append(usuario2.getRun());
        nuevosDatos.append("\n");
        nuevosDatos.append(usuario2.getFechaNacimiento());
        nuevosDatos.append("\n");
        nuevosDatos.append("Datos modelos.cliente");
        nuevosDatos.append("\n");
        nuevosDatos.append(cliente2.getNombres());
        nuevosDatos.append("\n");
        nuevosDatos.append(cliente.getApellidos());
        nuevosDatos.append("\n");
        nuevosDatos.append(cliente.getSistemaSalud());
        nuevosDatos.append("\n");
        nuevosDatos.append(capacitacion2.getId());
        nuevosDatos.append("\n");
        nuevosDatos.append(capacitacion2.getLugar());
        nuevosDatos.append("\n");
        nuevosDatos.append(capacitacion2.getCantidadAsistentes());
        nuevosDatos.append("\n");

        JOptionPane.showMessageDialog(null, nuevosDatos);
        JOptionPane.showMessageDialog(null, usuario2.mostrarEdad());
        JOptionPane.showMessageDialog(null, cliente2.obtenerNombre());
        JOptionPane.showMessageDialog(null, cliente2.obtenerSistemaSalud());
        JOptionPane.showMessageDialog(null, capacitacion2.mostrarDetalle());

    }
}
