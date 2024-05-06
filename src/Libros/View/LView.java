package Libros.View;

import Libros.Model.Entity.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class LView {

    public void printMsg(String msg){
        System.out.println(msg);
    }

    // C
    public Libro createLibro(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el titulo del libro: ");
        String titulo = scn.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scn.nextLine();

        return new Libro(titulo,autor);
    }

    // R
    public void viewLibro(Libro libro){
        System.out.println("Titulo del libro: " + libro.getTitulo());
        System.out.println("Titulo del autor: " + libro.getAutor() + "\n");
    }

    public void viewLibroList(ArrayList<Libro> lista){
        for(Libro libro : lista){
            viewLibro(libro);
        }
    }

    // U
    public String searchLibroUpdate(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el titulo del libro para actualizar: ");

        return scn.nextLine();
    }

    public String updateTitulo(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el nuevo titulo para el libro: ");

        return scn.nextLine();
    }

    public String updateAutor(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el nuevo autor para el libro: ");

        return scn.nextLine();
    }

    // D
    public String deleteLibro(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el titulo del libro que quiere eliminar: ");

        return scn.nextLine();
    }

}
