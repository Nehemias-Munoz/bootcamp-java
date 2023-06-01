import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import capacitacion.Capacitacion;
import cliente.Cliente;
import usuario.Usuario;

public class App {
        public static void main(String[] args) throws Exception {
                Cliente cliente = new Cliente();
                String rut;
                do {
                        rut = JOptionPane.showInputDialog("Ingrese rut del cliente \nSin puntos ni guion");
                } while (Integer.parseInt(rut) > 99999999);
                cliente.setRut(rut);
                cliente.setNombres(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
                cliente.setApellidos(JOptionPane.showInputDialog("Ingrese el o los apellidos del cliente"));
                cliente.setTelefono(JOptionPane.showInputDialog("Ingrese telefono del cliente"));
                cliente.setAfp(JOptionPane.showInputDialog("Ingrese la afp del cliente"));
                cliente.setSistemaSalud(
                                JOptionPane.showInputDialog(
                                                "Ingrese el sistema de salud del cliente \n Fonasa \n Isapre"));
                cliente.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del cliente"));
                cliente.setComuna(JOptionPane.showInputDialog("Ingrese la comuna del cliente"));
                cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente")));

                // mostrar datos
                cliente.toString();

                // Implementacion clase usuario
                Usuario usuario = new Usuario();
                usuario.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
                usuario.setFechaNacimiento(JOptionPane.showInputDialog("Ingrese la fecha nacimiento del cliente"));
                usuario.setRun(JOptionPane.showInputDialog("Ingrese Run del usuario: "));

                usuario.toString();

                // Implementacion clase capacitacion

                Capacitacion capacitacion = new Capacitacion();
                capacitacion.setId(1);
                capacitacion.setRut(JOptionPane.showInputDialog("Ingrese rut cliente"));
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

                capacitacion.toString();
        }
}
