package Usuarios.Model.Repository;

import Abstractas.Repositorio;
import Usuarios.Model.Entity.Usuario;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class URepository extends Repositorio<Usuario,String>{
    private final ArrayList<Usuario> lista;
    public URepository() {
        super();
        lista = getArrayList();
    }

    @Override
    public Usuario searchObjeto(String busqueda) {
        for(Usuario usuario : lista){
            if(usuario.getNombre().equals(busqueda)){
                return usuario;
            }
        }
        return  null;
    }


    public void updateUsuario(Usuario usuario, String nombre, String apellido){
        int index = lista.indexOf(usuario);

        usuario.setNombre(nombre);
        usuario.setApellido(apellido);

        lista.set(index, usuario);
    }
}
