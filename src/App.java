import javax.swing.JOptionPane;

import cliente.Cliente;
import usuario.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cliente cliente = new Cliente();
        cliente.setRut(JOptionPane.showInputDialog("Ingrese rut del cliente"));
        cliente.setNombres(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
        cliente.setApellidos(JOptionPane.showInputDialog("Ingrese el o los apellidos del cliente"));
        cliente.setTelefono(JOptionPane.showInputDialog("Ingrese telefono del cliente"));
        cliente.setAfp(JOptionPane.showInputDialog("Ingrese la afp del cliente"));
        cliente.setSistemaSalud(
                JOptionPane.showInputDialog("Ingrese el sistema de salud del cliente \n Fonasa \n Isapre"));
        cliente.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del cliente"));
        cliente.setComuna(JOptionPane.showInputDialog("Ingrese la comuna del cliente"));
        cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente")));

        // mostrar datos
        cliente.toString();

        Usuario usuario = new Usuario();
        usuario.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
        usuario.setFechaNacimiento(JOptionPane.showInputDialog("Ingrese la fecha nacimiento del cliente"));
        usuario.setRun(JOptionPane.showInputDialog("Ingrese Run del usuario: "));

        usuario.toString();
    }
}
