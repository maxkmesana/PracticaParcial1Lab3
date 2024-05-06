package Usuarios.View;

import Libros.Model.Entity.Libro;
import Usuarios.Model.Entity.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class UView {
    public void printMsg(String msg){
        System.out.println(msg);
    }

    // C
    public Usuario create(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scn.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scn.nextLine();

        System.out.print("Ingrese el tipo de usuario: ");
        String tipo = scn.nextLine();


        return new Usuario(nombre,apellido,tipo);
    }

    // R
    public void view(Usuario usuario){
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido() + "\n");
        System.out.println("Tipo de usuario: " + usuario.getTipoUsuario() + "\n");
    }

    public void viewList(ArrayList<Usuario> lista){
        for(Usuario usuario : lista){
            view(usuario);
        }
    }

    // U
    public String searchUpdate(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el nombre del usuario para actualizar: ");

        return scn.nextLine();
    }

    public String updateNombre(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el nuevo nombre para el usuario: ");

        return scn.nextLine();
    }

    public String updateApellido(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el nuevo apellido para el usuario: ");

        return scn.nextLine();
    }

    // D
    public String delete(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el nombre del usuario que quiere eliminar: ");

        return scn.nextLine();
    }

}
