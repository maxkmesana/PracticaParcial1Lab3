package Libros.Model.Repository;

import Libros.Model.Entity.Libro;

import java.util.ArrayList;

public class LRepository {
    private final ArrayList<Libro> lista;

    // C (constructor, aniadir a lista)
    public LRepository(){
        lista = new ArrayList<>();
    }

    public void addLibro(Libro libro){
        lista.add(libro);
    }

    // R (get lista, buscar elemento [x id])

    public ArrayList<Libro> getLista() {
        return lista;
    }

    public Libro searchLibro(String titulo){
        for(Libro libro : lista){
            if(libro.getAutor().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    // U (mediante campos del View [Metod 1])
    public void updateLibro(Libro libro, String titulo, String autor){
        int index = lista.indexOf(libro);
        libro.setTitulo(titulo);
        libro.setAutor(autor);

        lista.set(index, libro);
    }

    // D (delete)
    public void deleteLibro(Libro eliminar){
        lista.remove(eliminar);
    }
}
