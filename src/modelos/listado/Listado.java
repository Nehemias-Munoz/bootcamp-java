package modelos.listado;

import modelos.usuario.Usuario;

import java.util.ArrayList;

public class Listado {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    /**
     * Constructor vacio
     */
    public Listado() {
    }

    //Getter and Setter
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void nuevoElementoLista(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void llamarAnalizarUsuario() {
        for (Usuario user : listaUsuarios) {
            user.analizarUsuario();
        }
    }
}
